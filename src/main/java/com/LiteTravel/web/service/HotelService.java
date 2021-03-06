package com.LiteTravel.web.service;

import com.LiteTravel.web.DTO.*;
import com.LiteTravel.web.DTO.Hotel.HotelRoomSearchDTO;
import com.LiteTravel.web.DTO.HotelOrder.HotelOrderDetailDTO;
import com.LiteTravel.web.Model.*;
import com.LiteTravel.web.mapper.*;
import com.LiteTravel.web.service.Utils.JDBCUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class
HotelService {

    @Resource
    public HotelMapper hotelMapper;

    @Resource
    public RoomMapper roomMapper;

    @Resource
    public RoomBedMapMapper roomBedMapper;

    @Resource
    public BedMapper bedMapper;

    @Resource
    public RegionMapper regionMapper;

    @Resource
    private HotelManagerMapper hotelManagerMapper;


    @Resource
    public HotelOrderMapper hotelOrderMapper;

    @Resource
    public HotelOrderDetailMapper hotelOrderDetailMapper;
    // 默认酒店列表
//    @Cacheable(cacheNames = {"hotels"}, key = "#page")
    public ResultVO getHotels(Integer page, Integer pageSize){
        return selectByExample(page, pageSize, new HotelExample());
    }
    public ResultVO getHotelsByManagerId(Integer page, Integer pageSize, Integer managerId){
        HotelExample hotelExample = new HotelExample();
        hotelExample.createCriteria().andHotelManagerIdEqualTo(managerId);
        return selectByExample(page, pageSize, hotelExample);
    }

    public ResultVO getHotels(Integer page, Integer pageSize, HotelQueryDTO hotelQueryDTO){
        return selectByExample(page, pageSize, getHotelExample(hotelQueryDTO));
    }

    // 推荐酒店
    public ResultVO getHotels(Integer hotelId, Integer page, Integer pageSize)
    {
        HotelExample hotelExample = new HotelExample();
//      todo 推荐算法尚未写好
        hotelExample.createCriteria()
                .andHotelIdNotEqualTo(hotelId);
        return selectByExample(page, pageSize, hotelExample);
}

    private ResultVO selectByExample(Integer page, Integer pageSize, HotelExample hotelExample){
        /* 分页：
         * 参数1: 第几页
         * 参数2: 每页展示几个数据 */
        PageHelper.startPage(page, pageSize);
        List<Hotel> hotels = hotelMapper.selectByExample(hotelExample);
        PageInfo<Hotel> info = new PageInfo<>(hotels, 5);
        if (hotels.size() > 0) {
            List<Integer> addressIds = hotels.stream().map(Hotel::getHotelAddress).distinct().collect(Collectors.toList());
            RegionExample regionExample = new RegionExample();
            regionExample.createCriteria()
                    .andIdIn(addressIds);
            List<Region> regions = regionMapper.selectByExample(regionExample);
            Map<Integer, String> addressMap = regions.stream().collect(Collectors.toMap(Region::getId, Region::getMername));
            List<HotelDTO> data = hotels.stream().map(hotel -> {
                HotelDTO hotelDTO = new HotelDTO();
                BeanUtils.copyProperties(hotel, hotelDTO);
                // 写入地址数据 hotelTotalAddress;
                String addressString = addressMap.get(hotel.getHotelAddress());
                hotelDTO.setHotelAddressString(addressString.substring(addressString.indexOf("省,") + 2));
                return hotelDTO;
            }).collect(Collectors.toList());
            return new ResultVO(data, info);
        }
        return new ResultVO( new ArrayList<HotelDTO>(), info);
    }

    // 展现酒店单页
    public HotelDTO selectHotelById(Integer hotelId, boolean roomFlag, HotelRoomSearchDTO hotelRoomSearchDTO){
        Hotel hotel = hotelMapper.selectByPrimaryKey(hotelId);
        HotelDTO hotelDTO = JDBCUtils.initHotelDTO(regionMapper, hotel);
        // 判断是否需要room数据, 借此获得Room数据
        if(roomFlag){
            RoomExample roomExample = new RoomExample();
            RoomExample.Criteria criteria = roomExample.createCriteria();
            criteria.andHotelIdEqualTo(hotelId);
            Date checkIn = hotelRoomSearchDTO.getCheckIn();
            Date checkOut = hotelRoomSearchDTO.getCheckOut();
            List<RoomDTO> rooms = roomMapper.selectByExample(roomExample).stream().map(this::getRoomDTO).collect(Collectors.toList());
            List<Integer> roomIds = rooms.stream().map(RoomDTO::getRoomId).distinct().collect(Collectors.toList());
            /* 更新时间段剩余房间数 */
            List<Integer> roomRemaining = getRemainRooms(checkIn, checkOut, hotelId, roomIds);
            /* lambda语法: foreach, 逐个设置房间剩余数*/
            IntStream.range(0, roomRemaining.size()).forEach(index -> rooms.get(index).setRoomRemaining(roomRemaining.get(index)));


            hotelDTO.setRooms(rooms);
        }
        return hotelDTO;
    }
    public RoomDTO getRoomDTO(Integer roomId){
        return getRoomDTO(roomMapper.selectByPrimaryKey(roomId));
    }

    public List<HotelOrderDetailDTO> getHotelOrderDetailByRoomIds(List<Integer> roomIds) {
        List<RoomDTO> roomDTOs = getRoomDTObyIds(roomIds);
        return roomDTOs.stream().map(roomDTO -> {
            HotelOrderDetailDTO hotelOrderDetailDTO = new HotelOrderDetailDTO();
            BeanUtils.copyProperties(roomDTO, hotelOrderDetailDTO);
            return hotelOrderDetailDTO;
        }).collect(Collectors.toList());
    }

    public List<RoomDTO> getRoomDTObyIds(List<Integer> roomIds) {
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria()
                .andRoomIdIn(roomIds);
        return getRoomDTOs(roomMapper.selectByExample(roomExample));
    }

    private RoomDTO getRoomDTO(Room room){
        RoomDTO roomDTO = new RoomDTO();
        BeanUtils.copyProperties(room, roomDTO);

        // 获取roomBedMap
        RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
        roomBedMapExample.createCriteria()
                .andRoomIdEqualTo(room.getRoomId());
        List<RoomBedMap> roomBedMaps = roomBedMapper.selectByExample(roomBedMapExample);
        List<Integer> bedIds = roomBedMaps.stream().map(RoomBedMapKey::getBedId).distinct().collect(Collectors.toList());
        if(bedIds.size() > 0){
            // 获取bed
            List<BedDTO> beds = getBedsByMap(bedIds, roomBedMaps);
            roomDTO.setBeds(beds);
        }
        return roomDTO;
    }

    private List<RoomDTO> getRoomDTOs(List<Room> rooms){
        return rooms.stream().map(this::getRoomDTO).collect(Collectors.toList());
    }

    /*-----------------------------------------------------------------------------*/
    /*数据获取域*/
    /*-------------------------------------------------*/
    //获取管理员管理酒店的房间数据
    private RoomDTO getManagerRoomDTO(Room room){
        RoomDTO roomDTO = new RoomDTO();
        BeanUtils.copyProperties(room, roomDTO);
        return roomDTO;
    }
    private List<RoomDTO> getManagerRoomDTOs(List<Room> rooms){
        return rooms.stream().map(this::getManagerRoomDTO).collect(Collectors.toList());
    }
    //通过管理员ID获取他管理所有酒店Id
    public List<Integer> getHotelByManagerId(Integer managerId){
        HotelExample hotelExample = new HotelExample();
        hotelExample.createCriteria().andHotelManagerIdEqualTo(managerId);
        List<Hotel> hotels = hotelMapper.selectByExample(hotelExample);
        //通过管理员id得到的他管理的所有酒店id
        return hotels.stream().map(Hotel::getHotelId).distinct().collect(Collectors.toList());
    }
    public List<Hotel> getHotelsByManagerId(Integer managerId){
        HotelExample hotelExample = new HotelExample();
        hotelExample.createCriteria().andHotelManagerIdEqualTo(managerId);
        //通过管理员id得到的他管理的所有酒店id
        return hotelMapper.selectByExample(hotelExample);
    }
    public ResultVO getAllRooms(Integer page, Integer pageSize,Integer managerId){

        List<Integer> hotelId = getHotelByManagerId(managerId);
        //创建总rooms对象保存所有查找到的room
        List<Room> rooms = new ArrayList<>();
        //保存一个hotel中所有room
        List<Room> room  = new ArrayList<>();
        RoomExample roomExample = new RoomExample();
        for (Integer integer : hotelId) {
            roomExample.createCriteria().andHotelIdEqualTo(integer);
            room = roomMapper.selectByExample(roomExample);
            //将一个hotel中所有room保存到rooms中
            rooms.addAll(room);
            //新建对象，重新查找，原对象会在jvm中自动销毁
            roomExample = new RoomExample();
        }

        PageHelper.startPage(page, pageSize);
        PageInfo<Room> info = new PageInfo<>(rooms, 5);
        List<RoomDTO> data = getManagerRoomDTOs(rooms);
        return new ResultVO(data,info);
    }

    /*-------------------------------------------------*/
    //获取酒店床位数据
    public void getRoomBeds(Integer page, Integer pageSize, Integer roomId, ModelMap model,HttpSession session){
        PageHelper.startPage(page, pageSize);
        // 获取roomBedMap
        RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
        roomBedMapExample.createCriteria()
                .andRoomIdEqualTo(roomId);
        List<RoomBedMap> roomBedMaps = roomBedMapper.selectByExample(roomBedMapExample);

        //有床位则获取，没有床位则直接跳过
        if (roomBedMaps.size() > 0) {
            List<Integer> bedIds = roomBedMaps.stream().map(RoomBedMapKey::getBedId).distinct().collect(Collectors.toList());
            // 获取bed
            List<BedDTO> beds = getBedsByMap(bedIds, roomBedMaps);
            PageInfo<RoomBedMap> info = new PageInfo<>(roomBedMaps, 5);
            model.addAttribute("roomBeds",beds);
            model.addAttribute("pageInfo",info);
        }
        model.addAttribute("roomIdForRoomBed",roomId);
        //获取床列表，添加床型从床列表中获取
        List<Bed> bedList = bedMapper.selectByExample(new BedExample());
        session.setAttribute("bedList",bedList);

    }

    private List<BedDTO> getBedsByMap(List<Integer> bedIds, List<RoomBedMap> roomBedMaps){
        BedExample bedExample = new BedExample();
        bedExample.createCriteria()
                .andBedIdIn(bedIds);
        List<Bed> bedList = bedMapper.selectByExample(bedExample);
        // 获取bedCount
        Map<Integer, Integer> bedCountMap = roomBedMaps.stream().collect(Collectors.toMap(RoomBedMapKey::getBedId, RoomBedMap::getBedCount));
        // bed和bedCount写入bedDTO
        return bedList.stream().map(bed -> {
            BedDTO bedDTO = new BedDTO();
            BeanUtils.copyProperties(bed, bedDTO);
            bedDTO.setBedCount(bedCountMap.get(bed.getBedId()));
            return bedDTO;
        }).collect(Collectors.toList());
    }

    /*-------------------------------------------------*/
    //获取床位数据
    private BedDTO getBedDTO(Bed bed) {
        BedDTO bedDTO = new BedDTO();
        BeanUtils.copyProperties(bed, bedDTO);
        return bedDTO;
    }
    public ResultVO getAllBeds(Integer page, Integer pageSize){
        PageHelper.startPage(page,pageSize);
        List<Bed> beds = bedMapper.selectByExample(new BedExample());
        PageInfo<Bed> info = new PageInfo<>(beds, 5);
        List<BedDTO> data = beds.stream().map(this::getBedDTO).collect(Collectors.toList());
        return new ResultVO(data, info);
    }
    /*-----------------------------------------------------------------------------*/
    //酒店增刪改方法
    public int checkHotelId(HotelDTO hotelDTO){
        //查询hotelHTO是否包含hotelId值，如果包含表示是更新方法，否则是插入方法返回0
        if(hotelDTO.getHotelId() == null){
            return 0;
        }
        return 1;
    }
    //根據酒店名称查询酒店是否存在，存在则返回0.不存在返回1
    public List<Hotel> checkHotelByName(HotelDTO hotelDTO){
        String hotelName = hotelDTO.getHotelName();
        HotelExample hotelExample = new HotelExample();
        // 逆向工程方法，查询条件，相当于where语句
        hotelExample.createCriteria()
                .andHotelNameEqualTo(hotelName);
        return hotelMapper.selectByExample(hotelExample);
    }
    //删除，接收传递过来的id值进行数据库修改
    public int deleteHotel(Integer hotelId){
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        criteria.andHotelIdEqualTo(hotelId);
        List<Room> rooms = new ArrayList<>();
        //rooms是需要的对象
        rooms = roomMapper.selectByExample(roomExample);
        //取出来hotel中的对应的room_id值，进行接下来的删除操作
        List<Integer> roomIds = rooms.stream().map(Room::getRoomId).distinct().collect(Collectors.toList());
        //遍历room_id，逐个删除room_id对应的bed和room
        for (Integer roomId : roomIds) {
            //list为集合的对象名
            RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
            roomBedMapExample.createCriteria()
                    .andRoomIdEqualTo(roomId);
            roomBedMapper.deleteByExample(roomBedMapExample);
            roomMapper.deleteByPrimaryKey(roomId);
        }
        return hotelMapper.deleteByPrimaryKey(hotelId);
    }
    //修改酒店數據
    public int updateHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        //利用反射属性对JavaBean进行处理，简单说就是将hotelDto转化成hotel类
        BeanUtils.copyProperties(hotelDTO, hotel);
        HotelExample hotelExample = new HotelExample();
        hotelExample.createCriteria()
                .andHotelIdEqualTo(hotel.getHotelId());
        //酒店图片设置默认值，count初始值设置为0
        hotel.setHotelImgUri("hotel-1.jpg");
        hotel.setHotelReplyCount(0);
        int result = 0;
            result = hotelMapper.updateByExampleSelective(hotel, hotelExample);
        return result;
    }
    //添加数据
    public int insertHotel(HotelDTO hotelDTO){
        Hotel hotel = new Hotel();
        //利用反射属性对JaveBean进行处理，简单说就是将hotelDto转化成hotel类
        BeanUtils.copyProperties(hotelDTO, hotel);
        //设置默认值
        hotel.setHotelImgUri("hotel-1.jpg");
        hotel.setHotelReplyCount(0);
        hotel.setHotelManagerId(hotelDTO.getUserId());
        int insert = hotelMapper.insert(hotel);
        Integer hotelId = hotel.getHotelId();
        HotelManager hotelManager = new HotelManager();
        hotelManager.setHotelManagerId(hotelDTO.getUserId());
        hotelManager.setHotelManagerName(hotelDTO.getUserName());
        hotelManager.setHotelManagerPhone(hotelDTO.getHotelPhone());
        System.out.println(hotelDTO.toString());
        hotelManager.setHotelId(hotelId);
        HotelManager hotelManager1 = hotelManagerMapper.selectByPrimaryKey(hotelDTO.getUserId());
        if(hotelManager1 == null){
            hotelManagerMapper.insert(hotelManager);
        }
        return insert;
    }

    /*-----------------------------------------------------------------------------*/
    //酒店房间增删改方法
    //判断传递的roomId是否为空，如果是修改必有roomId，如果是初次添加必不可能有roomId
    public int checkRoomId(RoomDTO roomDTO){
        if (roomDTO.getRoomId() == null){
            return 0;
        }
        return 1;
    }
    //删除，接收传递过来的id值进行数据库修改
    public int deleteRoom(Integer roomId){
        RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
        roomBedMapExample.createCriteria()
                .andRoomIdEqualTo(roomId);
        roomBedMapper.deleteByExample(roomBedMapExample);
        return roomMapper.deleteByPrimaryKey(roomId);
    }
    //添加
    public int insertRoom(RoomDTO roomDTO){
        Room room = new Room();
        BeanUtils.copyProperties(roomDTO,room);
        return roomMapper.insert(room);
    }
    //更新
    public int updateRoom(RoomDTO roomDTO){
        Room room = new Room();
        BeanUtils.copyProperties(roomDTO,room);
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria()
                .andRoomIdEqualTo(room.getRoomId());
        return roomMapper.updateByExample(room, roomExample);
    }


    /*------------------------------------------*/
    //酒店床位编辑
    //添加
    public void insertRoomBed(BedDTO bedDTO){

        //BedId 保存的是 roomId
        Integer roomId = bedDTO.getBedId();
        String bedName = bedDTO.getBedName();
        Integer bedCount = bedDTO.getBedCount();

        //通过bedName 查找出 beds列表，如果不存在两个bedName则只有一个bedId
        BedExample bedExample = new BedExample();
        bedExample.createCriteria().andBedNameEqualTo(bedName);
        List<Bed> beds = bedMapper.selectByExample(bedExample);

        //在beds列表中取出来bedId
        List<Integer> bedIds = beds.stream().map(Bed::getBedId).distinct().collect(Collectors.toList());
        Integer bedId = bedIds.get(0);

        //通过roomId 和 bedId查找roomBed对应对象
        RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
        roomBedMapExample.createCriteria()
                .andRoomIdEqualTo(roomId).andBedIdEqualTo(bedId);
        List<RoomBedMap> roomBedMaps = roomBedMapper.selectByExample(roomBedMapExample);

        //赋值
        RoomBedMap roomBedMap = new RoomBedMap();
        roomBedMap.setBedId(bedId);
        roomBedMap.setRoomId(roomId);

        //获取床位数量，如果上面列表为空表示一张都没有，有数据则表示有一张或者以上
        //有不只一张，添加数量
        if(roomBedMaps.size()>0){
            //得到原来的bedCount数量
            List<Integer> bedCounts = roomBedMaps.stream().map(RoomBedMap::getBedCount).distinct().collect(Collectors.toList());
            Integer count = bedCounts.get(0);
            count = count +bedCount;
            roomBedMap.setBedCount(count);
            roomBedMapper.updateByExample(roomBedMap,roomBedMapExample);
        }
        //一张都没有则新建
        else{
            roomBedMap.setBedCount(bedCount);
            roomBedMapper.insert(roomBedMap);
        }
    }
    //删除
    public void deleteRoomBed(RoomBedDTO roomBedDTO){

        Integer bedId = roomBedDTO.getBedId();
        Integer roomId = roomBedDTO.getRoomId();

        //通过roomId 和 bedId 得到要减少的对象
        RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
        roomBedMapExample.createCriteria()
                .andRoomIdEqualTo(roomId).andBedIdEqualTo(bedId);
        List<RoomBedMap> roomBedMaps = roomBedMapper.selectByExample(roomBedMapExample);

        //获取床位数量信息,因为上面获取到的对应对象只有一个，所以床位数量也只有一个，且bedCount>=1（删除应该能查询到床位数据）
        List<Integer> bedCount = roomBedMaps.stream().map(RoomBedMap::getBedCount).distinct().collect(Collectors.toList());
        Integer count = bedCount.get(0);

        //只有一张，直接删除
        if(count == 1){
            roomBedMapper.deleteByExample(roomBedMapExample);
        }
        else{
            count = count -1;
            RoomBedMap roomBedMap = new RoomBedMap();
            roomBedMap.setBedCount(count);
            roomBedMap.setBedId(bedId);
            roomBedMap.setRoomId(roomId);
            roomBedMapper.updateByExample(roomBedMap,roomBedMapExample);
        }
    }

    /*-----------------------------------------------------------------------------*/
    //床位增删改方法
    public void insertBed(Bed bed){
        bedMapper.insert(bed);
    }
    public void updateBed(Bed bed){
        BedExample bedExample = new BedExample();
        bedExample.createCriteria().andBedIdEqualTo(bed.getBedId());
        bedMapper.updateByExample(bed, bedExample);
    }
    public void deleteBed(Integer bedId){

        RoomBedMapExample roomBedMapExample = new RoomBedMapExample();
        roomBedMapExample.createCriteria()
                .andBedIdEqualTo(bedId);
        List<RoomBedMap> roomBeds = roomBedMapper.selectByExample(roomBedMapExample);

        if (roomBeds.size()>0){
//            System.out.println("这里应该反馈个信息说明床型在酒店房间使用中，不可以删除");
            System.out.println();
        }
        else{
            bedMapper.deleteByPrimaryKey(bedId);
        }

    }

    /*-----------------------------------------------------------------------------*/
    private  HotelExample getHotelExample(HotelQueryDTO query) {

        String keyword = query.getKeyword();
        Integer minPrice = query.getMinPrice();
        Integer maxPrice = query.getMaxPrice();
        String address = query.getAddress();

        HotelExample hotelExample = new HotelExample();
        RegionExample regionExample = new RegionExample();

        //写两个是因为要做关键字的并列查询（酒店名和简介）,keyword存在时将两个条件并列返回，否则只返回一个条件
        HotelExample.Criteria hotelExampleCriteria = hotelExample.createCriteria();
        HotelExample.Criteria hotelExampleCriteria1 = hotelExample.createCriteria();

        if (address != null && address.length() > 0) {

            //格式化地址选择器传来的地址信息，只取城市
            address = address.split("/")[1];
            regionExample.createCriteria().andNameLike("%" + address + "%");

            //获取4位地址id，通过范围选择包括下面的区县
            int regionId = regionMapper.selectByExample(regionExample).get(0).getId() / 100;
            hotelExampleCriteria.andHotelAddressBetween(regionId * 100, regionId * 100 + 99);
            hotelExampleCriteria1.andHotelAddressBetween(regionId * 100, regionId * 100 + 99);
        }
        if (minPrice != null) {
            hotelExampleCriteria.andHotelMinPriceGreaterThanOrEqualTo(minPrice);
            hotelExampleCriteria1.andHotelMinPriceGreaterThanOrEqualTo(minPrice);
        }
        if (maxPrice != null) {
            hotelExampleCriteria.andHotelMinPriceLessThanOrEqualTo(maxPrice);
            hotelExampleCriteria1.andHotelMinPriceLessThanOrEqualTo(maxPrice);
        }
        if (keyword != null) {
            hotelExampleCriteria.andHotelNameLike("%" + keyword + "%");
            hotelExampleCriteria1.andHotelDescriptionLike("%" + keyword + "%");
            hotelExample.or(hotelExampleCriteria1);
        }
        return hotelExample;
    }

    /**
     * 获取酒店的所有房间类型
     * @param hotelId 酒店id
     * @return roomType 房间类型列表
     */
    public List<Integer> getRoomType(Integer hotelId) {

        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andHotelIdEqualTo(hotelId);
        List<Room> rooms = roomMapper.selectByExample(roomExample);
        return rooms.stream().map(Room::getRoomId).distinct().collect(Collectors.toList());
    }

    /**
     * 查询酒店某个房间类型的剩余数量
     * @param startTime 起始时间
     * @param endTime 终止时间
     * @param hotelId 酒店id
     * @param roomId 房间类型Id
     * @return remain 对应时间段内，该酒店该房间类型的剩余数目
     */
    public Integer getRemainRoom(Date startTime, Date endTime, Integer hotelId, Integer roomId) {

        //返回值
        Integer remainRoom = roomMapper.selectByPrimaryKey(roomId).getRoomMax();

        /* 获取相关房间类型的订单id */
        HotelOrderDetailExample hotelOrderDetailExample = new HotelOrderDetailExample();
        hotelOrderDetailExample.createCriteria()
                .andRoomIdEqualTo(roomId);
        List<HotelOrderDetail> hotelOrderDetails = hotelOrderDetailMapper.selectByExample(hotelOrderDetailExample);
        List<Integer> orderIds = hotelOrderDetails.stream().map(HotelOrderDetail::getOrderId).distinct().collect(Collectors.toList());

        /* 通过时间条件查找有效订单，即在对应时间段占用了房间的订单 */
        HotelOrderExample hotelOrderExample = new HotelOrderExample();
        if (orderIds.size() > 0) {
            hotelOrderExample.or()
                    .andOrderIdIn(orderIds)
                    .andCheckInLessThanOrEqualTo(startTime)
                    .andCheckOutGreaterThanOrEqualTo(startTime);
            hotelOrderExample.or()
                    .andOrderIdIn(orderIds)
                    .andCheckInBetween(startTime, endTime);
            List<HotelOrder> hotelOrders = hotelOrderMapper.selectByExample(hotelOrderExample);
            for (HotelOrder order: hotelOrders) {
                remainRoom -= hotelOrderDetailMapper.selectByPrimaryKey(order.getOrderId()).getRoomCount();
            }
        }
        return remainRoom;
    }

    public List<Integer> getRemainRooms(Date startTime, Date endTime, Integer hotelId, List<Integer> roomId) {
        List<Integer> remainRooms = new ArrayList<>();
        for (Integer id : roomId) {
            remainRooms.add(getRemainRoom(startTime, endTime, hotelId, id));
        }
        return remainRooms;
    }
    /**
     * 通过hotelId找到managerId
     * @param hotelId hotelId
     * @return managerId
     */
    public Integer findManagerIdByHotelId(Integer hotelId){

        HotelManagerExample hotelManagerExample = new HotelManagerExample();
        hotelManagerExample.createCriteria().andHotelIdEqualTo(hotelId);
        List<HotelManager> hotelManagers = hotelManagerMapper.selectByExample(hotelManagerExample);
        if (hotelManagers.isEmpty()){
            return -1;
        }
        else{
            return hotelManagers.get(0).getHotelManagerId();
        }
    }

}

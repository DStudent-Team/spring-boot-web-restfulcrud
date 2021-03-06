package com.LiteTravel.web;

import com.LiteTravel.web.DTO.HotelOrder.OrderCommentDTO;
import com.LiteTravel.web.DTO.ResultVO;
import com.LiteTravel.web.Model.Hotel;
import com.LiteTravel.web.Model.HotelOrder;
import com.LiteTravel.web.service.FlightService;
import com.LiteTravel.web.service.HotelOrderService;
import com.LiteTravel.web.service.HotelService;
import com.LiteTravel.web.service.OrderCommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootTest
class LiteTravelWebApplicationTests {

//    @Resource
//    private OrderCommentService orderCommentService;
//
//    @Resource
//    private FlightService flightService;
//
//    @Resource
//    private HotelOrderService hotelOrderService;

    @Resource
    private HotelService hotelService;



    @Test
    void contextLoads() {
//        OrderCommentDTO orderCommentDTO = new OrderCommentDTO();
//        orderCommentDTO.setUserId(6);
//        orderCommentDTO.setOrderId(7);
//        orderCommentDTO.setHotelId(2);
//        orderCommentDTO.setScore(5);
//        orderCommentDTO.setDetail("垃圾酒店，就在");
//        String username = "KrisAdmin";
//        int i = orderCommentService.saveOrderComment(orderCommentDTO, username);
//        System.out.println(i);

//        ResultVO resultVO = orderCommentService.listOrderCommentsByHotelId(2, 1, 3);
//        System.out.println(resultVO.data);
//        ResultVO resultVO = flightService.getFlights(1, 12, 6);

//        System.out.println(hotelOrderService.updateHotelOrder(9));
//        System.out.println(hotelService.findManagerIdByHotelId(3));
        System.out.println(hotelService.getHotelsByManagerId(1, 5, 17).data);
    }




}

package com.LiteTravel.web.DTO.HotelOrder;

import com.LiteTravel.web.DTO.BedDTO;
import lombok.Data;

import java.util.List;
@Data
public class HotelOrderDetailDTO {
    private Integer roomId;
    private Integer hotelId;
    private String roomName;
    private Float roomPrice;
    private Integer roomRemaining;
    private String roomWifi;
    private Integer roomCount;
    private List<BedDTO> beds;
}

package com.LiteTravel.web.DTO.Flight;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author xiaobai
 */
@Data
public class FlightReserveDTO {
    Integer reserveId;
    Integer flightId;
    Float total;
    Boolean selected;
    Integer companyId;
    String companyName;
    String service;
    String userPassword;
    String flightDepart;
    String flightArrived;
    /**
     * 所有预定到的机票数据
     */
    List<FlightTicketDTO> flightTickets;
}

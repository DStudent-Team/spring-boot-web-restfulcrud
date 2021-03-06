package com.LiteTravel.web.controller;

import com.LiteTravel.web.DTO.Flight.FlightReserveDTO;
import com.LiteTravel.web.DTO.ResponseDTO;
import com.LiteTravel.web.DTO.ResultVO;
import com.LiteTravel.web.DTO.UserDTO;
import com.LiteTravel.web.mapper.FlightReserveMapper;
import com.LiteTravel.web.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

@Controller
public class AdminFlightController {

    @Resource
    FlightService flightService;

    @Resource
    FlightReserveMapper flightReserveMapper;

    @Resource
    FlightReserveMapper flightMapper;

    @GetMapping("/manage/flights")
    public String getFlights(@RequestParam(value = "page", defaultValue = "1")Integer page, ModelMap model, HttpSession session){
        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user == null){
            return "redirect:/login";
        }
        ResultVO result = flightService.getFlights(page, 10, user.getUserId());
        model.addAttribute("flights", result.data);
        model.addAttribute("pageInfo", result.info);
        return "/flight/list";
    }

    @GetMapping("/manage/company/flights")
    public String getReserveFlights(@RequestParam(value = "page", defaultValue = "1")Integer page, ModelMap model, HttpSession session){
        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user == null){
            return "redirect:/login";
        }
        ResultVO result = flightService.getReserveFlights(page, 10, user.getUserId());
        model.addAttribute("flights", result.data);
        model.addAttribute("pageInfo", result.info);
        return "/flight/reserve-list";
    }

    @PostMapping("/manage/reserve")
    @ResponseBody
    public ResponseDTO SubmitReserve(@RequestBody FlightReserveDTO reserveDTO){
        flightService.submitReserve(reserveDTO);
        return ResponseDTO.successOf();
    }

    /* 获取特定的服务*/
    @GetMapping("/manage/reserves")
    public String getReserves(@RequestParam(value = "page", defaultValue = "1")Integer page, HttpSession session, ModelMap model){
        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user == null){
            return "redirect:/login";
        }
        FlightReserveDTO flightReserveDTO = new FlightReserveDTO();
        flightReserveDTO.setCompanyId(user.getUserId());
        ResultVO result = flightService.getReserves(page, 10, flightReserveDTO);
        model.addAttribute("reserves", result.data);
        model.addAttribute("pageInfo", result.info);
        return "/flight/reserves";
    }
    /* 删除飞机行程信息*/
    @PostMapping("manage/deleteFlight")
    public String deleteFlight(Integer flightId, ModelMap map){
        int id = flightService.deleteFlight(flightId);
        if(id == 1){
            return "redirect:/manage/flights";
        }else{
            map.put("msg","删除失败！");
            return "redirect:/manage/flights";
        }

    }
    /*删除提供的机票服务信息*/
    @PostMapping("/manage/deleteReserve")
    public String deleteReserve(FlightReserveDTO flightReserveDTO, ModelMap map){
        int id = flightService.deleteReserve(flightReserveDTO.getReserveId());
        flightService.UpdateFlightStatus(flightReserveDTO.getFlightId(),0);
        if (id == 1) {
            return "redirect:/manage/reserves";
        }else{
            map.put("msg","删除失败！");
            return "redirect:/manage/reserves";
        }
    }
    /* 更新机票服务信息 */
    @PostMapping("/manage/updateReserve")
    public String updateReserve(@PathParam("reserveId") Integer reserveId,
                          @PathParam("service") String service, ModelMap map) {
        int id = flightService.updateReserve(reserveId, service);
        if(id == 1){
            return "redirect:/manage/reserves";
        }else{
            map.put("msg","更新成功！");
            return "redirect:/manage/reserves";
        }
    }
}

package com.LiteTravel.web.controller;

import com.LiteTravel.web.DTO.AuthorityDTO;
import com.LiteTravel.web.service.UserAuthorityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

/**
 * @author xiaobai
 */
@Controller
public class AdminAuthorityController {
    @Resource
    UserAuthorityService userAuthorityService;

    @PostMapping("/manage/authority/update")
    public String updateAuthority(AuthorityDTO authorityDTO, ModelMap model){
        int flag = userAuthorityService.updateAuthority(authorityDTO);
        if (flag == 1){
            model.addAttribute("message", "更新成功");
        }
        else{
            model.addAttribute("message", "更新失败");
        }
        return "redirect:/manage/users";
    }

}

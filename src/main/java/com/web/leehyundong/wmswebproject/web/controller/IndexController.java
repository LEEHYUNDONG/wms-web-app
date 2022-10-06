package com.web.leehyundong.wmswebproject.web.controller;


import com.web.leehyundong.wmswebproject.service.UserArgumentService;
import com.web.leehyundong.wmswebproject.service.UserDependencyService;
import com.web.leehyundong.wmswebproject.service.UserObjectService;
import com.web.leehyundong.wmswebproject.service.UserSourceService;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final UserObjectService userObjectService;

    @GetMapping("/")
    public String index(Model model){
        // dashboard procedure, table, package count
        Integer procedureCnt = 0;
        Integer tableCnt = 0;
        Integer packageCnt = 0;
        Integer typeCnt = 0;
        Integer indexCnt = 0;

        List<UserObjectResponseDto> lst = userObjectService.findAllUserObject();
        for (int i = 0; i < lst.size(); i++) {
            UserObjectResponseDto userObjectResponseDto =  lst.get(i);
            if(userObjectResponseDto.getObject_type().equals("PROCEDURE"))
                procedureCnt++;
            else if (userObjectResponseDto.getObject_type().equals("TABLE")) {
                tableCnt++;
            } else if (userObjectResponseDto.getObject_type().equals("PACKAGE")) {
                packageCnt++;
            } else if (userObjectResponseDto.getObject_type().equals("typeCnt")) {
                typeCnt++;
            }else if(userObjectResponseDto.getObject_type().equals("INDEX")){
                indexCnt++;
            }
        }
        model.addAttribute("packageCnt", packageCnt);
        model.addAttribute("tableCnt", tableCnt);
        model.addAttribute("procedureCnt", procedureCnt);
        model.addAttribute("indexCnt", indexCnt);
        model.addAttribute("typeCnt", typeCnt);


        return "/index";
    }




}

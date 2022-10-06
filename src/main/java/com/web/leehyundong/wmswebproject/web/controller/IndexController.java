package com.web.leehyundong.wmswebproject.web.controller;


import com.web.leehyundong.wmswebproject.service.UserArgumentService;
import com.web.leehyundong.wmswebproject.service.UserDependencyService;
import com.web.leehyundong.wmswebproject.service.UserObjectService;
import com.web.leehyundong.wmswebproject.service.UserSourceService;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDDLResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDashboardResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDateResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final UserObjectService userObjectService;



    @GetMapping("/")
    public String index(Model model) {
        UserObjectDateResponseDto userObjectDateResponseDto = userObjectService.findAllObjectCnt();
        UserObjectDashboardResponseDto userObjectDashboardResponseDto = userObjectService.getObjectCnt();


        model.addAttribute("packageCnt", userObjectDashboardResponseDto.getPackageCnt());
        model.addAttribute("tableCnt", userObjectDashboardResponseDto.getTableCnt());
        model.addAttribute("procedureCnt", userObjectDashboardResponseDto.getProcedureCnt());
        model.addAttribute("indexCnt", userObjectDashboardResponseDto.getIndexCnt());
        model.addAttribute("typeCnt", userObjectDashboardResponseDto.getTypeCnt());


        model.addAttribute("lstOfDate", userObjectDateResponseDto.getLstOfDate());
        model.addAttribute("procedureCntLst", userObjectDateResponseDto.getPCnt());
        model.addAttribute("tableCntLst", userObjectDateResponseDto.getTCnt());
        model.addAttribute("packageCntLst", userObjectDateResponseDto.getPacCnt());

        model.addAttribute("user_object_updated", userObjectService.findAllUserUpdatedObject());

        return "/index";
    }


}

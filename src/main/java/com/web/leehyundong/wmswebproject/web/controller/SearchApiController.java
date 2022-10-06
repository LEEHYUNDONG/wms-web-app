package com.web.leehyundong.wmswebproject.web.controller;


import com.web.leehyundong.wmswebproject.service.UserArgumentService;
import com.web.leehyundong.wmswebproject.web.dto.request.UserSearchRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/user")
public class SearchApiController {
    private final UserArgumentService userArgumentService;

    @GetMapping("")
    public String userArgumentSearch(@RequestBody UserSearchRequestDto userSearchRequestDto){

        return "user-arguments";
    }
}

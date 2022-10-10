package com.web.leehyundong.wmswebproject.web.dto.response;

import com.web.leehyundong.wmswebproject.domain.usersource.UserSource;
import lombok.Getter;


@Getter
public class UserSourceTextResponseDto {
    private String name;
    private String text;

    public UserSourceTextResponseDto(String text, String name){
        this.text = text;
        this.name = name;
    }

}


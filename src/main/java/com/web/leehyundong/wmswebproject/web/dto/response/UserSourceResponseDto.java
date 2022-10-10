package com.web.leehyundong.wmswebproject.web.dto.response;


import com.web.leehyundong.wmswebproject.domain.usersource.UserSource;
import lombok.Getter;


@Getter
public class UserSourceResponseDto {

    private String name;

    private Long line;

    private String text;

    public UserSourceResponseDto(UserSource userSource){
        this.name = userSource.getName();
        this.line = userSource.getLine();
        this.text = userSource.getText();
    }


}

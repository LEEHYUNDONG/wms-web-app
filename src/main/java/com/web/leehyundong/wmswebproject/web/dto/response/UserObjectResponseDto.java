package com.web.leehyundong.wmswebproject.web.dto.response;


import com.web.leehyundong.wmswebproject.domain.userobject.UserObject;
import lombok.Getter;

@Getter
public class UserObjectResponseDto {

    private String object_type;

    private String object_name;

    public UserObjectResponseDto(UserObject userObject){
        this.object_type =  userObject.getObjectType();
        this.object_name = userObject.getObjectName();
    }


}

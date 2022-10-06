package com.web.leehyundong.wmswebproject.web.dto.response;

import com.web.leehyundong.wmswebproject.domain.userobject.UserObject;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class UserObjectDDLResponseDto {
    private String object_type;

    private String object_name;

    private LocalDateTime last_ddl_time;

    public UserObjectDDLResponseDto(UserObject userObject){
        this.object_type =  userObject.getObjectType();
        this.object_name = userObject.getObjectName();
        this.last_ddl_time = userObject.getLastDdlTime();
    }

}

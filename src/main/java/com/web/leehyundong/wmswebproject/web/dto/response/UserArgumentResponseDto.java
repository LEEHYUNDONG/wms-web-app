package com.web.leehyundong.wmswebproject.web.dto.response;


import com.web.leehyundong.wmswebproject.domain.userarguments.UserArgument;
import lombok.Getter;

@Getter
public class UserArgumentResponseDto {
    private String object_name;
    private String package_name;
    private String argument_name;

    public UserArgumentResponseDto(UserArgument userArgument){
        this.object_name = userArgument.getObject_name();
        this.package_name = userArgument.getPackage_name();
        this.argument_name = userArgument.getArgument_name();
    }


}

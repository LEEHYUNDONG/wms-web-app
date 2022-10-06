package com.web.leehyundong.wmswebproject.web.dto.response;


import com.web.leehyundong.wmswebproject.domain.userdependencies.UserDependency;
import lombok.Getter;

@Getter
public class UserDependencyResponseDto {

    private String name;
    private String type;
    private String referenced_name;
    private String referenced_owner;

    public UserDependencyResponseDto(UserDependency userDependency){
        this.name = userDependency.getName();
        this.type = userDependency.getType();
        this.referenced_owner = userDependency.getReferenced_owner();
        this.referenced_name = userDependency.getReferenced_name();
    }
}

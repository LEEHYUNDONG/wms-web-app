package com.web.leehyundong.wmswebproject.web.dto.request;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserSearchRequestDto {

    private String keyword;

    private String option;

    @Builder
    public UserSearchRequestDto(String keyword, String option){
        this.keyword = keyword;
        this.option = option;
    }
}

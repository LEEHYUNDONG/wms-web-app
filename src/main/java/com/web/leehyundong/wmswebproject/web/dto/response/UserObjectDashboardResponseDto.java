package com.web.leehyundong.wmswebproject.web.dto.response;


import lombok.Getter;

@Getter
public class UserObjectDashboardResponseDto {
    private Integer procedureCnt = 0;
    private Integer tableCnt = 0;
    private Integer packageCnt = 0;

    private Integer indexCnt = 0;

    private Integer viewCnt = 0;

    private  Integer packageBodyCnt = 0;

    public UserObjectDashboardResponseDto(Integer procedureCnt, Integer tableCnt, Integer packageCnt, Integer indexCnt, Integer viewCnt, Integer packageBodyCnt){
        this.procedureCnt = procedureCnt;
        this.tableCnt = tableCnt;
        this.packageCnt = packageCnt;
        this.indexCnt = indexCnt;
        this.viewCnt = viewCnt;
        this.packageBodyCnt = packageBodyCnt;
    }
}

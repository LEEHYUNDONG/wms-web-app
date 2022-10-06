package com.web.leehyundong.wmswebproject.web.dto.response;


import lombok.Getter;

@Getter
public class UserObjectDashboardResponseDto {
    private Integer procedureCnt = 0;
    private Integer tableCnt = 0;
    private Integer packageCnt = 0;

    private Integer indexCnt = 0;

    private Integer typeCnt = 0;

    public UserObjectDashboardResponseDto(Integer procedureCnt, Integer tableCnt, Integer packageCnt, Integer indexCnt, Integer typeCnt){
        this.procedureCnt = procedureCnt;
        this.tableCnt = tableCnt;
        this.packageCnt = packageCnt;
        this.indexCnt = indexCnt;
        this.typeCnt = typeCnt;
    }
}

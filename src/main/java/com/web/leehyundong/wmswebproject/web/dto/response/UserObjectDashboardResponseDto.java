package com.web.leehyundong.wmswebproject.web.dto.response;

public class UserObjectDashboardResponseDto {
    private Long procedureCnt = 0L;
    private Long tableCnt = 0L;
    private Long packageCnt = 0L;

    public UserObjectDashboardResponseDto(Long procedureCnt, Long tableCnt, Long packageCnt){
        this.procedureCnt = procedureCnt;
        this.tableCnt = tableCnt;
        this.packageCnt = packageCnt;
    }
}

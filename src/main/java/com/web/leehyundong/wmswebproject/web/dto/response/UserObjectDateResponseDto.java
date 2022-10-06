package com.web.leehyundong.wmswebproject.web.dto.response;

import com.web.leehyundong.wmswebproject.domain.userobject.UserObject;
import lombok.Getter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Getter
public class UserObjectDateResponseDto {

    private List<String> lstOfDate;

    private List<Integer> pCnt;

    private List<Integer> tCnt;

    private List<Integer> pacCnt;

    public UserObjectDateResponseDto(List<String> lstOfDate, List<Integer> pCnt, List<Integer> tCnt, List<Integer> pacCnt){
        this.lstOfDate = lstOfDate;
        this.pacCnt = pacCnt;
        this.pCnt = pCnt;
        this.tCnt = tCnt;
    }
}

package com.web.leehyundong.wmswebproject.service;


import com.web.leehyundong.wmswebproject.repository.userobject.UserObjectRepository;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDDLResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDashboardResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDateResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectResponseDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserObjectService {
    private final UserObjectRepository userObjectRepository;

    public List<UserObjectResponseDto> findAllUserObject() {
        return userObjectRepository.findAllUserObject().stream()
                .map(UserObjectResponseDto::new)
                .collect(Collectors.toList());
    }

    public List<UserObjectDDLResponseDto> findAllUserUpdatedObject() {
        return userObjectRepository.findAllUserUpdatedObject().stream()
                .map(UserObjectDDLResponseDto::new)
                .collect(Collectors.toList());
    }

    public UserObjectDateResponseDto findAllObjectCnt(){

        List<UserObjectDDLResponseDto> userObject = this.findAllUserUpdatedObject();

        //data init
        List<String> dateList = new ArrayList<>();

        HashMap<String, Integer> procedureLst = new HashMap();

        HashMap<String, Integer> tableLst = new HashMap();

        HashMap<String, Integer> packageLst = new HashMap();

        List<Integer> pCnt = new ArrayList<>();
        List<Integer> tCnt = new ArrayList<>();
        List<Integer> pacCnt = new ArrayList<>();


        Calendar cal = Calendar.getInstance();
        int endDate = cal.getActualMaximum(Calendar.DATE);
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);

        for (int i = 1; i <= endDate; i++) {
            String dateVar;
            if(nowMonth < 10 && i < 10){
                dateVar = Integer.toString(nowYear) + "-0" + Integer.toString(nowMonth) + "-0" + Integer.toString(i);
            }else if(nowMonth < 10){
                dateVar = Integer.toString(nowYear) + "-0" + Integer.toString(nowMonth) + "-" + Integer.toString(i);
            }else if(i < 10){
                dateVar = Integer.toString(nowYear) + "-" + Integer.toString(nowMonth) + "-0" + Integer.toString(i);
            }else{
                dateVar = Integer.toString(nowYear) + "-" + Integer.toString(nowMonth) + "-" + Integer.toString(i);
            }

            dateList.add(dateVar);
            procedureLst.put(dateVar, 0);
            tableLst.put(dateVar, 0);
            packageLst.put(dateVar, 0);
        }

        for (UserObjectDDLResponseDto userObjectDDLResponseDto : userObject) {
            String type = userObjectDDLResponseDto.getObject_type();
            String dateObj = userObjectDDLResponseDto.getLast_ddl_time().toString();

            if (type.equals("PROCEDURE")) {
                Integer cnt = procedureLst.get(dateObj);
                cnt++;
                procedureLst.put(dateObj, cnt );
            } else if (type.equals("TABLE")) {
                Integer cnt = tableLst.get(dateObj);
                cnt++;
                tableLst.put(dateObj, cnt);
            } else if (type.equals("PACKAGE")) {
                Integer cnt = packageLst.get(dateObj);
                cnt++;
                packageLst.put(dateObj, cnt);
            }
        }

        for (String s : dateList) {
            pCnt.add(procedureLst.get(s));
            tCnt.add(tableLst.get(s));
            pacCnt.add(packageLst.get(s));

        }

        UserObjectDateResponseDto userObjectDateResponseDto = new UserObjectDateResponseDto(dateList, pCnt, tCnt, pacCnt);



        return userObjectDateResponseDto;
    }

    public UserObjectDashboardResponseDto getObjectCnt(){
        // dashboard procedure, table, package count

        List<UserObjectResponseDto> lst = this.findAllUserObject();


        Integer procedureCnt = 0;
        Integer tableCnt = 0;
        Integer packageCnt = 0;
        Integer typeCnt = 0;
        Integer indexCnt = 0;

        for (int i = 0; i < lst.size(); i++) {
            UserObjectResponseDto userObjectResponseDto = lst.get(i);
            if (userObjectResponseDto.getObject_type().equals("PROCEDURE"))
                procedureCnt++;
            else if (userObjectResponseDto.getObject_type().equals("TABLE")) {
                tableCnt++;
            } else if (userObjectResponseDto.getObject_type().equals("PACKAGE")) {
                packageCnt++;
            } else if (userObjectResponseDto.getObject_type().equals("TYPE")) {
                typeCnt++;
            } else if (userObjectResponseDto.getObject_type().equals("INDEX")) {
                indexCnt++;
            }
        }
        return new UserObjectDashboardResponseDto(procedureCnt, tableCnt, packageCnt, typeCnt, indexCnt);
    }

}

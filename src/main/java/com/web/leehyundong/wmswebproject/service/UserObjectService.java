package com.web.leehyundong.wmswebproject.service;


import com.web.leehyundong.wmswebproject.repository.userobject.UserObjectRepository;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDDLResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDashboardResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectResponseDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserObjectService {
    private final UserObjectRepository userObjectRepository;
//    Integer procedureCnt = 0;
//    Integer tableCnt = 0;
//    Integer packageCnt = 0;
//    Integer typeCnt = 0;
//    Integer indexCnt = 0;

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

//    public List<UserObjectDashboardResponseDto> getDashboardVar(){

//        List<UserObjectResponseDto> lst = userObjectService.findAllUserObject();
//        for (int i = 0; i < lst.size(); i++) {
//            UserObjectResponseDto userObjectResponseDto =  lst.get(i);
//            if(userObjectResponseDto.getObject_type().equals("PROCEDURE"))
//                procedureCnt++;
//            else if (userObjectResponseDto.getObject_type().equals("TABLE")) {
//                tableCnt++;
//            } else if (userObjectResponseDto.getObject_type().equals("PACKAGE")) {
//                packageCnt++;
//            }
//        }
//    }


}

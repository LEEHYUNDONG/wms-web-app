package com.web.leehyundong.wmswebproject.service;


import com.web.leehyundong.wmswebproject.repository.usersource.UserSourceRepository;
import com.web.leehyundong.wmswebproject.web.dto.response.UserSourceResponseDto;
import com.web.leehyundong.wmswebproject.web.dto.response.UserSourceTextResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserSourceService {
    private final UserSourceRepository userSourceRepository;

    public List<UserSourceResponseDto> findAllUserSource(){
        return userSourceRepository.findAllUserSource().stream()
                .map(UserSourceResponseDto::new)
                .collect(Collectors.toList());
    }

    public UserSourceTextResponseDto getSpecificSource(){
        String sourceWithoutWhiteSpace = new String("\n");

        List<UserSourceResponseDto> userSourceResponseDto = this.findAllUserSource();
        String name = userSourceResponseDto.get(0).getName();

        for (int i = 0; i < userSourceResponseDto.size(); i++) {
            UserSourceResponseDto sourceResponseDto =  userSourceResponseDto.get(i);
            sourceWithoutWhiteSpace += sourceResponseDto.getText();
        }


        return new UserSourceTextResponseDto(sourceWithoutWhiteSpace, name);
    }
}

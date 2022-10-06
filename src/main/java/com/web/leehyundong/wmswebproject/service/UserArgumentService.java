package com.web.leehyundong.wmswebproject.service;


import com.web.leehyundong.wmswebproject.repository.userargument.UserArgumentRepository;
import com.web.leehyundong.wmswebproject.web.dto.response.UserArgumentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserArgumentService {

    private final UserArgumentRepository userArgumentRepository;


    public List<UserArgumentResponseDto> findAllUserArgument() {
        return userArgumentRepository.findAllUserArgument().stream()
                .map(UserArgumentResponseDto::new)
                .collect(Collectors.toList());
    }


    public List<UserArgumentResponseDto> findByKeyword(String keyword){
        return userArgumentRepository.findByKeyword(keyword).stream()
                .map(UserArgumentResponseDto::new)
                .collect(Collectors.toList());

    }
}

package com.web.leehyundong.wmswebproject.service;


import com.web.leehyundong.wmswebproject.domain.usersource.UserSource;
import com.web.leehyundong.wmswebproject.repository.usersource.UserSourceRepository;
import com.web.leehyundong.wmswebproject.web.dto.response.UserSourceResponseDto;
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
}

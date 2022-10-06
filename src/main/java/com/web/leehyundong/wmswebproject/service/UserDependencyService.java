package com.web.leehyundong.wmswebproject.service;

import com.web.leehyundong.wmswebproject.repository.userdependencies.UserDependencyRepository;
import com.web.leehyundong.wmswebproject.web.dto.response.UserDependencyResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserDependencyService {
    private final UserDependencyRepository userDependencyRepository;

    public List<UserDependencyResponseDto> findAllUserDependency(){
        return userDependencyRepository.findAllUserDependency().stream()
                .map(UserDependencyResponseDto::new)
                .collect(Collectors.toList());
    }

    public List<UserDependencyResponseDto> findByKeyword(String keyword){
        return userDependencyRepository.findByKeyword(keyword).stream()
                .map(UserDependencyResponseDto::new)
                .collect(Collectors.toList());
    }
}

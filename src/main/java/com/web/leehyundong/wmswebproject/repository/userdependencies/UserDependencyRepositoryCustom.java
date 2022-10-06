package com.web.leehyundong.wmswebproject.repository.userdependencies;

import com.web.leehyundong.wmswebproject.domain.userdependencies.UserDependency;

import java.util.List;

public interface UserDependencyRepositoryCustom {

    public List<UserDependency> findAllUserDependency();

    public List<UserDependency> findByKeyword(String keyword);
}

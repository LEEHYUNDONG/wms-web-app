package com.web.leehyundong.wmswebproject.repository.userdependencies;

import com.web.leehyundong.wmswebproject.domain.userdependencies.UserDependency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDependencyRepository extends JpaRepository<UserDependency, String>, UserDependencyRepositoryCustom {
}

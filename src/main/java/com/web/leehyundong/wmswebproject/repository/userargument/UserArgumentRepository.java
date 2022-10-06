package com.web.leehyundong.wmswebproject.repository.userargument;

import com.web.leehyundong.wmswebproject.domain.userarguments.UserArgument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserArgumentRepository extends JpaRepository<UserArgument, String>, UserArgumentRepositoryCustom {
}

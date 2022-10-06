package com.web.leehyundong.wmswebproject.repository.usersource;

import com.web.leehyundong.wmswebproject.domain.usersource.UserSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSourceRepository extends JpaRepository<UserSource, String>, UserSourceRepositoryCustom {
}

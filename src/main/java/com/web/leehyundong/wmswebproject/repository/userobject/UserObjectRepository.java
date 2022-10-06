package com.web.leehyundong.wmswebproject.repository.userobject;

import com.web.leehyundong.wmswebproject.domain.userobject.UserObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserObjectRepository extends JpaRepository<UserObject, String>, UserObjectRepositoryCustom {
}

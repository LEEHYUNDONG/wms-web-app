package com.web.leehyundong.wmswebproject.repository.userobject;

import com.web.leehyundong.wmswebproject.domain.userobject.UserObject;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDashboardResponseDto;
import org.apache.catalina.User;

import java.util.List;

public interface UserObjectRepositoryCustom {

    List<UserObject> findAllUserObject();

    List<UserObject> findAllUserUpdatedObject();

    List<UserObject> findAllUserMonthlyUpdatedObject();

}

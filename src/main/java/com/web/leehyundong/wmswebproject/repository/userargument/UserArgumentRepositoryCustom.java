package com.web.leehyundong.wmswebproject.repository.userargument;

import com.web.leehyundong.wmswebproject.domain.userarguments.UserArgument;

import java.util.List;

public interface UserArgumentRepositoryCustom {

//    List<UserArgument> getArgumentsList(UserArgument UserArgument);

    List<UserArgument> findAllUserArgument();

    List<UserArgument> findByKeyword(String keyword);
}

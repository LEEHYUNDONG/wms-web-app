package com.web.leehyundong.wmswebproject.repository.userargument;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.web.leehyundong.wmswebproject.domain.userarguments.UserArgument;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.web.leehyundong.wmswebproject.domain.userarguments.QUserArgument.userArgument;


@RequiredArgsConstructor
public class UserArgumentRepositoryImpl implements UserArgumentRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<UserArgument> findAllUserArgument() {

        return jpaQueryFactory
                .selectFrom(userArgument)
                .fetch();
    }

    @Override
    public List<UserArgument> findByKeyword(String keyword) {
        return jpaQueryFactory
                .selectFrom(userArgument)
                .where(userArgument.object_name.contains(keyword))
                .fetch();
    }


}

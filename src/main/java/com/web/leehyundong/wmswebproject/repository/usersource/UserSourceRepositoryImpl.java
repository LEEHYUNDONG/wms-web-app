package com.web.leehyundong.wmswebproject.repository.usersource;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.web.leehyundong.wmswebproject.domain.usersource.UserSource;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.web.leehyundong.wmswebproject.domain.usersource.QUserSource.userSource;



@RequiredArgsConstructor
public class UserSourceRepositoryImpl implements UserSourceRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<UserSource> findAllUserSource() {
        return jpaQueryFactory
                .selectFrom(userSource)
//                .where(userSource.text.like("%SALES_MGR.CALC_TOTALS%"))
                .orderBy(userSource.name.asc(), userSource.line.asc())
                .fetch();
    }
}

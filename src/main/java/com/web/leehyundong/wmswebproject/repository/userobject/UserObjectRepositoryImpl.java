package com.web.leehyundong.wmswebproject.repository.userobject;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.web.leehyundong.wmswebproject.domain.userobject.UserObject;
import com.web.leehyundong.wmswebproject.web.dto.response.UserObjectDashboardResponseDto;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;

import static com.web.leehyundong.wmswebproject.domain.userobject.QUserObject.userObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class UserObjectRepositoryImpl implements UserObjectRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<UserObject> findAllUserObject() {
        return jpaQueryFactory
                .selectFrom(userObject)
                .orderBy(userObject.objectType.asc(), userObject.objectName.asc())
                .fetch();
//        return jpaQueryFactory
//                .selectFrom(userObject)
//                .where(userObject.status.eq("INVALID"))
//                .orderBy(userObject.objectType.asc(), userObject.objectName.asc())
//                .fetch();

    }

    @Override
    public List<UserObject> findAllUserUpdatedObject() {
        // 오늘과 하루전
        LocalDateTime now = LocalDateTime.now();
        return jpaQueryFactory
                .select(userObject)
                .from(userObject)
                .where(userObject.lastDdlTime.between(now.minusDays(1), now))
                .orderBy(userObject.lastDdlTime.desc())
                .fetch();

    }

    @Override
    public List<UserObject> findAllUserMonthlyUpdatedObject(){
        return jpaQueryFactory
                .select(userObject)
                .from(userObject)
                .where(userObject.lastDdlTime.loe(LocalDateTime.now()))
                .orderBy(userObject.lastDdlTime.desc())
                .fetch();
    }
}

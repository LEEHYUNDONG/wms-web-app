package com.web.leehyundong.wmswebproject.repository.userdependencies;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.web.leehyundong.wmswebproject.domain.userdependencies.UserDependency;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;

import java.util.List;

import static com.web.leehyundong.wmswebproject.domain.userdependencies.QUserDependency.userDependency;

@RequiredArgsConstructor
public class UserDependencyRepositoryImpl implements UserDependencyRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<UserDependency> findAllUserDependency() {
        return jpaQueryFactory
                .selectFrom(userDependency)
                .where(
                        userDependency.type.in("PACKAGE","PACKAGE_BODY", "PROCEDURE", "FUNCTION", "TRIGGER", "TYPE"),
                        userDependency.referencedType.eq("TABLE"),
                        userDependency.name.notLike("%_API")
                        )
                .orderBy(userDependency.name.asc(), userDependency.referenced_owner.asc(), userDependency.referenced_name.asc())
                .fetch();
    }

    @Override
    public List<UserDependency> findByKeyword(String keyword){
        return jpaQueryFactory
                .selectFrom(userDependency)
                .where(
                        userDependency.type.in("PACKAGE","PACKAGE_BODY", "PROCEDURE", "FUNCTION", "TRIGGER", "TYPE"),
                        userDependency.referencedType.eq("TABLE"),
                        userDependency.name.notLike("%_API"),
                        userDependency.name.contains(keyword)
                )
                .orderBy(userDependency.name.asc(), userDependency.referenced_owner.asc(), userDependency.referenced_name.asc())
                .fetch();
    }
}

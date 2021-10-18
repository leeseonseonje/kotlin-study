package kotlinstudy.kotlin.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import kotlinstudy.kotlin.domain.QUser
import kotlinstudy.kotlin.domain.QUser.*
import kotlinstudy.kotlin.domain.User
import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.EntityManager


class UserRepositoryImpl: UserRepositoryCustom {

    private val em: EntityManager
    private val queryFactory: JPAQueryFactory

    @Autowired
    constructor(em: EntityManager) {
        this.em = em
        this.queryFactory = JPAQueryFactory(em)
    }


    override fun user(name: String): List<User>? {

        return queryFactory.selectFrom(user)
                .where(user.name.eq(name))
                .fetch()
    }
}
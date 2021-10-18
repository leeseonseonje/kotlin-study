package kotlinstudy.kotlin.repository

import kotlinstudy.kotlin.domain.User

interface UserRepositoryCustom {

    fun user(name: String): List<User>?
}
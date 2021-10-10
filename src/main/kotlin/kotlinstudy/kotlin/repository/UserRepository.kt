package kotlinstudy.kotlin.repository

import kotlinstudy.kotlin.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}
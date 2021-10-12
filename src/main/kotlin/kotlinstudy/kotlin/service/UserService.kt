package kotlinstudy.kotlin.service

import kotlinstudy.kotlin.domain.User
import kotlinstudy.kotlin.repository.UserRepository
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
@Transactional
@RequiredArgsConstructor
class UserService {

    private final val userRepository: UserRepository

    @Autowired
    constructor(userRepository: UserRepository) {
        this.userRepository = userRepository
    }

    fun save(name: String?): Long? {
        val user = User(name)
        val savedUser = userRepository.save(user)

        return savedUser.id
    }

    fun users(): MutableList<User> {
        return userRepository.findAll()
    }

    fun findUser(userId: Long): Optional<User> {
        return userRepository.findById(userId)
    }
}
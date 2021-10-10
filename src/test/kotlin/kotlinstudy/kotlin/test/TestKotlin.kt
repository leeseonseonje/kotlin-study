package kotlinstudy.kotlin.test

import kotlinstudy.kotlin.domain.User
import kotlinstudy.kotlin.repository.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import javax.transaction.Transactional

@SpringBootTest
//@Transactional
class TestKotlin {

    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun userTest() {
        val user = User(1L, "name")

        println(user.name)
        println(user.id)
    }

    @Test
    fun saveTest() {
        val user = User("name")
        val savedUser = userRepository.save(user)

        println(savedUser.name)
    }
}


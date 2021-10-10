package kotlinstudy.kotlin.test

import kotlinstudy.kotlin.domain.User
import kotlinstudy.kotlin.repository.UserRepository
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestKotlin {

    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun userTest() {
        val user = User(1L, "name")

        Assertions.assertThat(user.name).isEqualTo("name")
        Assertions.assertThat(user.id).isEqualTo(1L)
    }

    @Test
    fun saveTest() {
        val user = User("name")
        val savedUser = userRepository.save(user)

        Assertions.assertThat(savedUser.name).isEqualTo("name")
    }
}


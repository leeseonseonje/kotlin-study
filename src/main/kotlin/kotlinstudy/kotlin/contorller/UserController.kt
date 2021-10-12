package kotlinstudy.kotlin.contorller

import kotlinstudy.kotlin.domain.User
import kotlinstudy.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.stream.Stream

@RestController
class UserController {

    private final val userService: UserService

    @Autowired
    constructor(userService: UserService) {
        this.userService = userService
    }

    @PostMapping("/user")
    fun saveUser(@RequestBody request: UserDto) {
        userService.save(request.name)
    }

    @GetMapping("/users")
    fun users(): Stream<UserDto>? {
        val users = userService.users()

        return users.stream().map { user -> UserDto(user) }
    }

    @GetMapping("/user/{userId}")
    fun findUser(@PathVariable userId: Long): User {
        val findUser = userService.findUser(userId)

        return findUser.get()
    }
}
package kotlinstudy.kotlin.contorller

import kotlinstudy.kotlin.domain.User
import kotlinstudy.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.stream.Stream
import kotlin.streams.toList

@RestController
class UserController {

    private val userService: UserService

    @Autowired
    constructor(userService: UserService) {
        this.userService = userService
    }

    @PostMapping("/user")
    fun saveUser(@RequestBody request: UserDto?) {
        userService.save(request?.getName())
    }

//    표현식
//    @PostMapping("/user")
//    fun saveUser(@RequestBody request: UserDto?) = userService?.save(request?.name)

    @GetMapping("/users")
    fun users(): Stream<UserDto>? {
        val users = userService.users()

        return users?.stream()?.map { user -> UserDto(user) }
    }

    @GetMapping("/user/{userId}")
    fun findUser(@PathVariable userId: Long): User? {
        val findUser = userService.findUser(userId)

        return findUser?.get()
    }

    @PatchMapping("/user")
    fun updateUser(@RequestBody request: UserDto?) {
        userService.updateUser(request)
    }

    @GetMapping("/user")
    fun findName(@RequestParam("name") name: String): List<UserDto>? {
        val users = userService.findName(name)
        return users?.stream()?.map { user -> UserDto(user) }?.toList()
    }
}
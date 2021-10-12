package kotlinstudy.kotlin.test

import kotlinstudy.kotlin.domain.User
import org.junit.jupiter.api.Test

class T {

    @Test
    fun nullCheck() {

        //Elvis
        val s : String? = null

        val name = s ?: "string"

//        println(name)

        val userA = User()
        println(userA.name)
        userA.name = "name"
        println(userA.name)

        val userB = User().

    }
}
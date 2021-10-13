package kotlinstudy.kotlin.test

import kotlinstudy.kotlin.domain.User
import org.junit.jupiter.api.Test

class T {

    @Test
    fun nullCheck() {

        //Elvis
        val s : String? = null

        val s1 = s ?: "string"

//        println(name)

        val userA = User()
        println(userA.id)
        println(userA.name)

        val userB = User().apply {
            id = 1L
            name = "name"
        }

        println(userB.id)
        println(userB.name)

        val userC = User().also {
            it.id = 2L
            it.name = "2name"
        }

        println(userC.id)
        println(userC.name)

        val userD = User().also {
            println("print")
        }

        val withUser : User = User()
        with(withUser) {
            id = 3L
            name = "withUser"
        }

        println(withUser.id)
        println(withUser.name)
    }

    @Test
    fun arrayTest() {
        val array: ArrayList<String> = ArrayList()
        array.add("A")
        array.add("B")
        array.add("C")
        array.add("D")
        array.add("E")

        println(array.size)
        println(array[2])
        for (s in array) {
            println(s)
        }
    }
}
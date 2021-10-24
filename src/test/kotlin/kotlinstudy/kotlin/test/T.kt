package kotlinstudy.kotlin.test

import kotlinstudy.kotlin.domain.User
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class T {

    @Test
    fun nullCheck() {

        //Elvis
        val s : String? = null

        val s1 = s ?: "string"

//        println(name)

        val userA = User()
        println(userA.getId())
        println(userA.getName())

//        val userB = User().apply {
//            get = 1L
//            name = "name"
//        }

//        println(userB.id)
//        println(userB.name)

//        val userC = User().also {
//            it.id = 2L
//            it.name = "2name"
//        }
//
//        println(userC.id)
//        println(userC.name)

//        val userD = User().also {
//            println("print")
//        }
//
//        val withUser : User = User()
//        with(withUser) {
//            id = 3L
//            name = "withUser"
//        }

//        println(withUser.id)
//        println(withUser.name)
    }

    @Test
    fun listTest() {
        val array: ArrayList<String> = ArrayList()
        array.add("A")
        array.add("B")
        array.add("C")
        array.add("D")
        array.add("E")

        println("size = " + array.size)
        println("index = " + array[2])
        for (s in array) {
            println("arrayList = $s")
        }

        val link: LinkedList<String> = LinkedList()
        link.add("A")
        link.add("B")
        link.add("C")

        for (l in link) {
            println("linkedList = $l")
        }
    }

    @Test
    fun mapTest() {
        val map: HashMap<String, String> = HashMap()
        map["A"] = "A"
        map["B"] = "B"
        map["C"] = "C"

        for (m in map) {
            println("map = $map")
            println("m = $m")
            println("key = " + m.key)
            println("value = " + m.value)
        }
    }

    @Test
    fun timeTest() {
        val now: LocalDateTime = LocalDateTime.now()
        val localDateTime: LocalDateTime = LocalDateTime.of(1998, 2, 9, 7, 30)
        val localDate: LocalDate = LocalDate.of(1998, 2, 9)

        println("now = $now")
        println("time = $localDateTime")
        println("localDate = $localDate")

        val nowToString: String? = now.toString()
        println("nowToString = $nowToString")
    }
}
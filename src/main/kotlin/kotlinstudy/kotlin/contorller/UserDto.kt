package kotlinstudy.kotlin.contorller

import kotlinstudy.kotlin.domain.User

class UserDto {

    private var id: Long? = null
    private var name: String? = null

    constructor(user: User) {
        this.id = user.getId()
        this.name = user.getName()
    }

    fun getId(): Long? {
        return this.id
    }

    fun getName(): String? {
        return this.name
    }
}
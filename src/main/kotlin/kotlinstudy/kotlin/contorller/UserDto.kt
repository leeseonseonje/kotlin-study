package kotlinstudy.kotlin.contorller

import kotlinstudy.kotlin.domain.User

class UserDto {

    var id: Long? = null
    var name: String? = null

    constructor(user: User) {
        this.id = user.id
        this.name = user.name
    }
}
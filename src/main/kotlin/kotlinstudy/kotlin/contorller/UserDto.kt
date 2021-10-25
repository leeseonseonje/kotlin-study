package kotlinstudy.kotlin.contorller

import kotlinstudy.kotlin.domain.User

class UserDto {

    var id: Long? = null
        private set
    var name: String? = null
        private set

    constructor(user: User) {
        this.id = user.id
        this.name = user.name
    }
}
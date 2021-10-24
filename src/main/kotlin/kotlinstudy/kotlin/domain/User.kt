package kotlinstudy.kotlin.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    var id: Long? = null

    var name: String? = null

    constructor(id: Long, name: String){
        this.id = id
        this.name = name
    }

    constructor(name: String?) {
        this.name = name
    }

    constructor()
}
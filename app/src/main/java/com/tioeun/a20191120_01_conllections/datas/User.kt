package com.tioeun.a20191120_01_conllections.datas

class User(name : String, address : String) {

    var name =  name
    var address = address

    override fun equals(other: Any?): Boolean {
        var result = false

        var otherUser = other as User
        if (this.name == otherUser.name && this.address == otherUser.address) {
            result = true
        }

        return result
    }
}
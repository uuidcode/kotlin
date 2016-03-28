package com.github.uuidcode.kotlin

data class User(val name: String = "", val age: Int = 0) {
    var phone: String = ""
    val userId: Long = 0

}

fun main(args: Array<String>) {
    var user = User("java", 20)
    println(user.name)

    user.phone = "000-0000-0000"

    println(user.phone)
    println(user.userId)
}
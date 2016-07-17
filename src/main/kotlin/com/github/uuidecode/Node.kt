package com.github.uuidecode

data class Node(var nodeId: Long? = null,
                var name: String? = null) {

    fun test(a: Int) {
        var b = 1
        b = 2

        println(b)
    }
}

fun main(args: Array<String>) {
    println("OK")
    println(Node().nodeId)
}
package com.github.uuidcode.kotlin

import java.util.Random as JavaRandom

fun main(args: Array<String>) {
    println("Hello World")

    var a = 1
    var numberString = a.toString()

    println(a)
    println(numberString)
    println("10".toLong())
    println(com.github.uuidcode.kotlin.sum(10, 20))
    println(JavaRandom().nextInt())

    var languageArray: Array<String> = arrayOf("Java", "Javascript", "Kotlin")

    for (language in languageArray) {
        println(language)
    }

    for (index in languageArray.indices) {
        println("[${index}]" + languageArray[index])
    }
}

fun sum(a: Int, b: Int) :Int {
    return a + b;
}
package com.qin.kt01

/**
 * Created by Qin on 2017/9/29.
 */
fun main(args: Array<out String>) {
    val user = User(0, "ZhouWU")
    println(user)

    HelloKotlin::class.constructors.map {
        println(it)
    }
}

class HelloKotlin {
    fun hello() {
    }
}
package com.qin.kt04

/**
 * Created by Qin on 2017/9/29.
 */
fun main(vararg args: String) {
    args.flatMap {
        it.split("_")
    }.map { print("$it ${it.length} ") }
}
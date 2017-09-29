package com.qin.kt03

/**
 * Created by Qin on 2017/9/29.
 */
// out 类似于Java中的extends
fun main(args: Array<out String>) {
    args.map {
        // it 就是iterator
        println(it)
    }

    args.map(::println)

    for (arg in args) {
        println(arg)
    }
}
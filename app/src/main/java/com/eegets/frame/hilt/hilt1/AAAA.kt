package com.eegets.frame.hilt.hilt1

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

/**
 * @packageName: com.eegets.frame.hilt.hilt1
 * @author: eegets
 * @date: 2020/11/27
 * @description: TODO
 */
fun main() {
    repeat(100_000) {
        thread {
            Thread.sleep(1000L)
            println ("AAAAAAAAAA")
        }
    }

//    repeat(100_000) {
//        val executor = Executors.newSingleThreadScheduledExecutor()
//        val task = Runnable {
//            println(".")
//        }
//        repeat(100_00) {
//            executor.schedule(task, 1, TimeUnit.SECONDS)
//        }
//    }

}
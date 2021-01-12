package com.eegets.frame.coroutines

import android.util.Log
import kotlinx.coroutines.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/**
 * @packageName: com.eegets.frame.coroutines
 * @author: eegets
 * @date: 2020/11/9
 * @description: TODO
 */
//fun main() = runBlocking{
//    GlobalScope.launch {
//        delay(1000L) // 非阻塞的等待 1 秒钟（默认时间单位是毫秒）
//        println("World thread=${Thread.currentThread()}")
//    }
//    println("Hello")
////    Thread.sleep(2000L) // 阻塞主线程 2 秒钟来保证 JVM 存活
//    delay(2000L)
////    runBlocking {
////       delay(2000L)
////    }
//}

//suspend fun main() {
//    val job = GlobalScope.launch {
//        delay(1000)
//        println("World")
//    }
//    println("Hello, ")
//    job.join()
//}

//fun main() = runBlocking {
//    launch { // 在 runBlocking 作用域中启动一个新协程
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//}

//fun main() = runBlocking {
//    launch {
//        firstLaunch()
//    }
//
//    coroutineScope {  //创建一个协程作用域
//        launch {
//            delay(2000L)
//            println("Task from nested launch")
//        }
//        delay(1000L)
//        println("Task from coroutine scope")
//    }
//    println("Croutine scope is over")
//}
//
//
//suspend fun firstLaunch () {
//    delay(500L)
//    println("Task from runBlocking")
//}

//fun main() = runBlocking {
//    val job = GlobalScope.launch {
//        repeat(1000) { i ->
//            println(". $i")
//            delay(500L)
//        }
//    }
//    job.cancel()
//    delay(2300L)
//}

//取消协程操作
//fun main() = runBlocking {
//    val startTime = System.currentTimeMillis()
//    val job = launch(Dispatchers.Default) {
//        try {
//
//            var nextPrintTime = startTime
//            var i = 0
//            while (i < 10) {
//                if (System.currentTimeMillis() >= nextPrintTime) {
//                    println("job : Im sleeping ${i++}")
//                    nextPrintTime += 1000L
//                }
//            }
//        } finally {
//            println("finally")
//        }
//    }
//    delay(1300L)
//    println("main: Im tired of waiting")
//    job.cancel()
//    println("main: Now I can quit")
//}


//@Volatile var i = 0
//
//suspend fun main() {
//
////    Executors.newFixedThreadPool(10)
////        .asCoroutineDispatcher().use { dispatcher ->
////            List(1000000) {
////                launch(dispatcher) {
////                    i++
////                }
////            }
////                .forEach {
////                it.join()
////            }
////        }
//    List(1000000) {
//        GlobalScope.launch() {
//            i++
//        }
//    }
//        .forEach {
//            it.join()
//        }
//    println("log i=$i")
////    Thread.sleep(5000)
////    log(i)
//}
//fun main() = runBlocking {
//    testSuspend()
//}
fun main() {

    threadTest()
}

fun threadTest() {
    repeat(100_0000) { // 启动⼤量的协程
        object : Thread() {
            override fun run() {
                super.run()
                sleep(500000)
//                println("World it = $it threadName=${currentThread()}, threadId=${currentThread().id}")
            }
        }.start()
        println("$it====")
    }
}


suspend fun testSuspend1(): Int {
    delay(1000L)
    println("testSuspend1`")
    testSuspend2()
    return 0
}
suspend fun testSuspend2(): Int {
    delay(1000L)
    println("testSuspend2")
    return 1
}
//fun main() = runBlocking {
//    println(testSuspend1())
//}
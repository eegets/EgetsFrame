package com.eegets.frame.coroutines

import android.app.Activity
import android.app.ActivityManager
import android.os.Bundle
import android.util.Log
import com.eegets.frame.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

/**
 * @packageName: com.eegets.frame.coroutines
 * @author: eegets
 * @date: 2020/11/30
 * @description: TODO
 */
class CoroutinesTestActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)
//        val mgr: ActivityManager=
//            this.applicationContext.getSystemService(ACTIVITY_SERVICE) as ActivityManager
//        mgr.memoryClass
//        println("AAAAAAAAAAAAAAAAAa memory: ${mgr.memoryClass}, maxMemory = ${Runtime.getRuntime().maxMemory()}")

//        repeat(100) {
//            thread {
//                Thread.sleep(1000L)
//                 Log.e("TAG", "Thread singleThread: ${Thread.currentThread().name}; ThreadId = ${Thread.currentThread().id}")
//            }
//        }

        repeat(100) {
            val executor = Executors.newSingleThreadExecutor()
            val task = Runnable {
                Log.e("TAG", "Thread singleThread: ${Thread.currentThread().name}; ThreadId = ${Thread.currentThread().id}")
            }
//            repeat(100) {
                executor.submit(task)
//            }
        }

//        repeat(100) {
//            GlobalScope.launch {
//                //开启协程后，先打印一下进程名称和进程id
//                Log.e("TAG", "Thread singleThread: ${Thread.currentThread().name}; ThreadId = ${Thread.currentThread().id}")
//                delay(1000L)
//            }
//        }
    }
}
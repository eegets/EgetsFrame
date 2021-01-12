package com.eegets.library.initializer

import android.content.Context
import com.eegets.library.ext.isLogDebug
import com.eegets.library.ext.logger

/**
 * @packageName: com.eegets.library.initializer
 * @author: eegets
 * @date: 2020/11/25
 * @description: TODO
 */

object AAAA {
    @JvmStatic
    fun initialize(context: Context) {
        isLogDebug(true)
        Thread.sleep(1000)
        logger {
            "EegetsInitializer EegetsFrameSleep1秒后的　最终结束时间 = ${System.currentTimeMillis()}"
        }
    }
}
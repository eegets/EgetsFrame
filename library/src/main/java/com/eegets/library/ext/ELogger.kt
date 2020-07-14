@file:JvmName("ELogUtil")
package com.eegets.library.ext

import android.util.Log
import com.eegets.library.BuildConfig

/**
 * @data on  上午11:00
 * @author Kevin
 * @describe 日志工具类
 **/

fun isDebugMode(): Boolean {
    return BuildConfig.DEBUG
}

fun logger(vararg message: Any?) {
    Log.d(generateLog(), composeMessage(*message))
}

inline fun logger(message: (() -> Any?)) {
    Log.d(generateLog(), composeMessage(message()))
}

inline fun Any.logger(any: Any, message: (() -> Any?)) {
    Log.d(generateLog(), composeMessage(any.javaClass.simpleName, message()))
}

fun generateLog(): String {
    val stackTrackElement= Thread.currentThread().stackTrace[3]
    var className = stackTrackElement.className
    if (className.isNotEmpty()) {
        className = className?.substring(className.lastIndexOf(".") + 1)
    }
    return "Logger:$className.${stackTrackElement.methodName}(Line:${stackTrackElement.lineNumber})"
}

fun composeMessage(vararg args: Any?): String {
    return args.joinToString("; ")
}



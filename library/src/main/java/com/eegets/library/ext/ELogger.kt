@file:JvmName("ELogUtil")

package com.eegets.library.ext

import android.util.Log

/**
 * @data on  上午11:00
 * @author Kevin
 * @describe 日志工具类
 **/

@PublishedApi
internal var isDebug: Boolean = false
fun isLogDebug(isLogDebug: Boolean) {
    isDebug = isLogDebug
}

inline fun logger(message: (() -> Any?)) {
    logger({ generateLog() }, message)
}

/**
 * Tag标签的最大长度:84个字符，超过就会拼接到msg中
 */
inline fun logger(tag: () -> Any?, message: () -> Any?) {
    if (isDebug) {
        logD(tag().toString(), message().toString())
    }
}

/**
 * Tag标签的最大长度:84个字符，超过就会拼接到msg中
 */
inline fun logger(tag: () -> Any?, message: Any?) {
    if (isDebug) {
        logD(tag().toString(), message.toString())
    }
}

fun logD(tag: String?, message: String?) {
    val msgLength = message?.length ?: 0
    if (msgLength > 4000) {
        val chunkCount: Int = msgLength / 4000 // integer division
        for (i in 0..chunkCount) {
            val max = 4000 * (i + 1)
            if (max >= msgLength) {
                Log.d(tag, message?.substring(4000 * i))
            } else {
                Log.d(tag, message?.substring(4000 * i, max))
            }
        }
    } else {
        Log.d(tag, message)
    }
}

fun generateLog(): String {
    val stackTrackElement = Thread.currentThread().stackTrace[3]
    var className = stackTrackElement.className
    if (className.isNotEmpty()) {
        className = className?.substring(className.lastIndexOf(".") + 1)
    }
    return "Logger:$className(Line:${stackTrackElement.lineNumber})"
}



package com.eegets.library.ext

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * @packageName: com.eegets.library.ext
 * @author: eegets
 * @date: 20-12-16
 * @description: TODO
 */

private fun <T : Activity> Activity.startActivity(context: Context, clazz: Class<T>) {
    startActivity(Intent(context, clazz))
}

inline fun <reified T : Activity> Activity.startActivity() {
    startActivity(Intent(this, T::class.java))
}


/**
 * 将一种类型转换为另一种类型,如果类型转换不允许，返回null
 */
inline fun <reified T> Any.asSafe(): T? {
    return if (this is T) {
        this
    } else {
        null
    }
}

/**
 * 单个泛型参数单个约束
 * 比较任意类型大小
 */
inline fun <T: Comparable<T>> maxOf(paramA: T, paramB: T): T {
    return if (paramA > paramB) {
        paramA
    } else {
        paramB
    }
}

/**
 * 单个泛型参数多个约束，使用where语句
 * 首先T可以通过Comparable进行比较大小,另外还需要调用参数的invoke方法
 */
fun <T> callMax(paramA: T, paramB: T) where T: Comparable<T>, T: () ->Unit {
    return if (paramA > paramB) paramA() else paramB()
}

/**
 * 多个泛型参数多个约束，使用where语句
 * 首先T可以通过Comparable进行比较大小,另外还需要调用参数的invoke方法
 */
fun <T, R> callMax(paramA: T, paramB: T): R where T: Comparable<T>, T: () ->R {
    return if (paramA > paramB) paramA() else paramB()
}


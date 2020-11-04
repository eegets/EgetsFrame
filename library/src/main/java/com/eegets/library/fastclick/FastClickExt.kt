package com.eegets.library.fastclick

import android.view.View

/**
 * @packageName: com.eegets.library.ext
 * @author: eegets
 * @date: 20-10-9 下午4:09
 * @description: TODO
 *
 * https://juejin.im/post/6844904142016610311
 */


fun View.setOnSafeClickListener(timer: Long = 500, action:() -> Unit) {
    var lastClick = 0L
    setOnClickListener {
        val reduce = System.currentTimeMillis() - lastClick
        lastClick = System.currentTimeMillis()
        if (reduce < timer) {
            return@setOnClickListener
        }
        action.invoke()
    }
}


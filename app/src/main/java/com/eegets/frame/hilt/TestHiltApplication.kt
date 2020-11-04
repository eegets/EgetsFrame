package com.eegets.frame.hilt

import android.app.Application
import com.eegets.library.ext.isLogDebug
import dagger.hilt.android.HiltAndroidApp

/**
 * @packageName: com.eegets.egetsframe
 * @author: eegets
 * @date: 20-9-28 上午10:48
 * @description: TODO
 */

@HiltAndroidApp
class TestHiltApplication :Application() {
    override fun onCreate() {
        super.onCreate()

        isLogDebug(true)
    }
}
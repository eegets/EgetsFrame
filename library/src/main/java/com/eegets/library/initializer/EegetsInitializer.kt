package com.eegets.library.initializer

import android.content.Context
import androidx.startup.Initializer

class EegetsInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        AAAA.initialize(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return mutableListOf()
    }

}
package com.eegets.egetsframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eegets.library.ext.logger

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger ("AAA", "BBB")
        logger {
            "print logger"
        }
        logger(this) {
            "print this logger"
        }
    }
}
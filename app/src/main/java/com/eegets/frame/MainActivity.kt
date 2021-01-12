package com.eegets.frame

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eegets.frame.activity.TranslateActivity
import com.eegets.frame.animator.AnimActivity
import com.eegets.frame.hilt.hilt1.TestHiltActivity
import com.eegets.frame.hilt.hilt2.AnalyticsActivity
import com.eegets.library.ext.logger
import com.eegets.library.fastclick.setOnSafeClickListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*


@AndroidEntryPoint
class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        debounceClick.setOnSafeClickListener {
        }

        hilt.setOnClickListener {
            startActivity(Intent(this, TestHiltActivity::class.java))
        }

        hilt2.setOnClickListener {
            startActivity(Intent(this, AnalyticsActivity::class.java))
        }
        scale.setOnClickListener {
            startActivity(Intent(this, AnimActivity::class.java))
        }
        transitionImg.setOnClickListener {
            val pair = Pair<View, String>(transitionImg, "transitionImg")
            val pair2 = Pair<View, String>(transitionText, "transitionText")
            val bundle: Bundle = ActivityOptions.makeSceneTransitionAnimation(this, pair, pair2).toBundle()
            startActivity(Intent(this, TranslateActivity::class.java), bundle)
        }

//        logger {
//            "print logger"
//        }
        var aaa = StringBuilder("AA")
        for (i in 0..100000) {
            aaa.append("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB$i")
        }
        logger({
            "TAG"
        },{
            "print this logger1　${aaa}"
        })
    }

    fun test() {
        //多次调用 sum() 方法进行求和运算
//        println(sum(1, 2, 3))
//        println(sum(100, 200, 300))
//        println(sum(12, 34))
        //....可能还有若干次

        aaaaa(AA = 1, bb = 2, cc = 3, ff = 2)
    }

    /**
     * 求和计算
     */
   inline fun sum(vararg ints: Int): Int {
        var sum = 0
        for (i in ints) {
            sum += i
        }
        return sum
    }

    fun aaaaa(AA: Int = 0, bb: Int = 0, cc: Int = 0, dd: Int = 0, ff: Int) {

    }

}
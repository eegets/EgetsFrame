package com.eegets.frame.animator

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.app.Activity
import android.os.Bundle
import com.eegets.frame.R
import kotlinx.android.synthetic.main.activity_anim.*


/**
 * @packageName: com.eegets.frame.animator
 * @author: eegets
 * @date: 21-1-6
 * @description: TODO
 */

class AnimActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim)

        start.setOnClickListener {
            startAnimator()
        }
    }


    private fun startAnimator() {

        val scaleX = ObjectAnimator.ofFloat(imgView, "scaleX", 1f, 0f)
        val scaleY = ObjectAnimator.ofFloat(imgView, "scaleY", 1f, 0f)
        AnimatorSet().apply {
            duration = 800
            play(scaleX).with(scaleY)//两个动画同时开始
            start()
        }
    }
}
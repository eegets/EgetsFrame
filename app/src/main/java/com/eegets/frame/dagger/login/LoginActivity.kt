package com.eegets.frame.dagger.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eegets.frame.R
import com.eegets.library.ext.logger
import kotlinx.android.synthetic.main.activity_login.*

/**
 * @packageName: com.eegets.frame.dagger.login
 * @author: eegets
 * @date: 20-10-12 下午2:43
 * @description: 用一个登录实现dagger2实现方式
 */

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        submitBtn.setOnClickListener {
            logger {
                "提交"
            }
            val userString = userName.text.toString()
            val passWord = passWord.text.toString()

        }
    }
}
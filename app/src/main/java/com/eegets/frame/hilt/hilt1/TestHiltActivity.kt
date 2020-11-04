package com.eegets.frame.hilt.hilt1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eegets.frame.R
import com.eegets.frame.hilt.hilt1.TestEntity
import com.eegets.library.ext.logger
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @packageName: com.eegets.egetsframe
 * @author: eegets
 * @date: 20-10-9 下午4:32
 * @description: 依赖注入测试类
 */

@AndroidEntryPoint
class TestHiltActivity : AppCompatActivity() {
    @Inject lateinit var entity: TestEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entity.title = "这是重新赋值的一个标题"
        logger {
            "TestEntity ${entity.title} ${entity.desc}"
        }
    }
}
package com.eegets.frame.hilt.hilt2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eegets.frame.R
import com.eegets.frame.hilt.hilt2.bind.AnalyticsServiceImpl
import com.eegets.frame.hilt.hilt2.qualifier.Fake1Service
import com.eegets.frame.hilt.hilt2.qualifier.Fake2Service
import com.eegets.frame.hilt.hilt2.qualifier.FakeService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class AnalyticsActivity : AppCompatActivity() {

    @Inject
    lateinit var fakeService: FakeService
    @Inject
    lateinit var fake1Service: Fake1Service
    @Inject
    lateinit var fake2Service: Fake2Service
    @Inject
    lateinit var analyticsServiceImpl: AnalyticsServiceImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fakeService.title = "二次赋值的标题"
        println("KevinTest fakeService $fakeService")

        fake1Service.title = "二次赋值的标题"
        println("KevinTest fakeService $fake1Service -- context=${fake1Service.context}")

        fake2Service.title = "二次赋值的标题, 使用构造函数给定默认值方式"
        println("KevinTest fake2Service $fake2Service")

        println("KevinTest analyticsServiceImpl ${analyticsServiceImpl.getTestMsg()}")

    }
}
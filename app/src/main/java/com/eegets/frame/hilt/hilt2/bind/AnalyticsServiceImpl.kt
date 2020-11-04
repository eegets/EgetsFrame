 package com.eegets.frame.hilt.hilt2.bind

 import com.eegets.frame.hilt.hilt2.bind.AnalyticsService
 import javax.inject.Inject

 /**
 * @packageName: com.example.android.architecture.blueprints.todoapp.kevinTest.bind
 * @author: eegets
 * @date: 20-10-16 上午9:39
 * @description: TODO
 */

 class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {

     fun getTestMsg(): String {
         return analytics()
     }
    override fun analytics() : String{
        return "这是使用@Bind方式绑定接口返回的结果值"
    }
 }
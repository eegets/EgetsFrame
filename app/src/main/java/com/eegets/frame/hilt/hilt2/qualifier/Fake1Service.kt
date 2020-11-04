 package com.eegets.frame.hilt.hilt2.qualifier

 import android.content.Context
 import com.eegets.frame.hilt.hilt2.qualifier.AnalyticsModule
 import dagger.hilt.android.qualifiers.ActivityContext
 import javax.inject.Inject

 /**
 * @packageName: com.example.android.architecture.blueprints.todoapp.data.source.test
 * @author: eegets
 * @date: 20-10-16 上午9:30
 * @description: TODO
 */
 // 第二种 Qualifier方式
 data class Fake1Service @Inject constructor(@ActivityContext val context: Context, @AnalyticsModule.QualifierTitle var title: String, @AnalyticsModule.QualifierDesc var des: String)
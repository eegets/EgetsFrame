 package com.eegets.frame.hilt.hilt2.qualifier

 import javax.inject.Inject
 import javax.inject.Named

 /**
 * @packageName: com.example.android.architecture.blueprints.todoapp.data.source.test
 * @author: eegets
 * @date: 20-10-15 下午5:55
 * @description: 限定符的两种使用方式,使用@Name的方式做限定符，但是有一个缺陷就是容易出现书写错误情况，除非将`@Name("XXXXX")`中的XXXXX抽离常量
 */

 const val NAME_TITLE = "NameTitle"
 const val NAME_DESC = "NameDesc"

 // 第一种 Name方式
 data class FakeService @Inject constructor(@Named(NAME_TITLE) var title: String, @Named(NAME_DESC) val des: String)
 //
 // // 第一种 Qualifier方式
 // data class FakeService1 @Inject constructor(@AnalyticsModule.AAA_AA val title: String, @AnalyticsModule.BBB_BB val des: String)
 //
 // data class FakeService2 constructor(var title: String, val des: String) {
 //    @Inject constructor() : this("标题", "描述")
 // }
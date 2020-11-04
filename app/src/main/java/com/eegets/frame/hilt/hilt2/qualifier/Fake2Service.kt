package com.eegets.frame.hilt.hilt2.qualifier//package com.example.android.architecture.blueprints.todoapp.kevinTest.qualifier

import javax.inject.Inject

/**
 * @packageName: com.example.android.architecture.blueprints.todoapp.data.source.test
 * @author: eegets
 * @date: 20-10-16 上午9:31
 * @description: TODO
 */

 //第三种，使用构造函数赋值默认值方式，这种有一个缺陷，这种设置限定在构造函数中，并非多出可以使用
 data class Fake2Service constructor(var title: String, val des: String) {
    @Inject
    constructor() : this("标题", "描述")
 }
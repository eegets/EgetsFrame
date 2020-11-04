package com.eegets.frame.hilt.hilt1

import javax.inject.Inject

/**
 * @packageName: com.eegets.egetsframe.hilt
 * @author: eegets
 * @date: 20-10-9 下午4:39
 * @description: TODO
 */

data class TestEntity constructor(var title: String, var desc: String) {
    @Inject constructor() : this("这是一个标题", "再加上一句描述")
}
package com.eegets.frame.dagger

import dagger.Component
import javax.inject.Inject

/**
 * @packageName: com.eegets.frame.dagger
 * @author: eegets
 * @date: 20-10-13 下午4:12
 * @description: TODO
 */

fun main() {

    TestDagger().testFunction()
}

@Component
interface TestComponent {
    fun inject(test: TestDagger?)
}

class TestDagger {
    constructor() {
        DaggerTestComponent.builder().build().inject(this)
    }
    @Inject
    lateinit var test: TestEntity

    fun testFunction() {
        println("今天天气 ${test.value} ${test.test1}")
    }
}

class TestEntity @Inject constructor() {
    val value = "不怎么样"
    val test1 = "另外一个属性"
}

class ClassA(b: ClassAAA) {
    var classB: ClassAAA

    init {
        classB = b
    }
}

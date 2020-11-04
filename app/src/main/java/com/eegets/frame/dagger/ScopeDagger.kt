package com.eegets.frame.dagger

/**
 * @packageName: com.eegets.frame.dagger
 * @author: eegets
 * @date: 20-10-13 下午4:14
 * @description: TODO
 */


import dagger.Component
import java.lang.annotation.Documented
import javax.inject.Inject
import javax.inject.Scope

/**
 * @packageName: com.eegets.egetsframe
 * @author: eegets
 * @date: 20-9-28 上午11:11
 * @description: 组件作用域
 */

fun main() {
    AAAAA().testFunction()
    BBBBB().testFunction()
}

@AAAAScope
@Component
interface AAAComponent {
    fun inject(test: AAAAA?)
}

@BBBBScope
@Component
interface BBBComponent {
    fun inject(test: BBBBB?)
}

class AAAAA {
    constructor() {
        DaggerAAAComponent.builder().build().inject(this)
    }
    //    @Inject
    lateinit var test: User

    fun testFunction() {
        println("AAAAAAAA ${test.value} ${test.test1}")
    }
}


class BBBBB {
    constructor() {
        DaggerBBBComponent.builder().build().inject(this)
    }
    @Inject
    lateinit var test: User

    fun testFunction() {
        println("BBBBBB ${test.value} ${test.test1}")
    }
}

@BBBBScope
class User @Inject constructor() {
    val value = "不怎么样"
    val test1 = "另外一个属性"
}

//实现一个AAAAA作用域,只针对被使用的Component组件
/**
 * AAAAScope 指向 AAAComponent
 */
@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class AAAAScope

/**
 * BBBBScope 指向 BBBComponent
 * 由于 User 指向了 BBBBScope, 那么此时如果AAAComponent也要使用注入的话就会报错
 */
@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class BBBBScope

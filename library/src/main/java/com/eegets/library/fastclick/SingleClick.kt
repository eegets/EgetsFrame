package com.eegets.library.fastclick

import java.lang.annotation.RetentionPolicy

/**
 * @packageName: com.eegets.library.fastclick
 * @author: eegets
 * @date: 20-10-9 上午10:09
 * @description: TODO
 *
 * https://juejin.im/post/6844904142016610311
 */

@Target(AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class SingleClick (
    val value: Long = 1500
)
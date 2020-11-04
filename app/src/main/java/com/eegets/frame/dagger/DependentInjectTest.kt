package com.eegets.frame.dagger

import javax.inject.Inject

/**
 * @packageName: com.eegets.frame.dagger
 * @author: eegets
 * @date: 20-10-12 下午2:14
 * @description: 使用四种方式实现依赖注入方式
 */

//fun main() {
//    ClassBBB()
//}
//
//interface TestInteface{　//方式1
//    fun setClassAAA(aaa: ClassAAA)
//}
//
///**
// * 依赖ClassAAA的类
// */
//class ClassBBB :TestInteface {　//方式1
//    var aaa : ClassAAA? = null
//    override fun setClassAAA(aaa: ClassAAA) {
//        this.aaa = aaa
//    }
//}
//
///**
// * 要被依赖注入的类
// */
class ClassAAA {
}

//class ClassBBB {　//方式2
//    var classA: ClassAAA? = null
//    fun setClassAAA(classA: ClassAAA?) {
//        this.classA = classA
//    }
//}

//class ClassBBB constructor(var classAAA: ClassAAA) {　//方式3
//
//}

//class ClassBBB {  ////方式4
//    @Inject
//    val classAAA: ClassAAA? = null
//}
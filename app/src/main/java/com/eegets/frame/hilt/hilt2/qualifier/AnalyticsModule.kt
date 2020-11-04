 package com.eegets.frame.hilt.hilt2.qualifier

 import dagger.Module
 import dagger.Provides
 import dagger.hilt.InstallIn
 import dagger.hilt.android.components.ActivityComponent
 import javax.inject.Named
 import javax.inject.Qualifier

 /**
 * @packageName: com.example.android.architecture.blueprints.todoapp.data.source.test
 * @author: eegets
 * @date: 20-10-15 下午6:22
 * @description: TODO
 */
 @Module
 @InstallIn(ActivityComponent::class)
 object AnalyticsModule {

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierTitle

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierDesc

     @QualifierTitle
     @Provides
     fun testQualifier(): String {
         return "原始Qualifier标题"
     }

     @QualifierDesc
     @Provides
     fun test1Qualifier(): String {
         return "原始Qualifier描述"
     }

    @Named(NAME_TITLE)
    @Provides
    fun testNamed(): String {
        return "原始Named限定符标题"
    }

    @Named(NAME_DESC)
    @Provides
    fun test1Named(): String {
        return "原始Named限定符描述"
    }
 }
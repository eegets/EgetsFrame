 package com.eegets.frame.hilt.hilt2.bind

 import dagger.Binds
 import dagger.Module
 import dagger.hilt.InstallIn
 import dagger.hilt.android.components.ActivityComponent

 /**
 * @packageName: com.example.android.architecture.blueprints.todoapp.kevinTest.bind
 * @author: eegets
 * @date: 20-10-16 上午9:40
 * @description: TODO
 */

 @Module
 @InstallIn(ActivityComponent::class)
 abstract class AnalyticsBindModule {

    @Binds
    abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl): AnalyticsService
 }
package com.eegets.frame.hilt.hilt1

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier

/**
 * @packageName: com.eegets.frame.hilt.hilt1
 * @author: eegets
 * @date: 20-10-12 下午3:59
 * @description: TODO
 */
@Module
@InstallIn(ApplicationComponent::class)
object TestModule {

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class RemoteTasksDataSource

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class LocalTasksDataSource
}
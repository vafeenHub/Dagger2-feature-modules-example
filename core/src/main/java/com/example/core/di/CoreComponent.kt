package com.example.core.di

import android.app.Application
import com.example.core.api.CoreDependency1
import com.example.core.api.CoreDependency2
import dagger.BindsInstance
import dagger.Component

@Component(modules = [CoreModule::class])
interface CoreComponent {
    fun coreDependency1(): CoreDependency1
    fun coreDependency2(): CoreDependency2
    fun application(): Application

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): CoreComponent
    }
}
package com.example.core.di

import com.example.core.api.CoreDependency1
import com.example.core.api.CoreDependency2
import com.example.core.impl.CoreDependency1Impl
import com.example.core.impl.CoreDependency2Impl
import dagger.Binds
import dagger.Module

@Module
internal interface CoreModule {
    @Binds
    fun bindsCoreDependency1(coreDependency1Impl: CoreDependency1Impl): CoreDependency1

    @Binds
    fun bindsCoreDependency2(coreDependency2Impl: CoreDependency2Impl): CoreDependency2
}
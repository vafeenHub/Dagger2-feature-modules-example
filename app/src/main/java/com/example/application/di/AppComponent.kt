package com.example.application.di

import com.example.core.di.CoreComponent
import com.example.feature1.api.Feature1Deps
import com.example.feature2.api.Feature2Deps
import dagger.Component

@Component(dependencies = [CoreComponent::class])
interface AppComponent : Feature1Deps, Feature2Deps {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }
}
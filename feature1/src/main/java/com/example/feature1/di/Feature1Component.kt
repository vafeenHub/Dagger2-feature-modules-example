package com.example.feature1.di

import com.example.feature1.api.Feature1Deps
import com.example.feature1.impl.Feature1ViewModel
import dagger.Component

@Component(modules = [Feature1Module::class], dependencies = [Feature1Deps::class])
internal interface Feature1Component {
    fun feature1ViewModel(): Feature1ViewModel

    @Component.Factory
    interface Factory {
        fun create(feature1Deps: Feature1Deps): Feature1Component
    }
}
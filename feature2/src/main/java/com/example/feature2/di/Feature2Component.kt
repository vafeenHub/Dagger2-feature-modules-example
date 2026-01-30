package com.example.feature2.di

import com.example.feature2.api.Feature2Deps
import com.example.feature2.impl.Feature2ViewModel
import dagger.Component

@Component(modules = [Feature2Module::class], dependencies = [Feature2Deps::class])
internal interface Feature2Component {
    fun feature2ViewModel(): Feature2ViewModel

    @Component.Factory
    interface Factory {
        fun create(feature1Deps: Feature2Deps): Feature2Component
    }
}
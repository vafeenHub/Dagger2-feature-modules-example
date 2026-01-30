package com.example.application.app

import android.app.Application
import com.example.application.di.DaggerAppComponent
import com.example.core.di.DaggerCoreComponent
import com.example.feature1.api.Feature1Deps
import com.example.feature2.api.Feature2Deps

internal class App : Application(), Feature1Deps.Provider, Feature2Deps.Provider {
    private val coreComponent = DaggerCoreComponent.factory().create(this)
    private val appComponent = DaggerAppComponent.factory().create(coreComponent)
    override fun feature1Deps(): Feature1Deps = appComponent
    override fun feature2Deps(): Feature2Deps = appComponent
}
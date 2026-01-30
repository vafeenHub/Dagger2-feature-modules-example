package com.example.feature1.di

import android.content.Context
import com.example.feature1.api.Feature1Deps

internal val Context.deps: Feature1Deps
    get() = (this as? Feature1Deps.Provider)?.feature1Deps() ?: this.applicationContext.deps
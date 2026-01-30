package com.example.feature2.di

import android.content.Context
import com.example.feature2.api.Feature2Deps

internal val Context.deps: Feature2Deps
    get() = (this as? Feature2Deps.Provider)?.feature2Deps() ?: this.applicationContext.deps
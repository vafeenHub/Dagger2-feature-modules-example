package com.example.feature1.api

import android.app.Application
import com.example.core.api.CoreDependency1

interface Feature1Deps {
    fun coreDependency1(): CoreDependency1
    fun application(): Application
    interface Provider {
        fun feature1Deps(): Feature1Deps
    }
}
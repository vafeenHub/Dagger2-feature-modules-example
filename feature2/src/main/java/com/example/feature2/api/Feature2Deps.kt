package com.example.feature2.api

import android.app.Application
import com.example.core.api.CoreDependency2

interface Feature2Deps {
    fun coreDependency2(): CoreDependency2
    fun application(): Application
    interface Provider {
        fun feature2Deps(): Feature2Deps
    }
}
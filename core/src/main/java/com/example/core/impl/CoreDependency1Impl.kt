package com.example.core.impl

import com.example.core.api.CoreDependency1
import javax.inject.Inject


internal class CoreDependency1Impl @Inject constructor() : CoreDependency1 {
    override val dep: String = this::class.simpleName.toString()
}
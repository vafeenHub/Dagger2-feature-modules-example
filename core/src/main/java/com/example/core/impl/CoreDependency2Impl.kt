package com.example.core.impl

import com.example.core.api.CoreDependency2
import javax.inject.Inject

internal class CoreDependency2Impl @Inject constructor() : CoreDependency2 {
    override val dep: String = this::class.simpleName.toString()
}
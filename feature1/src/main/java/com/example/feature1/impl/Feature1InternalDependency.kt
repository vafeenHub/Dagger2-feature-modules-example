package com.example.feature1.impl

import com.example.core.api.CoreDependency1
import javax.inject.Inject

internal class Feature1InternalDependency @Inject constructor(
    val coreDependency1: CoreDependency1
)
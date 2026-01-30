package com.example.feature2.impl

import com.example.core.api.CoreDependency2
import javax.inject.Inject

internal class Feature2InternalDependency @Inject constructor(
    val coreDependency2: CoreDependency2
)
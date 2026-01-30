package com.example.feature2.impl

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

internal class Feature2ViewModel @Inject constructor(
    private val feature2InternalDependency: Feature2InternalDependency
) : ViewModel() {
    fun print() {
        Log.e(
            "deps",
            "${this::class.simpleName}: ${feature2InternalDependency.coreDependency2.dep}"
        )
    }
}
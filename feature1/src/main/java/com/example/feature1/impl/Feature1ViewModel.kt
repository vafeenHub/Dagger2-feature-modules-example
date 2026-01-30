package com.example.feature1.impl

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

internal class Feature1ViewModel @Inject constructor(
    private val feature1InternalDependency: Feature1InternalDependency
) : ViewModel() {
    fun print() {
        Log.e(
            "deps",
            "${this::class.simpleName}: ${feature1InternalDependency.coreDependency1.dep}"
        )
    }
}
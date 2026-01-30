package com.example.feature2.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.core.api.daggerViewModel
import com.example.feature2.di.DaggerFeature2Component
import com.example.feature2.di.deps
import com.example.feature2.impl.Feature2ViewModel

@Composable
fun Feature2() {
    val context = LocalContext.current
    val feature2Component = remember {
        DaggerFeature2Component.factory().create(context.deps)
    }
    val viewModel: Feature2ViewModel = daggerViewModel { feature2Component.feature2ViewModel() }
    LaunchedEffect(null) {
        viewModel.print()
    }
}
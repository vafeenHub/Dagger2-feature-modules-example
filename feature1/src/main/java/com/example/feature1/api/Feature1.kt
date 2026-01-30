package com.example.feature1.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.core.api.daggerViewModel
import com.example.feature1.di.DaggerFeature1Component
import com.example.feature1.di.deps
import com.example.feature1.impl.Feature1ViewModel

@Composable
fun Feature1() {
    val context = LocalContext.current
    val feature1Component = remember {
        DaggerFeature1Component.factory().create(context.deps)
    }
    val viewModel: Feature1ViewModel = daggerViewModel { feature1Component.feature1ViewModel() }
    LaunchedEffect(null) {
        viewModel.print()
    }
}
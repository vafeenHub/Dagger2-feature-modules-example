package com.example.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.application.ui.theme.DaggerFeatureModulesExampleTheme
import com.example.feature1.api.Feature1
import com.example.feature2.api.Feature2

internal class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaggerFeatureModulesExampleTheme {
                Feature1()
                Feature2()
            }
        }
    }
}
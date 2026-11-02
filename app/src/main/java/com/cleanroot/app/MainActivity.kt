package com.cleanroot.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cleanroot.app.ui.navigation.CleanRootApp
import com.cleanroot.app.ui.theme.CleanRootTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanRootTheme {
                CleanRootApp()
            }
        }
    }
}

package com.pmdtaller2.CamiloBenitez_00083223

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.pmdtaller2.CamiloBenitez_00083223.ui.theme.FoodSpotByCbenitezTheme
import com.pmdtaller2.CamiloBenitez_00083223.ui.theme.components.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodSpotByCbenitezTheme {
                AppNavigation()
            }
        }
    }
}

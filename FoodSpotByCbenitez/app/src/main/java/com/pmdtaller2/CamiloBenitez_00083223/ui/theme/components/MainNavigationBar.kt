package com.pmdtaller2.CamiloBenitez_00083223.ui.theme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

// Sealed class para representar las diferentes pantallas de la aplicación
sealed class Screen(val route: String, val label: String, val icon: @Composable () -> Unit) {
    object Home : Screen("home", "Restaurantes", { Icon(Icons.Filled.Home, contentDescription = "Restaurantes") })
    object Search : Screen("search", "Buscar", { Icon(Icons.Filled.Search, contentDescription = "Buscar") })
    object Orders : Screen("orders", "Mis Órdenes", { Icon(Icons.Filled.List, contentDescription = "Mis Órdenes") })
}

// Función para crear la barra de navegación inferior
@Composable
fun MainNavigationBar(navController: NavHostController) {
    // Lista de pantallas para la barra de navegación inferior
    val screens = listOf(
        Screen.Home,
        Screen.Search,
        Screen.Orders,
    )

    // Para recordar la pantalla seleccionada
    var selectedItem by rememberSaveable { mutableStateOf(0) }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar(
        containerColor = Color.White, // Establece el color de fondo de la barra de navegación
    ) {
        screens.forEachIndexed { index, screen ->
            val isSelected = currentRoute == screen.route
            NavigationBarItem(
                icon = { screen.icon() }, // Llama al Composable del icono
                label = {
                    Text(
                        text = screen.label,
                        style = TextStyle(
                            fontSize = 10.sp, // Tamaño de fuente más pequeño
                            color = if (isSelected) Color.Black else Color.Gray // Color del texto
                        )
                    )
                },
                selected = isSelected,
                onClick = {
                    selectedItem = index
                    // Navegación correcta usando NavHostController
                    navController.navigate(screen.route) {
                        // Evita crear múltiples copias de la misma ruta en la pila
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent, // Elimina el color del indicador
                    selectedIconColor = Color.Black, // Color del icono seleccionado
                    selectedTextColor = Color.Black, // Color del texto seleccionado
                    unselectedIconColor = Color.Gray, // Color del icono no seleccionado
                    unselectedTextColor = Color.Gray, // Color del texto no seleccionado
                )
            )
        }
    }
}

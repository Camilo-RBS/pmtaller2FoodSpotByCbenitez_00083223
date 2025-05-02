package com.pmdtaller2.CamiloBenitez_00083223.ui.theme.components


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens.DetailScreen
import com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens.HomeScreen
import com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens.SearchScreen
import com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens.OrdersScreen
import com.pmdtaller2.CamiloBenitez_00083223.model.RestaurantRepository
import com.pmdtaller2.CamiloBenitez_00083223.viewmodel.RestaurantViewModel
import androidx.lifecycle.viewmodel.compose.viewModel



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val restaurants = RestaurantRepository.restaurants
    val viewModel: RestaurantViewModel = viewModel()

    Scaffold(
        bottomBar = {
            MainNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                HomeScreen(
                    onRestaurantClick = { selectedRestaurant ->
                        navController.navigate("detail/${selectedRestaurant.id}")
                    },
                    modifier = Modifier.padding(innerPadding),
                    viewModel = viewModel
                )
            }

            composable("search") {
                SearchScreen(
                    modifier = Modifier.padding(innerPadding),
                    viewModel = viewModel,
                    navController = navController
                )
            }

            composable("orders") {
                OrdersScreen(
                    modifier = Modifier.padding(innerPadding),
                    viewModel = viewModel
                )
            }

            composable("detail/{restaurantId}") { backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getString("restaurantId")
                val restaurant = restaurants.find { it.id.toString() == restaurantId }

                if (restaurant != null) {
                    DetailScreen(
                        restaurant = restaurant,
                        onBackClick = { navController.popBackStack() },
                        modifier = Modifier.padding(innerPadding),
                        viewModel = viewModel
                    )
                } else {
                    Text("Restaurante no encontrado")
                }
            }
        }
    }
}

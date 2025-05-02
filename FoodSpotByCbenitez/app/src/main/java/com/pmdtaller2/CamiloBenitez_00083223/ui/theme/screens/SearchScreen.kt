package com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmdtaller2.CamiloBenitez_00083223.viewmodel.RestaurantViewModel
import coil.compose.rememberAsyncImagePainter
import com.pmdtaller2.CamiloBenitez_00083223.model.Restaurant
import androidx.compose.material3.Card
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.compose.foundation.clickable
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.CardDefaults

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    viewModel: RestaurantViewModel = viewModel(),
    navController: NavHostController
) {
    val restaurants by viewModel.restaurantsByCategory.collectAsState()
    var searchText by remember { mutableStateOf("") }
    var searchTrigger by remember { mutableStateOf("") }

    // Controlador del teclado
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(modifier = modifier
        .fillMaxSize()
        .background(Color.White) // Fondo blanco para la pantalla
    ) {
        // Campo de búsqueda
        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            label = { Text("Buscar Restaurante, Platillo o Categoría", color = Color.Black) }, // Texto del label en negro
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done // Permite presionar Enter para finalizar la acción
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    // Al presionar Enter, se actualiza el filtro de búsqueda
                    searchTrigger = searchText.trim() // Actualiza el filtro de búsqueda
                    keyboardController?.hide() // Cierra el teclado
                }
            ),
            textStyle = TextStyle(color = Color.Black) // Establece el color del texto de entrada directamente
        )

        Text(
            text = "Restaurantes",
            style = TextStyle(fontSize = 20.sp, color = Color.Black), // Título "Restaurantes" en negro
            modifier = Modifier.padding(16.dp)
        )

        // Lista de restaurantes filtrados
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(restaurants.flatMap { it.value }) { restaurant ->
                 val match = restaurant.name.contains(searchTrigger, ignoreCase = true) ||
                        restaurant.category.contains(searchTrigger, ignoreCase = true) ||
                        restaurant.menu.any { item ->
                            item.name.contains(searchTrigger, ignoreCase = true) ||
                                    item.description.contains(searchTrigger, ignoreCase = true)
                        }

                if (match) {
                    RestaurantCard(restaurant = restaurant, navController = navController)
                }
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant, navController: NavHostController) {
    // Asigna un color basado en la categoría del restaurante
    val backgroundColor = when (restaurant.category.lowercase()) {
        "comida rapida" -> Color(0xFFFDD8D5) // Rosa claro
        "comida mexicana" -> Color(0xFFFFF9C4) // Amarillo claro
        "comida italiana" -> Color(0xFFF8BBD0) // Rosa más oscuro
        "comida asiatica" -> Color(0xFFD1C4E9) // Lila claro
        "comida saludable" -> Color(0xFFA5D6A7) // Verde menta claro
        "bebidas" -> Color(0xFF81D4FA) // Azul claro
        else -> Color.LightGray // Gris claro por defecto
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable {
                navController.navigate("detail/${restaurant.id}")
            },
        colors = CardDefaults.cardColors(containerColor = backgroundColor) // Establece el color de fondo de la tarjeta
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = restaurant.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = restaurant.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black
                )
                Text(
                    text = restaurant.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Black
                )
            }
        }
    }
}
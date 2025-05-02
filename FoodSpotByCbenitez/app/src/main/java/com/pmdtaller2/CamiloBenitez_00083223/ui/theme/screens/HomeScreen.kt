package com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.pmdtaller2.CamiloBenitez_00083223.model.Restaurant
import com.pmdtaller2.CamiloBenitez_00083223.viewmodel.RestaurantViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: RestaurantViewModel = viewModel(),
    onRestaurantClick: (Restaurant) -> Unit
) {
    val groupedRestaurants by viewModel.restaurantsByCategory.collectAsState()

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White) // Aseguramos el fondo blanco
    ) {
        groupedRestaurants.forEach { (category, restaurants) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold, // Hacemos el texto de la categoría más fuerte (negrita)
                    color = Color.Black, // Aseguramos que el color del texto sea negro o un color fuerte
                    modifier = Modifier.padding(16.dp)
                )
            }
            item {
                LazyRow(contentPadding = PaddingValues(horizontal = 16.dp)) {
                    items(restaurants) { restaurant ->
                        RestaurantCard(restaurant = restaurant, onClick = { onRestaurantClick(restaurant) })
                    }
                }
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    val cardBackgroundColor = when (restaurant.category) {
        "Comida Rapida" -> Color(0xFFFDD8D5) // Rosa claro
        "Comida Mexicana" -> Color(0xFFFFF9C4) // Amarillo claro
        "Comida Italiana" -> Color(0xFFF8BBD0) // Rosa más oscuro
        "Comida Asiatica" -> Color(0xFFD1C4E9) // Lila claro
        "Comida Saludable" -> Color(0xFFA5D6A7) // Verde menta claro
        "Bebidas" -> Color(0xFF81D4FA) // Azul claro
        else -> Color.LightGray // Color por defecto si no coincide
    }

    Card(
        modifier = Modifier
            .width(160.dp)
            .height(220.dp) // Aumentamos la altura para la descripción
            .padding(end = 12.dp, bottom = 8.dp)
            .clickable { onClick() }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize() // La columna ocupa todo el espacio de la Card
                .background(cardBackgroundColor) // Aplicamos el color de fondo a la Columna
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = rememberAsyncImagePainter(
                    model = restaurant.imageUrl,
                    onError = { error ->
                        Log.e("HomeScreen", "Error cargando imagen para ${restaurant.name}: ${error.result}")
                    }
                ),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black // Aseguramos que el nombre sea visible
            )
            Text(
                text = restaurant.description,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Black.copy(alpha = 0.7f), // Descripción con un poco de transparencia
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
package com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pmdtaller2.CamiloBenitez_00083223.model.Restaurant
import com.pmdtaller2.CamiloBenitez_00083223.model.MenuItem
import com.pmdtaller2.CamiloBenitez_00083223.viewmodel.RestaurantViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    restaurant: Restaurant,
    onBackClick: () -> Unit,
    viewModel: RestaurantViewModel
) {
    val context = LocalContext.current
    var menuSearchText by remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = restaurant.name, color = Color.Black) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.Black
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {
            item {
                RestaurantHeader(restaurant)
                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = menuSearchText,
                    onValueChange = { menuSearchText = it },
                    label = { Text("Buscar Platillo") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Black,
                        unfocusedBorderColor = Color.Gray,
                        focusedLabelColor = Color.Black,
                        unfocusedLabelColor = Color.Gray,
                        cursorColor = Color.Black,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    )
                )

                Text(
                    text = "Menú",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }

            val filteredMenu = restaurant.menu.filter {
                it.name.contains(menuSearchText, ignoreCase = true) ||
                        it.description.contains(menuSearchText, ignoreCase = true)
            }

            items(filteredMenu) { menuItem ->
                MenuItemCard(menuItem = menuItem, viewModel = viewModel)
            }
        }
    }
}

@Composable
fun RestaurantHeader(restaurant: Restaurant) {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = rememberAsyncImagePainter(model = restaurant.imageUrl),
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = restaurant.name,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = restaurant.description,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black.copy(alpha = 0.7f)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Categoría: ${restaurant.category}",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black.copy(alpha = 0.6f)
        )
    }
}

@Composable
fun MenuItemCard(menuItem: MenuItem, viewModel: RestaurantViewModel) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF2C2C2C)) // Fondo oscuro
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = menuItem.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White // Nombre en blanco
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = menuItem.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White.copy(alpha = 0.8f)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = rememberAsyncImagePainter(model = menuItem.imageUrl),
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {
                    viewModel.addItemToOrder(menuItem)
                    Toast.makeText(context, "${menuItem.name} agregado al carrito", Toast.LENGTH_SHORT).show()
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text("Agregar", color = Color.Black)
            }
        }
    }
}

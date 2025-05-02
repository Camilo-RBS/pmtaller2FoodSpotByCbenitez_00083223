package com.pmdtaller2.CamiloBenitez_00083223.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmdtaller2.CamiloBenitez_00083223.viewmodel.RestaurantViewModel
import androidx.compose.runtime.collectAsState
import com.pmdtaller2.CamiloBenitez_00083223.model.MenuItem

@Composable
fun OrdersScreen(
    modifier: Modifier = Modifier,
    viewModel: RestaurantViewModel = viewModel()
) {
    val orderItems: List<MenuItem> by viewModel.orderItems.collectAsState(initial = emptyList())

    Column(modifier = modifier.fillMaxSize()) {
        Text(
            text = "Mis Órdenes",
            style = TextStyle(fontSize = 20.sp),
            modifier = Modifier.padding(16.dp)
        )
        if (orderItems.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "No hay órdenes.")
            }
        } else {
            LazyColumn(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(orderItems) { item ->
                    Column(modifier = Modifier.padding(vertical = 8.dp)) {
                        Text(text = item.name, style = TextStyle(fontSize = 16.sp))
                        Text(text = item.description, style = TextStyle(fontSize = 12.sp))
                    }
                }
            }
        }
    }
}

package com.pmdtaller2.CamiloBenitez_00083223.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.pmdtaller2.CamiloBenitez_00083223.model.Restaurant
import com.pmdtaller2.CamiloBenitez_00083223.model.RestaurantRepository
import com.pmdtaller2.CamiloBenitez_00083223.model.MenuItem
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope

class RestaurantViewModel : ViewModel() {

    private val _restaurantsByCategory = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val restaurantsByCategory: StateFlow<Map<String, List<Restaurant>>> = _restaurantsByCategory

    private val _orderItems = MutableStateFlow<List<MenuItem>>(emptyList())
    val orderItems: StateFlow<List<MenuItem>> = _orderItems

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        val grouped = RestaurantRepository.restaurants.groupBy { it.category }
        _restaurantsByCategory.value = grouped
    }

    // Function to add an item to the order
    fun addItemToOrder(item: MenuItem) {
        viewModelScope.launch { // Use viewModelScope to launch a coroutine
            // Create a new list with the added item and emit it
            _orderItems.value = _orderItems.value + item
        }
    }
}

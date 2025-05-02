package com.pmdtaller2.CamiloBenitez_00083223.model

data class MenuItem(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val category: String,
    val imageUrl: String,
    val menu: List<MenuItem>
)
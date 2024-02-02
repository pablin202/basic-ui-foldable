package com.pdm.traveller.components

enum class CityNavigation {
    BOTTOM_NAVIGATION, NAVIGATION_RAIL, NAVIGATION_DRAWER
}

sealed class Screen(val route: String) {
    data object City : Screen("city")
    data object CityDetail : Screen("city/{cityIndex}") {
        fun createRoute(cityIndex: Int) = "city/$cityIndex"
    }
    data object Profile : Screen("profile")
}
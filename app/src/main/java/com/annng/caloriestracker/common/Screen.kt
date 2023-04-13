package com.annng.caloriestracker.common

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Categories : Screen("categories")
    object Product : Screen("product")
    object ProductDetail : Screen("product_detail") {
        const val routeWithArgument: String = "product_detail/{item}"
        const val argument0: String = "item"
    }
}

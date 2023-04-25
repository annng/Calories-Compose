package com.annng.caloriestracker.common

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object Categories : Screen("categories")
    object Product : Screen("product"){
        const val routeWithArgument: String = "product/{item}"
        const val argument0: String = "item"
    }
    object ProductDetail : Screen("product_detail") {
        const val routeWithArgument: String = "product_detail/{item}"
        const val argument0: String = "item"
    }
}

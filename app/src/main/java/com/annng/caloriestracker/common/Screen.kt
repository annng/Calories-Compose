package com.annng.caloriestracker.common

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Categories : Screen("categories")
    object Product : Screen("product")
}

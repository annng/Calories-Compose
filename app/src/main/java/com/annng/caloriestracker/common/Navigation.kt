package com.annng.caloriestracker.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.annng.caloriestracker.feature.presentation.home.HomeScreen
import com.annng.caloriestracker.feature.presentation.product.ProductScreen

@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    )
    {
        //home
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Product.route) {
            ProductScreen()
        }
    }
}
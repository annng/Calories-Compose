package com.annng.caloriestracker.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.annng.caloriestracker.feature.presentation.home.HomeScreen
import com.annng.caloriestracker.feature.presentation.product.detail.ProductDetailScreen
import com.annng.caloriestracker.feature.presentation.product.list.ProductScreen

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
            ProductScreen(navController)
        }
        composable(route = Screen.ProductDetail.routeWithArgument, arguments = listOf(
            navArgument(Screen.ProductDetail.argument0){ type = NavType.StringType }
        )){ backStackEntry ->
            val productName =
                backStackEntry.arguments?.getString(Screen.ProductDetail.argument0) ?: return@composable

            ProductDetailScreen(productName, navController)

        }
    }
}
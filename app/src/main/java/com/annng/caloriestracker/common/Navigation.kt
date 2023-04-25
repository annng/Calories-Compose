package com.annng.caloriestracker.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
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
fun Navigation(onOpenLogin : @Composable (NavController) -> Unit) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    )
    {

        //login
        composable(route = Screen.Login.route){
            onOpenLogin(navController)
        }
        //home
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }

        //product list
        composable(route = Screen.Product.routeWithArgument, arguments =
        listOf(navArgument(Screen.Product.argument0){
            type = NavType.StringType
        })
        ) { backStackEntry ->
            val productName =
                backStackEntry.arguments?.getString(Screen.ProductDetail.argument0) ?: return@composable

            ProductScreen(productName, navController)
        }

        //product detail
        composable(route = Screen.ProductDetail.routeWithArgument, arguments = listOf(
            navArgument(Screen.ProductDetail.argument0){ type = NavType.StringType }
        )){ backStackEntry ->
            val productName =
                backStackEntry.arguments?.getString(Screen.ProductDetail.argument0) ?: return@composable

            ProductDetailScreen(productName, navController)

        }
    }
}
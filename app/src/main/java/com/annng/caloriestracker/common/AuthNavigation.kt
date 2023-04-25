package com.annng.caloriestracker.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
fun AuthNavigation(isSigned : Boolean) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    )
    {
        //home
        composable(route = Screen.Login.route) {

            HomeScreen(navController = navController)
        }
    }
}
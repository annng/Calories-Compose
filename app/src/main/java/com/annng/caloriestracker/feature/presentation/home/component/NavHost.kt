package com.annng.caloriestracker.feature.presentation.home.component

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.annng.caloriestracker.common.Screen
import com.annng.caloriestracker.feature.presentation.categories.CategoriesScreen
import com.annng.caloriestracker.feature.presentation.product.ProductScreen

@Composable
fun NavHost(navController: NavController) {
    androidx.navigation.compose.NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.Categories.route,
    ) {
        composable(Screen.Categories.route) {
            CategoriesScreen(navController)
        }
    }
}
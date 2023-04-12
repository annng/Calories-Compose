package com.annng.caloriestracker.feature.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.annng.caloriestracker.common.Screen
import com.annng.caloriestracker.feature.presentation.home.component.DrawerNavigationMenu
import com.annng.caloriestracker.feature.presentation.home.component.NavHost
import com.annng.caloriestracker.ui.widget.AppBarHome
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navHostController = rememberNavController()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBarHome(navController = navController) {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }
        },
        drawerContent = {
            DrawerNavigationMenu(viewModel.drawerItems, scaffoldState, scope){
//                navHostController.navigate(it.title.lowercase()) {
//                    navHostController.graph.startDestinationId
//                    launchSingleTop = true
//                    restoreState = true
//                }
                navController.navigate(Screen.Product.route)
            }
        }
    ) { paddingValues ->
        NavHost(navController = navController)
    }
}
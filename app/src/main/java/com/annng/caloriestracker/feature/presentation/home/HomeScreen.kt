package com.annng.caloriestracker.feature.presentation.home

import androidx.compose.animation.Crossfade
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.annng.caloriestracker.feature.presentation.categories.CategoriesScreen
import com.annng.caloriestracker.feature.presentation.home.component.DrawerNavigationMenu
import com.annng.caloriestracker.ui.widget.AppBarHome
import com.annng.caloriestracker.ui.widget.systemUIBar
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navHostController = rememberNavController()

    systemUIBar()
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
                viewModel.setSelectedTab(it)
            }
        }
    ) { paddingValues ->
        Crossfade(viewModel.selectedTab.value) { destination ->
            when (destination) {
                0 -> CategoriesScreen(navController = navController) //categories
            }
        }
    }
}
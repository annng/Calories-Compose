package com.annng.caloriestracker.feature.presentation.product.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.annng.caloriestracker.R
import com.annng.caloriestracker.common.Screen
import com.annng.caloriestracker.feature.presentation.product.list.component.ProductsItem
import com.annng.caloriestracker.feature.presentation.product.list.component.TabItem
import com.annng.caloriestracker.ui.theme.White200
import com.annng.caloriestracker.ui.widget.ActionButton
import com.annng.caloriestracker.ui.widget.AppBar
import com.annng.caloriestracker.ui.widget.systemUIBar

@Composable
fun ProductScreen(
    navController: NavController,
    viewModel: ProductViewModel = hiltViewModel()
) {
    systemUIBar(White200)
    Scaffold(topBar = {
        AppBar(title = "List of Food", navController = navController) {
            ActionButton(resImg = R.drawable.ic_filter) {

            }
        }
    }) { paddingValues ->
        Column(Modifier.background(color = White200)) {
            LazyRow(modifier = Modifier.padding(8.dp), content = {
                items(viewModel.categoriesProducts) {
                    TabItem(isSelected = it.title == viewModel.selectedTab.value, item = it){ title ->
                        viewModel.setSelectedTab(title)
                    }
                }
            })
            Spacer(modifier = Modifier.height(8.dp))
            LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
                items(viewModel.products){
                    ProductsItem(item = it){
                        navController.navigate("${Screen.ProductDetail.route}/${it.title}")
                    }
                }
            })
        }
    }
}
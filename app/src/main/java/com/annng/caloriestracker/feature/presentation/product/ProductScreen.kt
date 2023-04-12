package com.annng.caloriestracker.feature.presentation.product

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.annng.caloriestracker.R
import com.annng.caloriestracker.domain.model.CategoryItem
import com.annng.caloriestracker.feature.presentation.product.component.TabItem
import com.annng.caloriestracker.ui.widget.ActionButton
import com.annng.caloriestracker.ui.widget.AppBar

@Composable
fun ProductScreen(

) {
    val navController = rememberNavController()

    Scaffold(topBar = {
        AppBar(title = "List of Food", navController = navController) {
            ActionButton(resImg = R.drawable.ic_filter) {

            }
        }
    }) { paddingValues ->
        LazyRow(content = {
            items(CategoryItem.generate()){
                TabItem(isSelected = it.title == "Burgers", item = it)
            }
        })
    }
}
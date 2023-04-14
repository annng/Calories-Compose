package com.annng.caloriestracker.feature.presentation.categories

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.annng.caloriestracker.common.Screen
import com.annng.caloriestracker.feature.presentation.categories.component.CategoriesItem
import com.annng.caloriestracker.ui.theme.White200
import com.annng.caloriestracker.ui.theme.Yellow400
import com.annng.caloriestracker.ui.widget.MyFieldSearch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoriesScreen(
    navController: NavController,
    viewModel: CategoriesViewModel = hiltViewModel()
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Yellow400)) {
        Column(
            Modifier
                .background(color = Yellow400)
                .padding(start = 16.dp, top = 16.dp, bottom = 48.dp, end = 16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Hello!", style = MaterialTheme.typography.h2)
            Text(
                text = "Find your meal!",
                style = MaterialTheme.typography.h2,
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.CenterHorizontally)
                .padding(top = 26.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = White200,
                        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                    )
            )
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp)
                .offset(y = (-26).dp),
            shape = RoundedCornerShape(16.dp),
                elevation = 0.dp
            ) {
                MyFieldSearch(value = "", placeholder = "Search")
            }

            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                modifier = Modifier.padding(top = 32.dp),
                contentPadding = PaddingValues(8.dp),
                verticalItemSpacing = 4.dp,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                items(viewModel.categoriesItems) {
                    CategoriesItem(item = it){
                        navController.navigate("${Screen.Product.route}/${it.title}"){

                        }
                    }
                }
            }
        }
    }
}
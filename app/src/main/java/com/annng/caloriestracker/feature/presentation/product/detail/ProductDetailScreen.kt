package com.annng.caloriestracker.feature.presentation.product.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.annng.caloriestracker.R
import com.annng.caloriestracker.feature.presentation.product.detail.component.RowNutrition
import com.annng.caloriestracker.feature.presentation.product.detail.component.RowUnit
import com.annng.caloriestracker.ui.theme.*
import com.annng.caloriestracker.ui.widget.ActionButton
import com.annng.caloriestracker.ui.widget.ActionButtonWithBackground
import com.annng.caloriestracker.ui.widget.AppBar
import com.annng.caloriestracker.ui.widget.systemUIBar


@Composable
fun ProductDetailScreen(
    title: String,
    navController: NavController,
    viewModel: ProductDetailViewModel = hiltViewModel()
) {

    systemUIBar(White200)
    var product = viewModel.getProduct(title)
    val favoritIcon = if (viewModel.isFavorite.value) R.drawable.ic_love_fill else R.drawable.ic_love_unselect
    val favoritBgColor = if (viewModel.isFavorite.value) Yellow100 else Grey100
    val favoritBorderColor = if (viewModel.isFavorite.value) Yellow400 else Grey400
    Scaffold(topBar = {
        AppBar(title = "", navController = navController) {
            ActionButtonWithBackground(favoritIcon, borderColor = favoritBorderColor, backgroundColor = favoritBgColor) {
                viewModel.setFavorite(!viewModel.isFavorite.value)
            }
        }
    }) { padding ->
        product?.let { item ->


            Column {
                Text(
                    text = title, style = MaterialTheme.typography.h3, textAlign = TextAlign.Center,
                    modifier = Modifier.padding(32.dp)
                )
                Image(painter = painterResource(id = item.resImg), contentDescription = "",
                modifier = Modifier
                    .height(256.dp)
                    .fillMaxWidth())
                Spacer(modifier = Modifier.height(36.dp))
                RowUnit(viewModel.selectedUnit.value){
                    viewModel.setSelectUnit(it)
                }
                Spacer(modifier = Modifier.height(24.dp))
                RowNutrition()
                Text(text = "Mouthwatering perfection starts with two 100% pure beef patties and Big Mac sauce sandwiched between a sesame seed bun. It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese.",
                style = MaterialTheme.typography.caption, textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 32.dp))
            }
        }
    }
}
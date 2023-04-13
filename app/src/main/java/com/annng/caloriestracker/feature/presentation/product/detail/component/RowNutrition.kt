package com.annng.caloriestracker.feature.presentation.product.detail.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RowNutrition() {
    Row {
        NutritionInfo(modifier = Modifier.weight(1f), title = "Kcal", value = 486)
        NutritionInfo(modifier = Modifier.weight(1f), title = "Fat", value = 13)
        NutritionInfo(modifier = Modifier.weight(1f), title = "Carbs", value = 51)
        NutritionInfo(modifier = Modifier.weight(1f), title = "Protein", value = 21)
    }
}

@Composable
fun NutritionInfo(modifier: Modifier, title : String, value : Int){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title, style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "$value", style = MaterialTheme.typography.h2)
    }
}
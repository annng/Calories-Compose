package com.annng.caloriestracker.feature.presentation.categories.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.domain.model.CategoryItem
import kotlin.random.Random

@Composable
fun CategoriesItem(modifier: Modifier = Modifier,
                   item: CategoryItem, onClick : () -> Unit) {
    Card(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {
                onClick()
            }
            .heightIn(Random.nextInt(from = 180, until = 230).dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 0.dp,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = item.resImg),
                contentDescription = item.title,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = item.title,
                style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}
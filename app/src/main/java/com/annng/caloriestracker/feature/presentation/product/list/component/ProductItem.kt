package com.annng.caloriestracker.feature.presentation.product.list.component

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
import com.annng.caloriestracker.domain.model.ProductItem
import kotlin.random.Random

@Composable
fun ProductsItem(modifier: Modifier = Modifier,
                   item: ProductItem, onClick : () -> Unit) {
    Card(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
            .heightIn(min = 220.dp)
            .clickable {
                onClick()
            },
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
                modifier = Modifier.fillMaxWidth().height(100.dp)
            )
            Text(
                text = item.title,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}
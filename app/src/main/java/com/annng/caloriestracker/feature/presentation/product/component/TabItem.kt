package com.annng.caloriestracker.feature.presentation.product.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.domain.model.CategoryItem
import com.annng.caloriestracker.ui.theme.Grey400
import com.annng.caloriestracker.ui.theme.Grey600
import com.annng.caloriestracker.ui.theme.Yellow400

@Composable
fun TabItem(isSelected : Boolean, item : CategoryItem){
    Column(Modifier.padding(horizontal = 8.dp)) {
        Text(text = item.title, style = MaterialTheme.typography.body1,
            color = if (isSelected) Color.Black else Grey400)
        Spacer(modifier = Modifier.height(8.dp))
       if(isSelected){
           Box(modifier = Modifier
               .width(30.dp)
               .height(3.dp)
               .background(Yellow400, shape = RoundedCornerShape(8.dp)))
       }
    }
}
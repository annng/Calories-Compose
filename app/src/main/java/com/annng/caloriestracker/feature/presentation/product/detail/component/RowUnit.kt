package com.annng.caloriestracker.feature.presentation.product.detail.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.ui.theme.Grey400
import com.annng.caloriestracker.ui.theme.Yellow400

@Composable
fun RowUnit(selectUnit: Int, selected: (Int) -> Unit) {
    Row(Modifier.padding(horizontal = 16.dp)) {
        selectedUnit(
            isSelected = selectUnit == 0,
            modifier = Modifier.weight(1f).clickable {
                selected(0)
            },
            text = "per 100g"
        )

        selectedUnit(
            isSelected = selectUnit == 1,
            modifier = Modifier
                .weight(1f)
                .clickable {
                    selected(1)
                },
            text = "per portion"
        )

        selectedUnit(
            isSelected = selectUnit == 2,
            modifier = Modifier.weight(1f).clickable {
                selected(2)
            },
            text = "per grams"
        )
    }
}

@Composable
fun selectedUnit(isSelected: Boolean, modifier: Modifier, text: String) {
    var colorBackground = if (isSelected) Yellow400 else Color.Transparent
    var colorText = if (isSelected) Color.Black else Grey400
    var modifierChip = if(isSelected){
        modifier
            .background(colorBackground, RoundedCornerShape(120.dp))
            .shadow(
                12.dp, shape = RoundedCornerShape(120.dp), spotColor = colorBackground,
                clip = true
            )
    }else{
        modifier
            .background(colorBackground, RoundedCornerShape(120.dp))
    }
    Box(
        modifier = modifierChip.padding(horizontal = 16.dp).height(42.dp), contentAlignment = Alignment.Center
    ) {
        Text(text = text, style = MaterialTheme.typography.button, color = colorText,
        modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
    }
}
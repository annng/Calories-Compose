package com.annng.caloriestracker.ui.widget

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.ui.theme.Yellow400

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NutritionSlider(
    title: String
) {
    var startValue by remember {
        mutableStateOf(0)
    }
    var endValue by remember {
        mutableStateOf(100)
    }

    var sliderValues by remember {
        mutableStateOf(0f..100f) // pass the initial values
    }

    Column(Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {

        Text(text = title, style = MaterialTheme.typography.h5, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(text = "${startValue}g", style = MaterialTheme.typography.body1, color = Color.Black)
            Text(text = "${endValue}g", style = MaterialTheme.typography.body1, color = Color.Black)
        }
        RangeSlider(
            value = sliderValues,
            onValueChange = {sliderValues_ ->
                sliderValues = sliderValues_
                startValue = sliderValues.start.toInt()
                endValue = sliderValues.endInclusive.toInt()
            },
            valueRange = 0f..100f,
            onValueChangeFinished = {

            },
            colors = SliderDefaults.colors(
                thumbColor = Yellow400,
                activeTickColor = Yellow400
            )
        )
    }
}
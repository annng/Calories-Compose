package com.annng.caloriestracker.feature.presentation.categories.component

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.ui.theme.White200
import com.annng.caloriestracker.ui.widget.FieldPicker
import com.annng.caloriestracker.ui.widget.MyFieldSearch
import com.annng.caloriestracker.ui.widget.NutritionSlider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FilterSheet(
    coroutineScope: CoroutineScope,
    modalSheetState: ModalBottomSheetState,
    content: @Composable () -> Unit
) {
    var isSheetFullScreen by remember { mutableStateOf(false) }
    val roundedCornerRadius = if (isSheetFullScreen) 0.dp else 12.dp
    val modifier = if (isSheetFullScreen)
        Modifier
            .fillMaxSize()
    else
        Modifier.fillMaxWidth()

    BackHandler(modalSheetState.isVisible) {
        coroutineScope.launch { modalSheetState.hide() }
    }

    ModalBottomSheetLayout(
        sheetState = modalSheetState,
        sheetShape = RoundedCornerShape(
            topStart = roundedCornerRadius,
            topEnd = roundedCornerRadius
        ),
        sheetContent = {
            Column(
                modifier = modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Filter", style = MaterialTheme.typography.h6)
                Spacer(modifier = Modifier.height(32.dp))
                Box(
                    Modifier
                        .padding(horizontal = 8.dp)
                        .background(color = White200, shape = RoundedCornerShape(16.dp))
                ) {
                    MyFieldSearch(
                        value = "",
                        placeholder = "Product Name"
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                FieldPicker(title = "Sort by", selectedValue = "The most of proteins")
                FieldPicker(title = "Distance", selectedValue = "25 km")

                NutritionSlider("Protein")
                NutritionSlider("Carbs")
                NutritionSlider("Fats")

                Button(
                    onClick = {
                        coroutineScope.launch { modalSheetState.hide() }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(horizontal = 24.dp),
                    shape = RoundedCornerShape(120.dp)
                ) {
                    Text(
                        text = "Filter",
                        style = MaterialTheme.typography.button,
                        color = Color.Black
                    )
                }
            }
        }
    ) {
        content()
    }
}
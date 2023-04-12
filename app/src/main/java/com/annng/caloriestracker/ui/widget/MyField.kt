package com.annng.caloriestracker.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import com.annng.caloriestracker.R

@Composable
fun MyFieldSearch(
    value: String,
    placeholder: String
) {
    var text by remember { mutableStateOf(TextFieldValue(value)) }
    return TextField(
        value = text,
        leadingIcon = {
            Image(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "Search"
            )
        },
        onValueChange = {
            text = it
        },
        placeholder = { Text(text = placeholder) },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}
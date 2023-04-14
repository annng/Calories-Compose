package com.annng.caloriestracker.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.R

@Composable
fun MyFieldSearch(
    value: String,
    placeholder: String,
    backgroundColor: Color = Color.Transparent
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
            backgroundColor = backgroundColor,
            focusedIndicatorColor = backgroundColor,
            unfocusedIndicatorColor = backgroundColor
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun FieldPicker(title: String, selectedValue: String, resIcon: Int = R.drawable.ic_dropdown) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(vertical = 12.dp, horizontal = 16.dp).fillMaxWidth()
    ) {
        Text(text = title, style = MaterialTheme.typography.body2)
        Row {
            Text(text = selectedValue, style = MaterialTheme.typography.body1, color = Color.Black)
            Image(
                painter = painterResource(id = resIcon),
                contentDescription = "expand field $title",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
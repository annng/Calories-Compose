package com.annng.caloriestracker.ui.widget

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.ui.theme.Grey400

@Composable
fun ActionButton(resImg: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = resImg),
            tint = Color.Black,
            contentDescription = "action button",
            modifier = Modifier.size(20.dp)
        )
    }
}
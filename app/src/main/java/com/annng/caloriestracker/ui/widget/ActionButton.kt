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
import com.annng.caloriestracker.ui.theme.Grey200
import com.annng.caloriestracker.ui.theme.Grey400
import com.annng.caloriestracker.ui.theme.White200

@Composable
fun ActionButton(resImg: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .background(White200, shape = RoundedCornerShape(6.dp))
            .border(1.dp, Grey200, shape = RoundedCornerShape(6.dp))
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = resImg),
            contentDescription = "action button",
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
fun ActionButtonWithBackground(resImg: Int, borderColor : Color = Grey200, backgroundColor: Color = White200, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .background(backgroundColor, shape = RoundedCornerShape(6.dp))
            .border(1.dp, borderColor, shape = RoundedCornerShape(6.dp))
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = resImg),
            contentDescription = "action button",
            modifier = Modifier.size(24.dp)
        )
    }
}
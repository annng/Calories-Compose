package com.annng.caloriestracker.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.annng.caloriestracker.R


// Font Family
val UbuntuFontFamily = FontFamily(
    Font(R.font.light, FontWeight.Light),
    Font(R.font.regular, FontWeight.Normal),
    Font(R.font.medium, FontWeight.Medium),
    Font(R.font.bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val DarkTypography = Typography(
    h1 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 41.sp,
        color = Color.White
    ),
    h2 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 28.sp
    ),
    h3 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 27.sp
    ),
    h4 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 22.sp
    ),
    h5 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 21.sp
    ),
    h6 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 17.sp
    ),
    body1 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Normal,
        color = Color.White,
        fontSize = 17.sp
    ),
    body2 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Light,
        color = Color.White,
        fontSize = 13.sp
    )
)

// set of light material typography styles to start with.
val LightTypography = Typography(
    h1 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 41.sp,
        color = Color.Black
    ),
    h2 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 28.sp
    ),
    h3 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 27.sp
    ),
    h4 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 22.sp
    ),
    h5 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 21.sp
    ),
    h6 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 17.sp
    ),
    body1 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Grey400,
        fontSize = 17.sp
    ),
    body2 = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Normal,
        color = Grey400,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = UbuntuFontFamily,
        fontWeight = FontWeight.Light,
        color = Grey600,
        fontSize = 13.sp,
        lineHeight = 16.sp
    )
)
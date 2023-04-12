package com.annng.caloriestracker.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.annng.caloriestracker.R
import com.annng.caloriestracker.ui.theme.Yellow400

@Composable
fun AppBar(title: String, navController: NavController, isBack : Boolean = true,
actionButton : @Composable RowScope.() -> Unit) {

    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color.White,
        contentColor = Color.White,
        elevation = 0.7.dp
    ) {
        if (isBack) ActionButton(resImg = R.drawable.ic_back) {
            navController.popBackStack()
        }
        Text(
            text = title,
            textAlign = TextAlign.Center, color = Color.Black,
            modifier = Modifier.weight(1f),
            fontSize = 16.sp, fontFamily = FontFamily.SansSerif
        )
        actionButton()
    }
}

@Composable
fun AppBarHome(navController: NavController, onNavigationClick : () -> Unit) {

    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Yellow400,
        contentColor = Color.White,
        elevation = 0.7.dp,
    ) {
        Image(
            modifier = Modifier
                .padding(5.dp)
                .clickable {
                    onNavigationClick()
                },
            contentScale = ContentScale.Fit,
            painter = painterResource(id = R.drawable.ic_navigation),
            contentDescription = ""
        )
    }
}
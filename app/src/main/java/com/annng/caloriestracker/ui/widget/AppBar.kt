package com.annng.caloriestracker.ui.widget

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
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
import com.annng.caloriestracker.ui.theme.White200
import com.annng.caloriestracker.ui.theme.Yellow400
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun AppBar(title: String, navController: NavController, isBack : Boolean = true,
actionButton : @Composable RowScope.() -> Unit) {

    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = White200,
        contentColor = White200,
        elevation = 0.dp
    ) {
        Spacer(modifier = Modifier.width(8.dp))
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
        Spacer(modifier = Modifier.width(8.dp))
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

@Composable
fun systemUIBar(statusBarColor : Color = Yellow400){
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    DisposableEffect(systemUiController, useDarkIcons) {
        // Update all of the system bar colors to be transparent, and use
        // dark icons if we're in light theme
        systemUiController.setSystemBarsColor(
            color = statusBarColor,
            darkIcons = useDarkIcons
        )

        // setStatusBarColor() and setNavigationBarColor() also exist

        onDispose {}
    }
}
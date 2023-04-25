package com.annng.caloriestracker.feature.presentation.auth

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.annng.caloriestracker.feature.presentation.auth.component.LoginState

@Composable
fun LoginScreen(
    state : LoginState,
    onSignInClick : () -> Unit,
    viewModel: LoginViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let {
            error -> Toast.makeText(context, error, Toast.LENGTH_LONG).show()
        }
    }
    Scaffold() { padding ->
        Column {

        }
    }
}
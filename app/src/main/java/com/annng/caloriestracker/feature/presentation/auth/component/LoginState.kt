package com.annng.caloriestracker.feature.presentation.auth.component

data class LoginState(
    val isSignInSuccessful: Boolean = false,
    val signInError : String? = null
)
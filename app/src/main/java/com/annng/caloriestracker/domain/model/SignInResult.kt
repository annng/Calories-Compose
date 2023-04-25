package com.annng.caloriestracker.domain.model

data class SignInResult(
    val data: UserData? = null,
    val errorMessage : String? = null
)

data class UserData(
    val userId : String,
    val username : String?,
    val userPicture : String?
)
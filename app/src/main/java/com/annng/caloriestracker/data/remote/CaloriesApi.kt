package com.annng.caloriestracker.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CaloriesApi {
    @GET("users")
    suspend fun getUsers(): List<String>

    @GET("users/{username}")
    suspend fun getUsers(
        @Path("username") username : String
    ): String
}
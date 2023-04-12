package com.annng.caloriestracker.domain.repository


interface CaloriesRepository {
    suspend fun getUsers(): List<String>
    suspend fun getUser(username : String): String
}
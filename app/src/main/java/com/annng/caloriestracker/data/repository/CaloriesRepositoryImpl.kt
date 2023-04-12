package com.annng.caloriestracker.data.repository

import com.annng.caloriestracker.data.remote.CaloriesApi
import com.annng.caloriestracker.domain.repository.CaloriesRepository
import javax.inject.Inject

class CaloriesRepositoryImpl @Inject constructor(private val api : CaloriesApi) : CaloriesRepository{
    override suspend fun getUsers(): List<String> {
        return api.getUsers()
    }

    override suspend fun getUser(username : String): String {
        return api.getUsers(username)
    }

}
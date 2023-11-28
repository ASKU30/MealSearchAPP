package com.example.mealapp.data.repository

import com.example.mealapp.data.model.MealsDTO
import com.example.mealapp.data.remote.MealSearchAPI
import com.example.mealapp.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}
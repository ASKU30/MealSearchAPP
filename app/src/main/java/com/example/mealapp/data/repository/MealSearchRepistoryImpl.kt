package com.example.mealapp.data.repository

import com.example.mealapp.data.model.MealsDTO
import com.example.mealapp.data.remote.MealSearchAPI
import com.example.mealapp.domain.repository.MealSearchRepository

class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}
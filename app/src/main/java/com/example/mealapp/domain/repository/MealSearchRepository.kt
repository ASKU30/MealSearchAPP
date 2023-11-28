package com.example.mealapp.domain.repository

import com.example.mealapp.data.model.MealsDTO


interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO



}
package com.example.mealapp.domain.repository

import com.example.mealapp.data.model.MealsDTO


interface MealDetailsRepository {

    suspend fun getMealDetails(id:String): MealsDTO

}
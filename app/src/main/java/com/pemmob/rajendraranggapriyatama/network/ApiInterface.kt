package com.pemmob.rajendraranggapriyatama.network

import com.pemmob.rajendraranggapriyatama.data.model.Category
import com.pemmob.rajendraranggapriyatama.data.model.Product
import com.pemmob.rajendraranggapriyatama.util.JualanConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("data/categories.json")
    suspend fun getCategories(): List<Category>

    @GET("data/products.json")
    suspend fun getProducts(): List<Product>
}

object ApiClient {
    val instance: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(JualanConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}
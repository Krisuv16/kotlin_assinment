package com.example.krisuvbohara_mapd711_optional_assignment.network


import com.example.krisuvbohara_mapd711_optional_assignment.models.Product
import com.example.krisuvbohara_mapd711_optional_assignment.models.ProductModelItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products/category/fragrances")
    fun fetchData() : Call<Product>
}
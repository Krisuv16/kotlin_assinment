package com.example.krisuvbohara_mapd711_optional_assignment.models


import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("products")
    val products: List<ProductX>,
    @SerializedName("skip")
    val skip: Int,
    @SerializedName("total")
    val total: Int
)
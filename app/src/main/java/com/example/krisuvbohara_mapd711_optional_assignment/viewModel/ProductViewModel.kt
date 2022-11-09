package com.example.krisuvbohara_mapd711_optional_assignment.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.krisuvbohara_mapd711_optional_assignment.models.Product
import com.example.krisuvbohara_mapd711_optional_assignment.models.ProductModelItem
import com.example.krisuvbohara_mapd711_optional_assignment.network.ApiConfig
import com.example.krisuvbohara_mapd711_optional_assignment.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductViewModel : ViewModel() {
    val productDataList = MutableLiveData<ArrayList<ProductModelItem>>()
    val product = MutableLiveData<Product>()

//    fun fetchProductData(){
//        val services = ApiConfig.getRetroFitInstance().create(ApiInterface:: class.java)
//        services.fetchData().enqueue(object : Callback<ArrayList<ProductModelItem>>{
//            override fun onResponse(call: Call<ArrayList<ProductModelItem>>, response: Response<ArrayList<ProductModelItem>>) {
//                println(response.body())
////                productDataList.value = response.body()
////                println(productDataList.value!![0].title)
//            }
//            override fun onFailure(call: Call<ArrayList<ProductModelItem>>, t: Throwable) {
//                println(t)
//                println("Failed")
//            }
//        })
//    }

    fun fetchProductData(){
        val services = ApiConfig.getRetroFitInstance().create(ApiInterface:: class.java)
        services.fetchData().enqueue(object : Callback<Product>{
            override fun onFailure(call: Call<Product>, t: Throwable) {
                println(t)
                println("asdasd")
            }
            override fun onResponse(call: Call<Product>, response: Response<Product>) {
                println(response.body()!!.products[0].title)
            }
        })
    }
}
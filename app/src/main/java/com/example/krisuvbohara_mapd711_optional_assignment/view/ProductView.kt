package com.example.krisuvbohara_mapd711_optional_assignment.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.krisuvbohara_mapd711_optional_assignment.R
import com.example.krisuvbohara_mapd711_optional_assignment.viewModel.ProductViewModel

class ProductView : AppCompatActivity() {
    private lateinit var productViewModel : ProductViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.x)
        callingViewModel()
    }

    fun callingViewModel(){
        productViewModel = ViewModelProvider(this)[ProductViewModel::class.java]

        productViewModel.fetchProductData()
    }
}
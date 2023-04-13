package com.annng.caloriestracker.feature.presentation.product.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.annng.caloriestracker.domain.model.ProductItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel @Inject constructor() : ViewModel(){

    var products = ProductItem.generate()

    private val _selectedUnit: MutableState<Int> = mutableStateOf(1)
    val selectedUnit: State<Int> get() = _selectedUnit

    private val _isFavorite: MutableState<Boolean> = mutableStateOf(false)
    val isFavorite: State<Boolean> get() = _isFavorite

    fun getProduct(item: String) : ProductItem?{
        return products.find { item == it.title }
    }

    fun setSelectUnit(position : Int){
        _selectedUnit.value = position
    }

    fun setFavorite(isFavorite : Boolean){
        _isFavorite.value = isFavorite
    }
}
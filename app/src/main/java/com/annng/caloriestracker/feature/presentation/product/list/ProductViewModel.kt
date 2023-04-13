package com.annng.caloriestracker.feature.presentation.product.list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.annng.caloriestracker.domain.model.CategoryItem
import com.annng.caloriestracker.domain.model.MenuItem
import com.annng.caloriestracker.domain.model.ProductItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor() : ViewModel() {

    private val _selectedTab: MutableState<String> = mutableStateOf("Burgers")
    val selectedTab: State<String> get() = _selectedTab

    var categoriesProducts = CategoryItem.generate()
    var products = ProductItem.generate()

    fun setSelectedTab(item: String){
        _selectedTab.value = item
    }
}
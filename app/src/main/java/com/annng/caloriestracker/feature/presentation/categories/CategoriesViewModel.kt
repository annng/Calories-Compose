package com.annng.caloriestracker.feature.presentation.categories

import androidx.lifecycle.ViewModel
import com.annng.caloriestracker.domain.model.CategoryItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor() : ViewModel() {

    var categoriesItems = CategoryItem.generate()
}
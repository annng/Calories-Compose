package com.annng.caloriestracker.feature.presentation.home

import androidx.lifecycle.ViewModel
import com.annng.caloriestracker.domain.model.MenuItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(){

    var drawerItems = MenuItem.generate()
}
package com.annng.caloriestracker.feature.presentation.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.annng.caloriestracker.domain.model.MenuItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(){

    var drawerItems = MenuItem.generate()

    private val _selectedTab: MutableState<Int> = mutableStateOf(0)
    val selectedTab: State<Int> get() = _selectedTab

    fun setSelectedTab(item: MenuItem){
        _selectedTab.value = drawerItems.indexOf(item)
    }
}
package com.annng.caloriestracker.domain.model

import com.annng.caloriestracker.R

data class CategoryItem(
    val resImg : Int,
    val title : String
) {

    companion object{
        fun generate() : List<CategoryItem>{
            return listOf(
                CategoryItem(R.drawable.ic_burgers, "Burgers"),
                CategoryItem(R.drawable.ic_drinks, "Drinks"),
                CategoryItem(R.drawable.ic_wraps, "Wraps"),
                CategoryItem(R.drawable.ic_vegan, "Vegan"),
                CategoryItem(R.drawable.ic_beer, "Beer"),
                CategoryItem(R.drawable.ic_favourite, "Favourite"),
            )
        }
    }
}
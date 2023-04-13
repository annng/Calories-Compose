package com.annng.caloriestracker.domain.model

import com.annng.caloriestracker.R

data class ProductItem(
    val resImg : Int,
    val title : String
) {

    companion object{
        fun generate() : List<ProductItem>{
            return listOf(
                ProductItem(R.drawable.burger_1, "Cheeseburgers"),
                ProductItem(R.drawable.burger_2, "Longer"),
                ProductItem(R.drawable.burger_3, "Double Whopper Texas"),
                ProductItem(R.drawable.burger_4, "Wloski Pastuch"),
                ProductItem(R.drawable.burger_4, "Maestro Grill"),
                ProductItem(R.drawable.burger_5, "Quarter Pounder with Cheese"),
            )
        }
    }
}
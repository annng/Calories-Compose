package com.annng.caloriestracker.domain.model

data class MenuItem(
    val title : String
){
    companion object {
        fun generate(): List<MenuItem> {
            return listOf(
                MenuItem("Categories"),
                MenuItem("Rank of users"),
                MenuItem("Weight"),
                MenuItem("About App"),
                MenuItem("Help"),
            )
        }
    }
}
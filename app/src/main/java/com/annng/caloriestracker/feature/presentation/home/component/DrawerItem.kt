package com.annng.caloriestracker.feature.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.annng.caloriestracker.domain.model.MenuItem
import com.annng.caloriestracker.ui.theme.Grey400
import com.annng.caloriestracker.ui.theme.Yellow400

@Composable
fun DrawerItem(menuItem: MenuItem, modifier: Modifier = Modifier, onItemClick: (MenuItem) -> Unit) {
    val isSelected = menuItem.title.equals("Categories")
    Column(
        modifier = Modifier.clickable {
            onItemClick(menuItem)
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .padding(vertical = 24.dp)
        ) {
            Text(
                text = menuItem.title,
                modifier = Modifier.padding(horizontal = 10.dp),
                style = MaterialTheme.typography.body1,
                color = if(isSelected) Color.Black else Grey400
            )
            if(isSelected) {
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .background(color = Yellow400, shape = CircleShape)
                )
            }
        }
    }
}
package com.annng.caloriestracker.feature.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.size.Size
import com.annng.caloriestracker.R
import com.annng.caloriestracker.domain.model.MenuItem
import com.annng.caloriestracker.ui.theme.Grey400
import com.annng.caloriestracker.ui.theme.Yellow400
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerNavigationMenu(
    menuItems: List<MenuItem>,
    scaffoldState: ScaffoldState,
    scope: CoroutineScope,
    modifier: Modifier = Modifier,
    onItemClick: (MenuItem) -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 32.dp)) {
            Image(
                painter = painterResource(id = R.drawable.burger_1),
                contentDescription = "photo profile",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column() {
                Text(text = "John Doe", style = MaterialTheme.typography.h5)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Edit profile", style = MaterialTheme.typography.body1, color = Grey400)
            }
        }

        Spacer(modifier = Modifier.height(130.dp))
        LazyColumn(
            modifier = modifier
        ) {
            items(menuItems) { item ->
                DrawerItem(
                    item,
                    modifier = modifier
                ) {
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                    onItemClick(item)
                }
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .padding(vertical = 24.dp)
        ) {
            Text(
                text = "Settings | Logout",
                modifier = Modifier.padding(horizontal = 10.dp),
                style = MaterialTheme.typography.body1,
                color = Grey400
            )
        }
    }
}
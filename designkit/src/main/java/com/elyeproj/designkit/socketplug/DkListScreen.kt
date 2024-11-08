package com.elyeproj.designkit.socketplug

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.defaultBackgroundColor
import com.elyeproj.designkit.defaultBorderColor
import com.elyeproj.designkit.errorColor
import com.elyeproj.designkit.teamViewRegistration

@Composable
fun DkListScreen(content: List<Pair<String, String>>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
            .background(defaultBackgroundColor)
    ) {
        Text("This is the Socket List!!")
        LazyColumn(contentPadding = PaddingValues(0.dp)) {
            content.forEach { element ->
                item {
                    teamViewRegistration
                        .getListItemView(
                            element.first, element.second).invoke(this)
                }
            }
        }
    }
}

@Composable
fun DkListItem(content: @Composable () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(defaultBackgroundColor)
            .padding(10.dp)
            .border(BorderStroke(2.dp, SolidColor(defaultBorderColor)))
    ) {
        Text("Template from List Item")
        content.invoke()
    }
}

@Composable
fun DefaultErrorDkListItem() {
    DkListItem {
        Box(modifier = Modifier.fillMaxWidth().background(errorColor), contentAlignment = Alignment.Center) {
            Text("ERROR LIST ITEM!!")
        }
    }
}

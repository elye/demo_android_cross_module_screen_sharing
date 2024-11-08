package com.elyeproj.designkit.socketplug

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.defaultBackgroundColor
import com.elyeproj.designkit.defaultBorderColor
import com.elyeproj.designkit.errorColor
import com.elyeproj.designkit.teamViewRegistration

@Composable
fun DkTabContainer(contents: List<Pair<String, String>>) {
    var tabIndex by remember { mutableIntStateOf(0) }

    Column(modifier = Modifier.fillMaxWidth()
        .background(defaultBackgroundColor)
    ) {
        TabRow(selectedTabIndex = tabIndex) {
            contents.forEachIndexed { index, content ->
                Tab(text = { Text(teamViewRegistration
                    .getTabScreenTitle(content.first)) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        teamViewRegistration.getTabScreenView(
            contents[tabIndex].first,
            contents[tabIndex].second).invoke()
    }
}

@Composable
fun DkTabScreen(content: @Composable () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .border(BorderStroke(2.dp, SolidColor(defaultBorderColor)))
            .background(defaultBackgroundColor)

    ) {
        Text("Template from Tab Screen")
        content.invoke()
    }
}

@Composable
fun DefaultErrorDkTabScreen() {
    DkTabScreen {
        Box(modifier = Modifier.fillMaxSize().background(errorColor), contentAlignment = Alignment.Center) {
            Text("ERROR TAB SCREEN!!")
        }
    }
}
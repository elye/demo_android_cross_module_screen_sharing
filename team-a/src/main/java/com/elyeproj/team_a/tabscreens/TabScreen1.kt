package com.elyeproj.team_a.tabscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.DkTextView
import com.elyeproj.designkit.socketplug.DkTabScreen
import com.elyeproj.team_a.teamColor
import com.elyeproj.team_a.teamName

@Composable
fun TabScreen1(data: String) {
    DkTabScreen {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(teamColor),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                DkTextView(teamName)
                DkTextView("Tab Screen 1")
                DkTextView("Data: $data")
            }
        }
    }
}
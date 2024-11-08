package com.elyeproj.team_b.tabscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.elyeproj.designkit.DkTextView
import com.elyeproj.designkit.socketplug.DkTabScreen
import com.elyeproj.team_b.teamColor
import com.elyeproj.team_b.teamName

@Composable
fun TabScreen3(data: String) {
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
                DkTextView("Tab Screen 3")
                DkTextView("Data: $data")
            }
        }
    }
}
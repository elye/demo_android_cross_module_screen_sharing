package com.elyeproj.team_a.tabscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.elyeproj.designkit.DkTextView
import com.elyeproj.designkit.socketplug.DkTabScreen
import com.elyeproj.team_a.teamColor
import com.elyeproj.team_a.teamName

@Composable
fun TabScreen2(data: String) {
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
                DkTextView("Tab Screen 2")
                DkTextView("Data: $data")
            }
        }
    }
}
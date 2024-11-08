package com.elyeproj.team_a.tabscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import com.elyeproj.designkit.socketplug.DkListScreen
import com.elyeproj.designkit.socketplug.DkTabScreen
import com.elyeproj.team_a.teamColor
import com.elyeproj.team_a.teamName

@Composable
fun TabScreen4(data: String) {
    DkTabScreen {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(teamColor),
            contentAlignment = Alignment.Center
        ) {
            Spacer(modifier = Modifier.padding(8.dp))
            DkTextView("This is Team A Tab Screen 4 Calling List Screen")
            DkListScreen(
                listOf(
                    "TeamAListItem4" to "Activity A gives",
                    "TeamAListItem4" to "send over from A",
                    "TeamBListItem3" to "A has provided",
                    "TeamAListItem4" to "data from Act A",
                    "TeamAListItem3" to "it is from A",
                    "TeamAListItem4" to "Here is from A",
                )
            )
        }
    }
}
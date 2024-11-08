package com.elyeproj.team_b.tabscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.DkTextView
import com.elyeproj.designkit.socketplug.DkListScreen
import com.elyeproj.designkit.socketplug.DkTabScreen
import com.elyeproj.team_b.teamColor

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
            DkTextView("This is Team B Tab Screen 4 Calling List Screen")
            DkListScreen(
                listOf(
                    "TeamBListItem4" to "from Activity B",
                    "TeamBListItem4" to "By Activity B",
                    "TeamBListItem3" to "Info from Activity B",
                    "TeamAListItem4" to "data from Act B",
                    "TeamBListItem3" to "Activity B sent",
                    "TeamBListItem4" to "Activity B provided",
                )
            )
        }
    }
}
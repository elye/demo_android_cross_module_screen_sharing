package com.elyeproj.team_a.listitems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.DkThinkTextView
import com.elyeproj.designkit.socketplug.DkListItem
import com.elyeproj.team_a.teamColor

@Composable
fun ListItem1(data: String) {
    DkListItem {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(teamColor)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            DkThinkTextView("Team A List Item 1")
            DkThinkTextView(text = data)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
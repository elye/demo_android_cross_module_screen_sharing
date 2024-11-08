package com.elyeproj.team_b.listitems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.DkBorderTextView
import com.elyeproj.designkit.socketplug.DkListItem
import com.elyeproj.team_b.teamColor

@Composable
fun ListItem2(data: String) {
    DkListItem {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(teamColor)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            DkBorderTextView("Team B List Item 2", modifier = Modifier.fillMaxWidth())
            DkBorderTextView(data, modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
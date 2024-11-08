package com.elyeproj.team_a.listitems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.DkBorderTextView
import com.elyeproj.designkit.socketplug.DkListItem
import com.elyeproj.team_a.teamColor

@Composable
fun ListItem3(data: String) {
    DkListItem {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(teamColor)
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            DkBorderTextView("Team A List Item 3", modifier = Modifier.weight(1f))
            DkBorderTextView(data, modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}

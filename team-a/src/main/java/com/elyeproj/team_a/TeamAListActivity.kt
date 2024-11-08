package com.elyeproj.team_a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.DkTextView
import com.elyeproj.designkit.socketplug.DkListScreen
import com.elyeproj.designkit.socketplug.DkTabContainer
import com.elyeproj.designkit.ui.theme.DesignKitTheme

class TeamAListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DesignKitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(innerPadding).background(teamColor)
                    ) {
                        Spacer(modifier = Modifier.padding(8.dp))
                        DkTextView("This is Team A Calling List Screen")
                        Spacer(modifier = Modifier.padding(8.dp))
                        DkListScreen(
                            listOf(
                                "TeamAListItem4" to "Activity A gives",
                                "TeamAListItem4" to "send over from A",
                                "TeamBListItem3" to "A has provided",
                                "TeamAListItem4" to "data from Act A",
                                "TeamAListItem3" to "it is from A",
                                "TeamAListItem4" to "Here is from A",
                                "TeamAListItem2" to "Coming from A",
                                "TeamAListItem1" to "A has sent it",
                            )
                        )
                    }
                }
            }
        }
    }
}

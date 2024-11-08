package com.elyeproj.team_b

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

class TeamBListActivity : ComponentActivity() {
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
                        DkTextView("This is Team B Calling List Screen")
                        Spacer(modifier = Modifier.padding(8.dp))
                        DkListScreen(
                            listOf(
                                "TeamBListItem4" to "from Activity B",
                                "TeamBListItem4" to "By Activity B",
                                "TeamBListItem3" to "Info from Activity B",
                                "TeamAListItem4" to "data from Act B",
                                "TeamBListItem3" to "Activity B sent",
                                "TeamBListItem4" to "Activity B provided",
                                "TeamBListItem2" to "Coming from B",
                                "TeamBListItem1" to "B has sent it",
                            )
                        )
                    }
                }
            }
        }
    }
}

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
import com.elyeproj.designkit.socketplug.DkTabContainer
import com.elyeproj.designkit.ui.theme.DesignKitTheme

class TeamATabActivity : ComponentActivity() {
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
                        DkTextView("This is Team A Calling Tab Container")
                        Spacer(modifier = Modifier.padding(8.dp))
                        DkTabContainer(
                            listOf(
                                "TeamATabScreen1" to "Data from Activity A",
                                "TeamATabScreen2" to "Message from Activity A",
                                "TeamBTabScreen3" to "Injected by Activity A",
                            )
                        )
                    }
                }
            }
        }
    }
}

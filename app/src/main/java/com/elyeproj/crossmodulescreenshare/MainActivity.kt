package com.elyeproj.crossmodulescreenshare

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elyeproj.designkit.ui.theme.DesignKitTheme
import com.elyeproj.team_a.TeamAListActivity
import com.elyeproj.team_a.TeamATabActivity
import com.elyeproj.team_a.TeamATabListActivity
import com.elyeproj.team_b.TeamBListActivity
import com.elyeproj.team_b.TeamBTabActivity
import com.elyeproj.team_b.TeamBTabListActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            DesignKitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column {
                            ActivityButton("Team A Tab Activity", TeamATabActivity::class.java, context)
                            Spacer(Modifier.padding(16.dp))
                            ActivityButton("Team B Tab Activity", TeamBTabActivity::class.java, context)
                            Spacer(Modifier.padding(16.dp))
                            ActivityButton("Team A List Activity", TeamAListActivity::class.java, context)
                            Spacer(Modifier.padding(16.dp))
                            ActivityButton("Team B List Activity", TeamBListActivity::class.java, context)
                            Spacer(Modifier.padding(16.dp))
                            ActivityButton("Team A Tab List Activity", TeamATabListActivity::class.java, context)
                            Spacer(Modifier.padding(16.dp))
                            ActivityButton("Team B Tab List Activity", TeamBTabListActivity::class.java, context)
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun ActivityButton(text: String, activityClass: Class<*>, context: Context) {
        Button(onClick = {
            context.startActivity(Intent(context, activityClass))
        }) {
            Text(text = text)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesignKitTheme {
        Greeting("Android")
    }
}
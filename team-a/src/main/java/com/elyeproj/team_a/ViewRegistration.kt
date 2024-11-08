package com.elyeproj.team_a

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.elyeproj.designkit.teamViewRegistration
import com.elyeproj.team_a.listitems.ListItem1
import com.elyeproj.team_a.listitems.ListItem2
import com.elyeproj.team_a.listitems.ListItem3
import com.elyeproj.team_a.listitems.ListItem4
import com.elyeproj.team_a.tabscreens.TabScreen1
import com.elyeproj.team_a.tabscreens.TabScreen2
import com.elyeproj.team_a.tabscreens.TabScreen3
import com.elyeproj.team_a.tabscreens.TabScreen4

val teamColor = Color.Green
const val teamName = "Team A"

fun registerTeamA() {
    val tabScreen1 = @Composable { data: String -> TabScreen1(data = data) }
    val tabScreen2 = @Composable { data: String -> TabScreen2(data = data) }
    val tabScreen3 = @Composable { data: String -> TabScreen3(data = data) }
    val tabScreen4 = @Composable { data: String -> TabScreen4(data = data) }

    val listItem1 = @Composable { data: String -> ListItem1(data = data) }
    val listItem2 = @Composable { data: String -> ListItem2(data = data) }
    val listItem3 = @Composable { data: String -> ListItem3(data = data) }
    val listItem4 = @Composable { data: String -> ListItem4(data = data) }

    teamViewRegistration.registerTabScreenViews(
        "TeamATabScreen1",
        Pair("Team A Tab1", tabScreen1)
    )
    teamViewRegistration.registerTabScreenViews(
        "TeamATabScreen2",
        Pair("Team A Tab2", tabScreen2)
    )
    teamViewRegistration.registerTabScreenViews(
        "TeamATabScreen3",
        Pair("Team A Tab3", tabScreen3)
    )
    teamViewRegistration.registerTabScreenViews(
        "TeamATabScreen4",
        Pair("Team A Tab4", tabScreen4)
    )

    teamViewRegistration.registerListItemViews(
        "TeamAListItem1", listItem1
    )

    teamViewRegistration.registerListItemViews(
        "TeamAListItem2", listItem2
    )

    teamViewRegistration.registerListItemViews(
        "TeamAListItem3", listItem3
    )

    teamViewRegistration.registerListItemViews(
        "TeamAListItem4", listItem4
    )
}
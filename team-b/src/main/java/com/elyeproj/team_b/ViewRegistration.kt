package com.elyeproj.team_b

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.elyeproj.designkit.teamViewRegistration
import com.elyeproj.team_b.listitems.ListItem1
import com.elyeproj.team_b.listitems.ListItem2
import com.elyeproj.team_b.listitems.ListItem3
import com.elyeproj.team_b.listitems.ListItem4
import com.elyeproj.team_b.tabscreens.TabScreen1
import com.elyeproj.team_b.tabscreens.TabScreen2
import com.elyeproj.team_b.tabscreens.TabScreen3
import com.elyeproj.team_b.tabscreens.TabScreen4

val teamColor = Color.Yellow
const val teamName = "Team B"

fun registerTeamB() {
    val tabScreen1 = @Composable { data: String -> TabScreen1(data = data) }
    val tabScreen2 = @Composable { data: String -> TabScreen2(data = data) }
    val tabScreen3 = @Composable { data: String -> TabScreen3(data = data) }
    val tabScreen4 = @Composable { data: String -> TabScreen4(data = data) }

    val listItem1 = @Composable { data: String -> ListItem1(data = data) }
    val listItem2 = @Composable { data: String -> ListItem2(data = data) }
    val listItem3 = @Composable { data: String -> ListItem3(data = data) }
    val listItem4 = @Composable { data: String -> ListItem4(data = data) }

    teamViewRegistration.registerTabScreenViews(
        "TeamBTabScreen1",
        Pair("Team B Tab1", tabScreen1)
    )
    teamViewRegistration.registerTabScreenViews(
        "TeamBTabScreen2",
        Pair("Team B Tab2", tabScreen2)
    )
    teamViewRegistration.registerTabScreenViews(
        "TeamBTabScreen3",
        Pair("Team B Tab3", tabScreen3)
    )
    teamViewRegistration.registerTabScreenViews(
        "TeamBTabScreen4",
        Pair("Team B Tab4", tabScreen4)
    )
    teamViewRegistration.registerListItemViews(
        "TeamBListItem1", listItem1
    )

    teamViewRegistration.registerListItemViews(
        "TeamBListItem2", listItem2
    )

    teamViewRegistration.registerListItemViews(
        "TeamBListItem3", listItem3
    )

    teamViewRegistration.registerListItemViews(
        "TeamBListItem4", listItem4
    )
}
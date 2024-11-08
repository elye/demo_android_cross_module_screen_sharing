package com.elyeproj.designkit

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.elyeproj.designkit.socketplug.DefaultErrorDkListItem
import com.elyeproj.designkit.socketplug.DefaultErrorDkTabScreen

val teamViewRegistration = TeamViewRegistration()
val defaultBorderColor = Color.Black
val defaultBackgroundColor = Color.Gray
val errorColor = Color.Red

class TeamViewRegistration {
    private val listOfListItemViews = mutableMapOf<String, @Composable (String) -> Unit>()

    private val listOfTabScreenViews = mutableMapOf<String, Pair<String, @Composable (String) -> Unit>>()

    fun getListItemView(key: String, data: String): @Composable LazyItemScope.() -> Unit = {
        listOfListItemViews[key]?.invoke(data) ?: DefaultErrorDkListItem()
    }

    fun registerListItemViews(key: String, function: @Composable (String) -> Unit) {
        listOfListItemViews[key] = function
    }

    fun getTabScreenView(key: String, data: String): @Composable () -> Unit = {
        listOfTabScreenViews[key]?.second?.invoke(data) ?: DefaultErrorDkTabScreen()
    }

    fun getTabScreenTitle(key: String): String {
        return listOfTabScreenViews[key]?.first ?: "MISSING TITLE"
    }

    fun registerTabScreenViews(key: String, pairNameFunction: Pair<String, @Composable (String) -> Unit>) {
        listOfTabScreenViews[key] = pairNameFunction
    }

}
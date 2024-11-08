package com.elyeproj.crossmodulescreenshare

import android.app.Application
import com.elyeproj.team_a.registerTeamA
import com.elyeproj.team_b.registerTeamB

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        registerScreen()
    }

    private fun registerScreen() {
        registerTeamA()
        registerTeamB()
    }
}
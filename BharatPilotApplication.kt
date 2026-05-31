package com.bharatpilot

import android.app.Application
import com.bharatpilot.config.AppConfig

class BharatPilotApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppConfig.init(this)
    }
}

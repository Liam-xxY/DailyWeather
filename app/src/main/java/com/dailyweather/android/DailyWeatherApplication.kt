package com.dailyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class DailyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "3c1LDgZmmmwWkef5"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
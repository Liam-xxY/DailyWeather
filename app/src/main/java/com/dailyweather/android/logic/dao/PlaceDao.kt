package com.dailyweather.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.dailyweather.android.DailyWeatherApplication
import com.dailyweather.android.logic.model.Place
import com.google.gson.Gson

object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = DailyWeatherApplication.context.
        getSharedPreferences("daily_weather", Context.MODE_PRIVATE)
}
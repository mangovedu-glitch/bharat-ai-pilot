package com.bharatpilot.config

import android.content.Context
import android.content.SharedPreferences

/**
 * Central configuration for API keys, wake-word assets, and supported languages.
 */
object AppConfig {

    const val WAKE_PHRASE = "Hello Bharat Pilot"
    const val WAKE_WORD_ASSET = "hello_bharat_pilot_android.ppn"
    const val NOTIFICATION_CHANNEL_WAKE = "wake_word_channel"
    const val NOTIFICATION_CHANNEL_CAPTURE = "screen_capture_channel"

    val SUPPORTED_LANGUAGES = listOf(
        "en", "hi", "or", "ta", "te", "bn", "mr", "gu", "pa", "ur"
    )

    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences("bharat_pilot_prefs", Context.MODE_PRIVATE)
    }

    var preferredLanguage: String
        get() = prefs.getString("preferred_language", "en") ?: "en"
        set(value) = prefs.edit().putString("preferred_language", value).apply()

    var wakeWordEnabled: Boolean
        get() = prefs.getBoolean("wake_word_enabled", true)
        set(value) = prefs.edit().putBoolean("wake_word_enabled", value).apply()
}

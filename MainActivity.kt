package com.bharatpilot.app

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(50, 50, 50, 50)
            gravity = android.view.Gravity.CENTER
        }

        val title = TextView(this).apply {
            text = "🇮🇳 BHARAT PILOT OS"
            textSize = 28f
            fontWeight = android.graphics.Typeface.BOLD
        }

        val privacyDisclaimer = TextView(this).apply {
            text = "Privacy Shield: Active\nAll regional voice conversions and actions occur fully inside device runtime."
            textSize = 14f
            setPadding(0, 20, 0, 40)
            gravity = android.view.Gravity.CENTER
        }

        val actionButton = Button(this).apply {
            text = "Activate Automation Core"
            setOnClickListener {
                startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
            }
        }

        layout.addView(title)
        layout.addView(privacyDisclaimer)
        layout.addView(actionButton)
        setContentView(layout)
    }
}

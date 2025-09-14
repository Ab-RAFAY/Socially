package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Load splash screen layout
        setContentView(R.layout.activity_splash)

        // Optional: Hide the action bar so splash looks clean
        supportActionBar?.hide()

        // Delay 2 seconds, then go to MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
            finish() // so splash is removed from back stack
        }, 2000) // 2000 ms = 2 seconds
    }
}
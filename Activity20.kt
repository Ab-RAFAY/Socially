package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Activity20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity20)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity21::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Initialize views
//        val closeButton = findViewById<ImageView>(R.id.closeButton)
//        val heartIcon = findViewById<ImageView>(R.id.heartIcon)
//
//        // Set click listener for close button
//        closeButton.setOnClickListener {
//            finish() // Close the activity
//        }
//
//        // Apply simple scale animation to heart icon
//        val scaleAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
//        heartIcon?.startAnimation(scaleAnimation)
    }
}
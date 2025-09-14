package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)

        // Initialize UI components
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        val viewProfileButton = findViewById<Button>(R.id.viewProfileButton)
        val logOutButton = findViewById<Button>(R.id.logOutButton)

        // Get data from Intent (username from Activity2)
        val username = intent.getStringExtra("username") ?: "Abdul Rafay"

        // Set welcome message
        welcomeMessage.text = username

        // Handle Log In button click to navigate to Activity4
        viewProfileButton.setOnClickListener {
            val intent = Intent(this, Activity4::class.java)
            startActivity(intent)
        }

        // Handle Switch Account button click
        logOutButton.setOnClickListener {
            finishAffinity()
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }
    }
}
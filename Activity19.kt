package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity19)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity20::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Initialize views
//        val btnClose = findViewById<ImageView>(R.id.btnClose)
//        val btnPost = findViewById<ImageView>(R.id.btnPost)
//
//        // Set click listener for close button
//        btnClose.setOnClickListener {
//            finish() // Close the activity
//        }
//
//        // Set click listener for post button
//        btnPost.setOnClickListener {
//            Toast.makeText(this, "Post clicked", Toast.LENGTH_SHORT).show()
//            // Add your post action here (e.g., start another activity or show a dialog)
//        }
    }
}
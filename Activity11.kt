package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity11)

        // Hide the action bar to match Instagram's design
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity12::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // You can add click listeners here if needed
        //setupClickListeners()
    }

    //private fun setupClickListeners() {
        // Example: Add click listeners to profile images or buttons
        // You can uncomment and modify these as needed

        /*
        findViewById<Button>(R.id.followButton)?.setOnClickListener {
            Toast.makeText(this, "Follow button clicked!", Toast.LENGTH_SHORT).show()
        }
        */

        // Add more click listeners for interactive elements
        // For example, clicking on profile images, post images, etc.
    }

    // Optional: Method to simulate liking a post
//    private fun likePost(postId: String) {
//        Toast.makeText(this, "Liked post: $postId", Toast.LENGTH_SHORT).show()
//    }
//
//    // Optional: Method to simulate following a user
//    private fun followUser(username: String) {
//        Toast.makeText(this, "Started following: $username", Toast.LENGTH_SHORT).show()
//    }


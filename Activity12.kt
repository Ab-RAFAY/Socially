package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity12)

        // Hide the action bar to match Instagram's design
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity13::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Setup click listeners for interactive elements
        //setupClickListeners()
    }

//    private fun setupClickListeners() {
//        // Follow button click listener
////        findViewById<Button>(R.id.followButton)?.setOnClickListener {
////            followUser("mjs_potter")
////        }
//
//        // Message button 1 click listener (martini_rond)
//        findViewById<Button>(R.id.messageButton1)?.setOnClickListener {
//            sendMessage("martini_rond")
//        }
//
//        // Message button 2 click listener (maxjacobson)
//        findViewById<Button>(R.id.messageButton2)?.setOnClickListener {
//            sendMessage("maxjacobson")
//        }
//
//        // Message button 3 click listener (example_user)
//        findViewById<Button>(R.id.messageButton3)?.setOnClickListener {
//            sendMessage("example_user")
//        }
//
//        // You can add more click listeners for other interactive elements
//        // For example, clicking on profile images to view profiles
//    }
//
//    // Method to handle following a user
////    private fun followUser(username: String) {
////        // Change button text and style after clicking
////        val followButton = findViewById<Button>(R.id.followButton)
////        followButton?.apply {
////            text = "Following"
////            setBackgroundResource(R.drawable.message_button_background)
////            setTextColor(resources.getColor(android.R.color.black))
////        }
////
////        Toast.makeText(this, "Now following $username", Toast.LENGTH_SHORT).show()
////    }
//
//    // Method to handle sending a message
//    private fun sendMessage(username: String) {
//        Toast.makeText(this, "Opening chat with $username", Toast.LENGTH_SHORT).show()
//        // Here you would typically open a messaging activity
//        // Intent to messaging activity would go here
//    }
//
//    // Method to handle liking a photo
//    private fun likePhoto(username: String) {
//        Toast.makeText(this, "Liked $username's photo", Toast.LENGTH_SHORT).show()
//    }
//
//    // Method to handle viewing a photo
//    private fun viewPhoto(username: String) {
//        Toast.makeText(this, "Viewing $username's photo", Toast.LENGTH_SHORT).show()
//        // Here you would typically open the photo in full screen
//    }
//
//    // Method to handle replying to a comment
//    private fun replyToComment(username: String) {
//        Toast.makeText(this, "Replying to $username's comment", Toast.LENGTH_SHORT).show()
//        // Here you would typically open a comment/reply dialog
//    }
//
//    // Method to handle viewing follow requests
//    private fun viewFollowRequests() {
//        Toast.makeText(this, "Opening follow requests", Toast.LENGTH_SHORT).show()
//        // Here you would typically navigate to follow requests activity
//    }
}
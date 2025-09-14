package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity13 : AppCompatActivity() {

    //private var isGridView = true // Track current view mode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity13)

        // Hide the action bar to match Instagram's design
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity14::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Setup click listeners for interactive elements
        //setupClickListeners()
    }

//    private fun setupClickListeners() {
//        // Edit Profile button click listener
//        findViewById<Button>(R.id.editProfileButton)?.setOnClickListener {
//            editProfile()
//        }
//
//        // Grid view toggle click listener
//        findViewById<ImageView>(R.id.gridViewIcon)?.setOnClickListener {
//            switchToGridView()
//        }
//
//        // Tagged view toggle click listener
//        findViewById<ImageView>(R.id.taggedViewIcon)?.setOnClickListener {
//            switchToTaggedView()
//        }
//
//        // Add click listeners for story highlights
//        setupStoryHighlights()
//
//        // Add click listeners for post images
//        setupPostClickListeners()
//    }
//
//    private fun editProfile() {
//        Toast.makeText(this, "Opening Edit Profile", Toast.LENGTH_SHORT).show()
//        // Here you would typically open the edit profile activity
//    }
//
//    private fun switchToGridView() {
//        if (!isGridView) {
//            isGridView = true
//            Toast.makeText(this, "Switched to Grid View", Toast.LENGTH_SHORT).show()
//            // Update UI to show grid view is selected
//            findViewById<ImageView>(R.id.gridViewIcon)?.alpha = 1.0f
//            findViewById<ImageView>(R.id.taggedViewIcon)?.alpha = 0.5f
//        }
//    }
//
//    private fun switchToTaggedView() {
//        if (isGridView) {
//            isGridView = false
//            Toast.makeText(this, "Switched to Tagged Posts View", Toast.LENGTH_SHORT).show()
//            // Update UI to show tagged view is selected
//            findViewById<ImageView>(R.id.gridViewIcon)?.alpha = 0.5f
//            findViewById<ImageView>(R.id.taggedViewIcon)?.alpha = 1.0f
//        }
//    }
//
//    private fun setupStoryHighlights() {
//        // You can add click listeners for story highlights here
//        // For now, we'll show a toast when clicked
//
//        // Note: You would need to add IDs to the story highlight ImageViews
//        // to make them clickable. For example:
//        /*
//        findViewById<ImageView>(R.id.newStoryHighlight)?.setOnClickListener {
//            viewStoryHighlight("New")
//        }
//        */
//    }
//
//    private fun setupPostClickListeners() {
//        // Add click listeners for each post image
//        // You would need to add IDs to each post ImageView in the XML
//        // For example:
//        /*
//        findViewById<ImageView>(R.id.post1)?.setOnClickListener {
//            viewPost(1)
//        }
//        findViewById<ImageView>(R.id.post2)?.setOnClickListener {
//            viewPost(2)
//        }
//        // ... and so on for each post
//        */
//    }
//
//    private fun viewPost(postNumber: Int) {
//        Toast.makeText(this, "Opening Post $postNumber", Toast.LENGTH_SHORT).show()
//        // Here you would typically open the post in full view
//    }
//
//    private fun viewStoryHighlight(highlightName: String) {
//        Toast.makeText(this, "Viewing $highlightName Story Highlight", Toast.LENGTH_SHORT).show()
//        // Here you would typically open the story highlight viewer
//    }
//
//    // Method to handle followers count click
//    private fun viewFollowers() {
//        Toast.makeText(this, "Viewing Followers (834)", Toast.LENGTH_SHORT).show()
//        // Here you would typically open the followers list
//    }
//
//    // Method to handle following count click
//    private fun viewFollowing() {
//        Toast.makeText(this, "Viewing Following (162)", Toast.LENGTH_SHORT).show()
//        // Here you would typically open the following list
//    }
//
//    // Method to handle posts count click
//    private fun viewAllPosts() {
//        Toast.makeText(this, "Viewing All Posts (54)", Toast.LENGTH_SHORT).show()
//        // Here you would typically scroll to posts or show posts view
//    }
//
//    // Method to handle profile picture click
//    private fun viewProfilePicture() {
//        Toast.makeText(this, "Viewing Profile Picture", Toast.LENGTH_SHORT).show()
//        // Here you would typically show profile picture in full screen
//    }

}
package com.example.smdassignment1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity22 : AppCompatActivity() {

    private var isGridView = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity22)

        // Initialize views
//        val btnBack = findViewById<ImageButton>(R.id.btnBack)
//        val btnMore = findViewById<ImageButton>(R.id.btnMore)
//        val gridViewIcon = findViewById<ImageView>(R.id.gridViewIcon)
////        val taggedViewIcon = findViewById<ImageView>(R.id.taggedViewIcon)
//
//        // Set click listener for back button
//        btnBack.setOnClickListener {
//            finish() // Close the activity
//        }
//
//        // Set click listener for more button
//        btnMore.setOnClickListener {
//            Toast.makeText(this, "More options clicked", Toast.LENGTH_SHORT).show()
//            // Add your more options action here (e.g., show a menu or dialog)
//        }
//
//        // Set click listeners for view toggle icons
//        gridViewIcon.setOnClickListener {
//            if (!isGridView) {
//                isGridView = true
//                gridViewIcon.setBackgroundResource(android.R.color.darker_gray) // Indicate selection
//                taggedViewIcon.setBackgroundResource(0) // Clear tagged selection
//                Toast.makeText(this, "Grid View Selected", Toast.LENGTH_SHORT).show()
//                // Add logic to switch to grid view
//            }
//        }
//
//        taggedViewIcon.setOnClickListener {
//            if (isGridView) {
//                isGridView = false
//                taggedViewIcon.setBackgroundResource(android.R.color.darker_gray) // Indicate selection
//                gridViewIcon.setBackgroundResource(0) // Clear grid selection
//                Toast.makeText(this, "Tagged View Selected", Toast.LENGTH_SHORT).show()
//                // Add logic to switch to tagged view
//            }
//        }
    }
}
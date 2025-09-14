package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity6)

        // Initialize image views and set click listeners
        //setupImageClickListeners()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity7::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds
    }

//    private fun setupImageClickListeners() {
//        // Get references to all image views
//        val image1 = findViewById<ImageView>(R.id.image1)
//        val image2 = findViewById<ImageView>(R.id.image2)
//        val image3 = findViewById<ImageView>(R.id.image3)
//        val image4 = findViewById<ImageView>(R.id.image4)
//        val image5 = findViewById<ImageView>(R.id.image5)
//        val image6 = findViewById<ImageView>(R.id.image6)
//        val image7 = findViewById<ImageView>(R.id.image7)
//        val image8 = findViewById<ImageView>(R.id.image8)
//        val image9 = findViewById<ImageView>(R.id.image9)
//        val image10 = findViewById<ImageView>(R.id.image10)
//
//        val bottomNavigation = findViewById<ImageView>(R.id.bottom_navigation)
//
//        // Set click listeners for each image
//        image1.setOnClickListener {
//            showToast("Eggs Recipe clicked!")
//        }
//
//        image2.setOnClickListener {
//            showToast("Party Lights clicked!")
//        }
//
//        image3.setOnClickListener {
//            showToast("Fashion Style clicked!")
//        }
//
//        image4.setOnClickListener {
//            showToast("Road Trip clicked!")
//        }
//
//        image5.setOnClickListener {
//            showToast("Camping clicked!")
//        }
//
//        image6.setOnClickListener {
//            showToast("Wheat Field clicked!")
//        }
//
//        image7.setOnClickListener {
//            showToast("Book Collection clicked!")
//        }
//
//        image8.setOnClickListener {
//            showToast("Couple Photo clicked!")
//        }
//
//        image9.setOnClickListener {
//            showToast("Pink Background clicked!")
//        }
//
//        image10.setOnClickListener {
//            showToast("Woman Portrait clicked!")
//        }
//
//
//        bottomNavigation.setOnClickListener {
//            showToast("Navigation clicked!")
//        }
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
}
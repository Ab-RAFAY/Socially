package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity8)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity9::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Set up click listeners
        //setupClickListeners()
    }

//    private fun setupClickListeners() {
//        // Header buttons
//        val btnBack = findViewById<ImageView>(R.id.btn_back)
//        val btnNewMessage = findViewById<ImageView>(R.id.btn_new_message)
//
//        btnBack.setOnClickListener {
//            showToast("Back button clicked")
//            // In a real app, you would call finish() or navigate back
//        }
//
//        btnNewMessage.setOnClickListener {
//            showToast("New message clicked")
//        }
//
//        // Message item click listeners
//        setupMessageClickListeners()
//
//        // Camera button
//        val cameraButton = findViewById<LinearLayout>(R.id.camera_button)
//        cameraButton.setOnClickListener {
//            showToast("Camera clicked")
//        }
//
//        // Bottom navigation
//        val bottomNavigation = findViewById<ImageView>(R.id.bottom_navigation)
//        bottomNavigation.setOnClickListener {
//            showToast("Navigation clicked")
//        }
//    }
//
//    private fun setupMessageClickListeners() {
//        val messageItem1 = findViewById<LinearLayout>(R.id.message_item_1)
//        val messageItem2 = findViewById<LinearLayout>(R.id.message_item_2)
//        val messageItem3 = findViewById<LinearLayout>(R.id.message_item_3)
//        val messageItem4 = findViewById<LinearLayout>(R.id.message_item_4)
//        val messageItem5 = findViewById<LinearLayout>(R.id.message_item_5)
//        val messageItem6 = findViewById<LinearLayout>(R.id.message_item_6)
//
//        messageItem1.setOnClickListener {
//            showToast("joshua_l conversation clicked")
//        }
//
//        messageItem2.setOnClickListener {
//            showToast("karennne conversation clicked")
//        }
//
//        messageItem3.setOnClickListener {
//            showToast("martin1_rond conversation clicked")
//        }
//
//        messageItem4.setOnClickListener {
//            showToast("andrewwww conversation clicked")
//        }
//
//        messageItem5.setOnClickListener {
//            showToast("kiero_d conversation clicked")
//        }
//
//        messageItem6.setOnClickListener {
//            showToast("maxjacobson conversation clicked")
//        }
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
}
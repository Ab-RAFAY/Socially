package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity9)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity10::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Set up click listeners
        //setupClickListeners()
    }

//    private fun setupClickListeners() {
//        // Header buttons
//        val btnBack = findViewById<ImageView>(R.id.btn_back)
//        val btnVideoCall = findViewById<ImageView>(R.id.btn_video_call)
//        val btnInfo = findViewById<ImageView>(R.id.btn_info)
//
//        btnBack.setOnClickListener {
//            showToast("Back to messages")
//            // In a real app, you would call finish() or navigate back
//            finish()
//        }
//
//        btnVideoCall.setOnClickListener {
//            showToast("Starting video call with internshala")
//        }
//
//        btnInfo.setOnClickListener {
//            showToast("Chat info clicked")
//        }
//
//        // Message input area buttons
//        setupMessageInputButtons()
//
//        // Message bubble click
//        val messageBubble = findViewById<LinearLayout>(R.id.message_bubble)
//        messageBubble.setOnClickListener {
//            showToast("Message clicked")
//        }
//
//        // Bottom navigation
//        val bottomNavigation = findViewById<ImageView>(R.id.bottom_navigation)
//        bottomNavigation.setOnClickListener {
//            showToast("Navigation clicked")
//        }
//    }
//
//    private fun setupMessageInputButtons() {
//        val btnMicrophone = findViewById<ImageView>(R.id.btn_microphone)
//        val btnGallery = findViewById<ImageView>(R.id.btn_gallery)
//        val btnSticker = findViewById<ImageView>(R.id.btn_sticker)
//
//        btnMicrophone.setOnClickListener {
//            showToast("Voice message clicked")
//        }
//
//        btnGallery.setOnClickListener {
//            showToast("Gallery clicked")
//        }
//
//        btnSticker.setOnClickListener {
//            showToast("Sticker clicked")
//        }
//
//        // Camera button in input area
//        val cameraButton = findViewById<LinearLayout>(R.id.message_input_container)
//            .getChildAt(0) as LinearLayout
//        cameraButton.setOnClickListener {
//            showToast("Camera clicked")
//        }
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
}
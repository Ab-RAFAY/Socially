package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity10 : AppCompatActivity() {

//    private lateinit var callDurationText: TextView
//    private val handler = Handler(Looper.getMainLooper())
//    private var callStartTime = System.currentTimeMillis()
//    private var isCallActive = true
//
//    private val updateCallDuration = object : Runnable {
//        override fun run() {
//            if (isCallActive) {
//                val currentTime = System.currentTimeMillis()
//                val duration = (currentTime - callStartTime) / 1000
//                val minutes = duration / 60
//                val seconds = duration % 60
//
//                callDurationText.text = String.format("%02d:%02d", minutes, seconds)
//
//                handler.postDelayed(this, 1000) // Update every second
//            }
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity10)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity11::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Initialize views
        //initializeViews()

        // Set up click listeners
        //setupClickListeners()

        // Start call duration timer
        //startCallTimer()
    }

//    private fun initializeViews() {
//        callDurationText = findViewById(R.id.call_duration)
//    }
//
//    private fun setupClickListeners() {
//        val btnMessage = findViewById<LinearLayout>(R.id.btn_message)
//        val btnEndCall = findViewById<LinearLayout>(R.id.btn_end_call)
//        val btnSpeaker = findViewById<LinearLayout>(R.id.btn_speaker)
//
//        btnMessage.setOnClickListener {
//            showToast("Message clicked")
//            // In a real app, you might open a chat overlay or minimize the call
//        }
//
//        btnEndCall.setOnClickListener {
//            showToast("Call ended")
//            endCall()
//        }
//
//        btnSpeaker.setOnClickListener {
//            showToast("Speaker toggled")
//            // In a real app, you would toggle speaker phone
//            toggleSpeaker()
//        }
//    }
//
//    private fun startCallTimer() {
//        // Set initial time (03:12 as shown in the image)
//        callStartTime = System.currentTimeMillis() - (3 * 60 + 12) * 1000
//        handler.post(updateCallDuration)
//    }
//
//    private fun endCall() {
//        isCallActive = false
//        handler.removeCallbacks(updateCallDuration)
//
//        // In a real app, you would end the actual call and navigate back
//        showToast("Call ended - Duration: ${callDurationText.text}")
//        finish()
//    }
//
//    private fun toggleSpeaker() {
//        // In a real app, you would toggle the speaker state
//        // For demonstration, we'll just show a toast
//        showToast("Speaker mode toggled")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        isCallActive = false
//        handler.removeCallbacks(updateCallDuration)
//    }
//
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
}
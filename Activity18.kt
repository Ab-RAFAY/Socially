package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Activity18 : AppCompatActivity() {

//    private lateinit var closeButton: ImageView
//    private lateinit var storyProgressContainer: LinearLayout
//    private lateinit var highlightText: TextView
//    private val handler = Handler(Looper.getMainLooper())
//    private var currentProgressIndex = 0
//    private val progressBars = mutableListOf<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity18)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity19::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Initialize views
        //closeButton = findViewById(R.id.closeButton)
        //storyProgressContainer = findViewById(R.id.storyProgressContainer)
        //highlightText = findViewById(R.id.highlight)

        // Initialize progress bars
//        progressBars.addAll(listOf(
//            findViewById(R.id.storyProgressBar),
//            findViewById(R.id.storyProgressBar1),
//            findViewById(R.id.storyProgressBar2),
//            findViewById(R.id.storyProgressBar3),
//            findViewById(R.id.storyProgressBar4)
//        ))
//
//        // Set click listener for close button
//        closeButton.setOnClickListener {
//            finish() // Close the activity
//        }
//
//        // Start progress simulation
//        startProgressAnimation()
    }

//    private fun startProgressAnimation() {
//        handler.postDelayed({
//            if (currentProgressIndex < progressBars.size) {
//                // Reset previous progress bar
//                if (currentProgressIndex > 0) {
//                    progressBars[currentProgressIndex - 1].setBackgroundResource(R.drawable.story_progress_background)
//                }
//                // Update current progress bar
//                progressBars[currentProgressIndex].setBackgroundResource(R.drawable.story_progress_background) // Replace with your filled drawable
//                currentProgressIndex++
//
//                // Restart if reached the end
//                if (currentProgressIndex == progressBars.size) {
//                    currentProgressIndex = 0
//                }
//                startProgressAnimation() // Recursive call for continuous animation
//            }
//        }, 1000) // 1-second delay between progress updates
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        handler.removeCallbacksAndMessages(null) // Clean up handler
//    }

}
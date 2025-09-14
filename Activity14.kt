package com.example.smdassignment1

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity14 : AppCompatActivity() {

//    private var storyProgressHandler: Handler? = null
//    private var progressRunnable: Runnable? = null
//    private var currentProgress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity14)

        // Hide the action bar and make full screen
        supportActionBar?.hide()

//        // Make the activity full screen
//        window.decorView.systemUiVisibility = (
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
//                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
//                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
//                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
//                        View.SYSTEM_UI_FLAG_FULLSCREEN or
//                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//                )


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity15::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        // Setup click listeners for interactive elements
        //setupClickListeners()

        // Start story progress animation
        //startStoryProgress()

    }

//    private fun setupClickListeners() {
//        // Close button
//        findViewById<ImageView>(R.id.closeButton)?.setOnClickListener {
//            closeStory()
//        }
//
////        // Left touch area - previous story
////        findViewById<View>(R.id.leftTouchArea)?.setOnClickListener {
////            previousStory()
////        }
////
////        // Right touch area - next story
////        findViewById<View>(R.id.rightTouchArea)?.setOnClickListener {
////            nextStory()
////        }
////
////        // Bottom action bar buttons
////        findViewById<LinearLayout>(R.id.activityButton)?.setOnClickListener {
////            openActivity()
////        }
////
////        findViewById<LinearLayout>(R.id.createButton)?.setOnClickListener {
////            openCreate()
////        }
////
////        findViewById<LinearLayout>(R.id.createPostButton)?.setOnClickListener {
////            createPost()
////        }
////
////        findViewById<LinearLayout>(R.id.browseButton)?.setOnClickListener {
////            openBrowse()
////        }
////
////        findViewById<LinearLayout>(R.id.sendButton)?.setOnClickListener {
////            sendStory()
////        }
////
////        findViewById<LinearLayout>(R.id.moreButton)?.setOnClickListener {
////            showMoreOptions()
////        }
////
////        // Story image double tap for like
////        findViewById<ImageView>(R.id.storyImage)?.setOnClickListener {
////            // Single tap - pause/resume story
////            pauseResumeStory()
////        }
//    }
//
//    private fun startStoryProgress() {
//        storyProgressHandler = Handler(Looper.getMainLooper())
//
//        progressRunnable = object : Runnable {
//            override fun run() {
//                currentProgress += 1
//
//                // Update progress bar (you would implement this with a custom drawable)
//                val progressBar = findViewById<View>(R.id.storyProgressBar)
//                progressBar?.scaleX = currentProgress / 100f
//
//                if (currentProgress < 100) {
//                    storyProgressHandler?.postDelayed(this, 50) // Update every 50ms for smooth animation
//                } else {
//                    // Story finished, go to next story or close
//                    nextStory()
//                }
//            }
//        }
//
//        storyProgressHandler?.post(progressRunnable!!)
//    }
//
//    private fun pauseResumeStory() {
//        storyProgressHandler?.let { handler ->
//            progressRunnable?.let { runnable ->
//                handler.removeCallbacks(runnable)
//                Toast.makeText(this, "Story Paused", Toast.LENGTH_SHORT).show()
//
//                // Resume after a short delay (you could make this based on user interaction)
//                handler.postDelayed(runnable, 1000)
//            }
//        }
//    }
//
//
//
//
//    private fun closeStory() {
//        Toast.makeText(this, "Closing Story", Toast.LENGTH_SHORT).show()
//        finish() // Close the activity
//    }
//
//    private fun previousStory() {
//        Toast.makeText(this, "Previous Story", Toast.LENGTH_SHORT).show()
//        // Reset progress and load previous story
//        currentProgress = 0
//        // Here you would load the previous story image and data
//    }
//
//    private fun nextStory() {
//        Toast.makeText(this, "Next Story", Toast.LENGTH_SHORT).show()
//        // Reset progress and load next story
//        currentProgress = 0
//        // Here you would load the next story image and data
//        // If no more stories, close the story viewer
//    }
//
//    private fun openActivity() {
//        Toast.makeText(this, "Opening Activity", Toast.LENGTH_SHORT).show()
//        // Navigate to activity feed
//    }
//
//    private fun openCreate() {
//        Toast.makeText(this, "Opening Create", Toast.LENGTH_SHORT).show()
//        // Navigate to create content
//    }
//
//    private fun createPost() {
//        Toast.makeText(this, "Creating Post", Toast.LENGTH_SHORT).show()
//        // Navigate to create post
//    }
//
//    private fun openBrowse() {
//        Toast.makeText(this, "Opening Browse", Toast.LENGTH_SHORT).show()
//        // Navigate to browse/explore
//    }
//
//    private fun sendStory() {
//        Toast.makeText(this, "Sending Story", Toast.LENGTH_SHORT).show()
//        // Open send story dialog
//    }
//
//    private fun showMoreOptions() {
//        Toast.makeText(this, "More Options", Toast.LENGTH_SHORT).show()
//        // Show more options menu
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        // Clean up handlers
//        storyProgressHandler?.removeCallbacks(progressRunnable!!)
//    }
//
//    override fun onPause() {
//        super.onPause()
//        // Pause story progress when app goes to background
//        storyProgressHandler?.removeCallbacks(progressRunnable!!)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        // Resume story progress when app comes back to foreground
//        progressRunnable?.let { storyProgressHandler?.post(it) }
//    }


}
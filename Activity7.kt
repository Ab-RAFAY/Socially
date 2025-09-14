package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class Activity7 : AppCompatActivity() {

//    private lateinit var tabTop: TextView
//    private lateinit var tabAccounts: TextView
//    private lateinit var tabTags: TextView
//    private lateinit var tabPlaces: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity7)

        // Initialize views
        //initializeViews()

        // Set up click listeners
        //setupClickListeners()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity8::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds
    }

//    private fun initializeViews() {
//        tabTop = findViewById(R.id.tab_top)
//        tabAccounts = findViewById(R.id.tab_accounts)
//        tabTags = findViewById(R.id.tab_tags)
//        tabPlaces = findViewById(R.id.tab_places)
//    }
//
//    private fun setupClickListeners() {
//        // Clear button functionality
//        val btnClear = findViewById<TextView>(R.id.btn_clear)
//        val btnClearSearch = findViewById<ImageView>(R.id.btn_clear_search)
//
//        btnClear.setOnClickListener {
//            showToast("Clear all search")
//            // Here you would typically clear the search and go back
//        }
//
//        btnClearSearch.setOnClickListener {
//            showToast("Clear search text")
//            // Here you would typically clear just the search text
//        }
//
//        // Tab click listeners
//        tabTop.setOnClickListener {
//            selectTab(tabTop)
//            showToast("Top results selected")
//        }
//
//        tabAccounts.setOnClickListener {
//            selectTab(tabAccounts)
//            showToast("Accounts tab selected")
//        }
//
//        tabTags.setOnClickListener {
//            selectTab(tabTags)
//            showToast("Tags tab selected")
//        }
//
//        tabPlaces.setOnClickListener {
//            selectTab(tabPlaces)
//            showToast("Places tab selected")
//        }
//
//        // Search result click listeners
//        setupSearchResultClickListeners()
//
//        // Bottom navigation
//        val bottomNavigation = findViewById<ImageView>(R.id.bottom_navigation)
//        bottomNavigation.setOnClickListener {
//            showToast("Navigation clicked")
//        }
//    }
//
//    private fun setupSearchResultClickListeners() {
//        val profileResult = findViewById<LinearLayout>(R.id.profile_result)
//        val hashtagResult1 = findViewById<LinearLayout>(R.id.hashtag_result1)
//        val hashtagResult2 = findViewById<LinearLayout>(R.id.hashtag_result2)
//        val locationResult = findViewById<LinearLayout>(R.id.location_result)
//        val hashtagResult3 = findViewById<LinearLayout>(R.id.hashtag_result3)
//        val hashtagResult4 = findViewById<LinearLayout>(R.id.hashtag_result4)
//
//        profileResult.setOnClickListener {
//            showToast("Internshala profile clicked")
//        }
//
//        hashtagResult1.setOnClickListener {
//            showToast("#internshala hashtag clicked")
//        }
//
//        hashtagResult2.setOnClickListener {
//            showToast("#internshala_nomoretheory_challenge clicked")
//        }
//
//        locationResult.setOnClickListener {
//            showToast("Internshala location clicked")
//        }
//
//        hashtagResult3.setOnClickListener {
//            showToast("internshälastudentpartner clicked")
//        }
//
//        hashtagResult4.setOnClickListener {
//            showToast("internshalaincampus clicked")
//        }
//    }
//
//    private fun selectTab(selectedTab: TextView) {
//        // Reset all tabs to unselected state
//        resetAllTabs()
//
//        // Set selected tab appearance
//        selectedTab.setTextColor(ContextCompat.getColor(this, android.R.color.holo_orange_light))
//        selectedTab.setBackgroundResource(R.drawable.tab_selected_underline)
//
//        // Make text bold
//        selectedTab.setTypeface(null, android.graphics.Typeface.BOLD)
//    }
//
//    private fun resetAllTabs() {
//        val grayColor = ContextCompat.getColor(this, android.R.color.darker_gray)
//
//        // Reset all tabs
//        tabTop.setTextColor(grayColor)
//        tabTop.setBackgroundResource(android.R.drawable.btn_default)
//        tabTop.setTypeface(null, android.graphics.Typeface.NORMAL)
//
//        tabAccounts.setTextColor(grayColor)
//        tabAccounts.setBackgroundResource(android.R.drawable.btn_default)
//        tabAccounts.setTypeface(null, android.graphics.Typeface.NORMAL)
//
//        tabTags.setTextColor(grayColor)
//        tabTags.setBackgroundResource(android.R.drawable.btn_default)
//        tabTags.setTypeface(null, android.graphics.Typeface.NORMAL)
//
//        tabPlaces.setTextColor(grayColor)
//        tabPlaces.setBackgroundResource(android.R.drawable.btn_default)
//        tabPlaces.setTypeface(null, android.graphics.Typeface.NORMAL)
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
}
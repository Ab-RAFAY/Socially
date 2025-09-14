package com.example.smdassignment1

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Activity17 : AppCompatActivity() {

//    private lateinit var btnClose: ImageView
//    private lateinit var btnGrid: ImageView
//    private lateinit var btnFlash: ImageView
//    private lateinit var btnRotate: ImageView
//    private lateinit var btnSmiley: ImageView
//    private lateinit var btnCapture: ImageView
//    private lateinit var cameraPreview: FrameLayout
//
//    private lateinit var modeType: TextView
//    private lateinit var modeLive: TextView
//    private lateinit var modeNormal: TextView
//    private lateinit var modeBoomerang: TextView
//    private lateinit var modeSuper: TextView
//
//    private var isFlashOn = false
//    private var isGridOn = false
//    private var currentCameraMode = "NORMAL"
//    private val CAMERA_REQUEST_CODE = 100
//    private val PERMISSION_REQUEST_CODE = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity17)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity18::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        //initViews()
        //setupClickListeners()
        //checkCameraPermission()
        //setInitialMode()
    }

//    private fun initViews() {
//        btnClose = findViewById(R.id.btnClose)
//        btnCapture = findViewById(R.id.btnCapture)
//        cameraPreview = findViewById(R.id.cameraPreview)
//
//        modeType = findViewById(R.id.modeType)
//        modeLive = findViewById(R.id.modeLive)
//        modeNormal = findViewById(R.id.modeNormal)
//        modeBoomerang = findViewById(R.id.modeBoomerang)
//        modeSuper = findViewById(R.id.modeSuper)
//    }
//
//    private fun setupClickListeners() {
//        btnClose.setOnClickListener {
//            finish()
//        }
//
//        btnGrid.setOnClickListener {
//            toggleGrid()
//        }
//
//        btnFlash.setOnClickListener {
//            toggleFlash()
//        }
//
//        btnRotate.setOnClickListener {
//            Toast.makeText(this, "Camera rotated", Toast.LENGTH_SHORT).show()
//        }
//
//        btnSmiley.setOnClickListener {
//            Toast.makeText(this, "Filters and effects", Toast.LENGTH_SHORT).show()
//        }
//
//        btnCapture.setOnClickListener {
//            capturePhoto()
//        }
//
//        // Camera mode click listeners
//        modeType.setOnClickListener {
//            changeCameraMode("TYPE")
//        }
//
//        modeLive.setOnClickListener {
//            changeCameraMode("LIVE")
//        }
//
//        modeNormal.setOnClickListener {
//            changeCameraMode("NORMAL")
//        }
//
//        modeBoomerang.setOnClickListener {
//            changeCameraMode("BOOMERANG")
//        }
//
//        modeSuper.setOnClickListener {
//            changeCameraMode("SUPER")
//        }
//    }
//
//    private fun setInitialMode() {
//        // Set Normal as the default selected mode
//        changeCameraMode("NORMAL")
//    }
//
//    private fun toggleGrid() {
//        isGridOn = !isGridOn
//        if (isGridOn) {
//            btnGrid.alpha = 1.0f
//            Toast.makeText(this, "Grid enabled", Toast.LENGTH_SHORT).show()
//            // Here you would show grid overlay on camera preview
//        } else {
//            btnGrid.alpha = 0.7f
//            Toast.makeText(this, "Grid disabled", Toast.LENGTH_SHORT).show()
//            // Here you would hide grid overlay
//        }
//    }
//
//    private fun toggleFlash() {
//        isFlashOn = !isFlashOn
//        if (isFlashOn) {
//            btnFlash.alpha = 1.0f
//            Toast.makeText(this, "Flash enabled", Toast.LENGTH_SHORT).show()
//        } else {
//            btnFlash.alpha = 0.7f
//            Toast.makeText(this, "Flash disabled", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    private fun changeCameraMode(mode: String) {
//        currentCameraMode = mode
//
//        // Reset all mode text colors
//        val inactiveColor = ContextCompat.getColor(this, android.R.color.darker_gray)
//        val activeColor = ContextCompat.getColor(this, android.R.color.white)
//
//        modeType.setTextColor(inactiveColor)
//        modeLive.setTextColor(inactiveColor)
//        modeNormal.setTextColor(inactiveColor)
//        modeBoomerang.setTextColor(inactiveColor)
//        modeSuper.setTextColor(inactiveColor)
//
//        // Highlight selected mode
//        when (mode) {
//            "TYPE" -> {
//                modeType.setTextColor(activeColor)
//                Toast.makeText(this, "Type mode selected", Toast.LENGTH_SHORT).show()
//            }
//            "LIVE" -> {
//                modeLive.setTextColor(activeColor)
//                Toast.makeText(this, "Live mode selected", Toast.LENGTH_SHORT).show()
//            }
//            "NORMAL" -> {
//                modeNormal.setTextColor(activeColor)
//                Toast.makeText(this, "Normal mode selected", Toast.LENGTH_SHORT).show()
//            }
//            "BOOMERANG" -> {
//                modeBoomerang.setTextColor(activeColor)
//                Toast.makeText(this, "Boomerang mode selected", Toast.LENGTH_SHORT).show()
//            }
//            "SUPER" -> {
//                modeSuper.setTextColor(activeColor)
//                Toast.makeText(this, "Super mode selected", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//    private fun capturePhoto() {
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//            == PackageManager.PERMISSION_GRANTED) {
//
//            when (currentCameraMode) {
//                "NORMAL" -> captureNormalPhoto()
//                "LIVE" -> captureLivePhoto()
//                "BOOMERANG" -> captureBoomerang()
//                "TYPE" -> captureWithText()
//                "SUPER" -> captureSuperPhoto()
//            }
//        } else {
//            Toast.makeText(this, "Camera permission required", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    private fun captureNormalPhoto() {
//        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//        if (intent.resolveActivity(packageManager) != null) {
//            startActivityForResult(intent, CAMERA_REQUEST_CODE)
//        }
//    }
//
//    private fun captureLivePhoto() {
//        Toast.makeText(this, "Live photo captured", Toast.LENGTH_SHORT).show()
//        // Implement live photo capture logic
//    }
//
//    private fun captureBoomerang() {
//        Toast.makeText(this, "Boomerang recording started", Toast.LENGTH_SHORT).show()
//        // Implement boomerang capture logic
//    }
//
//    private fun captureWithText() {
//        Toast.makeText(this, "Text overlay mode", Toast.LENGTH_SHORT).show()
//        // Implement text overlay capture logic
//    }
//
//    private fun captureSuperPhoto() {
//        Toast.makeText(this, "Super photo captured", Toast.LENGTH_SHORT).show()
//        // Implement super photo capture logic
//    }
//
//    private fun checkCameraPermission() {
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//            != PackageManager.PERMISSION_GRANTED) {
//
//            ActivityCompat.requestPermissions(
//                this,
//                arrayOf(Manifest.permission.CAMERA),
//                PERMISSION_REQUEST_CODE
//            )
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//
//        when (requestCode) {
//            PERMISSION_REQUEST_CODE -> {
//                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    Toast.makeText(this, "Camera permission granted", Toast.LENGTH_SHORT).show()
//                } else {
//                    Toast.makeText(this, "Camera permission is required", Toast.LENGTH_LONG).show()
//                    finish()
//                }
//            }
//        }
//    }
//
////    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
////        super.onActivityResult(requestCode, resultCode, data)
////
////        if (requestCode == CAMERA_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
////            val imageBitmap = data?.extras?.get("data") as? Bitmap
////
////            if (imageBitmap != null) {
////                Toast.makeText(this, "Photo captured successfully", Toast.LENGTH_SHORT).show()
////
////                // Return the captured image to the previous activity
////                val resultIntent = Intent()
////                resultIntent.putExtra("captured_image", imageBitmap)
////                setResult(Activity.RESULT_OK, resultIntent)
////                finish()
////            }
////        }
////    }
//
////    override fun onBackPressed() {
////        super.onBackPressed()
////        finish()
////    }


}
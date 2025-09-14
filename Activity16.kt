package com.example.smdassignment1

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.InputStream

class Activity16 : AppCompatActivity() {

//    private lateinit var btnCancel: TextView
//    private lateinit var btnNext: TextView
//    private lateinit var tvRecents: TextView
//    private lateinit var ivMainImage: ImageView
//    private lateinit var btnCrop: ImageView
//    private lateinit var btnAspectRatio: ImageView
//    private lateinit var btnSelectMultiple: ImageView
//    private lateinit var galleryGrid: GridLayout
//    private lateinit var btnLibrary: TextView
//    private lateinit var btnPhoto: TextView
//    private lateinit var btnVideo: TextView
//
//    private val galleryImages = mutableListOf<ImageView>()
//    private val selectedImages = mutableListOf<Uri>()
//    private var currentSelectedImage: Uri? = null
//    private var isMultipleSelectionMode = false
//
//    private val PERMISSION_REQUEST_CODE = 100
//    private val PICK_IMAGE_REQUEST = 1
//    private val CAMERA_REQUEST = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity16)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity17::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        //initViews()
        //setupClickListeners()
        //checkPermissions()
        //populateGalleryImages()
    }

//    private fun initViews() {
//        btnCancel = findViewById(R.id.btnCancel)
//        btnNext = findViewById(R.id.btnNext)
//        ivMainImage = findViewById(R.id.ivMainImage)
//        btnCrop = findViewById(R.id.btnCrop)
//        btnAspectRatio = findViewById(R.id.btnAspectRatio)
//        btnSelectMultiple = findViewById(R.id.selectmultiple)
//        galleryGrid = findViewById(R.id.galleryGrid)
//        btnLibrary = findViewById(R.id.btnLibrary)
//        btnPhoto = findViewById(R.id.btnPhoto)
//        btnVideo = findViewById(R.id.btnVideo)
//
//        // Initialize gallery images list
//        for (i in 1..16) {
//            val imageId = resources.getIdentifier("img$i", "id", packageName)
//            val imageView = findViewById<ImageView>(imageId)
//            galleryImages.add(imageView)
//        }
//    }
//
//    private fun setupClickListeners() {
//        btnCancel.setOnClickListener {
//            finish()
//        }
//
//        btnNext.setOnClickListener {
//            if (selectedImages.isNotEmpty() || currentSelectedImage != null) {
//                val resultIntent = Intent()
//                if (isMultipleSelectionMode) {
//                    resultIntent.putParcelableArrayListExtra("selected_images", ArrayList(selectedImages))
//                } else {
//                    currentSelectedImage?.let {
//                        resultIntent.putExtra("selected_image", it)
//                    }
//                }
//                setResult(Activity.RESULT_OK, resultIntent)
//                finish()
//            } else {
//                Toast.makeText(this, "Please select an image", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        tvRecents.setOnClickListener {
//            // Handle album selection dropdown
//            showAlbumSelection()
//        }
//
//        btnCrop.setOnClickListener {
//            Toast.makeText(this, "Crop functionality", Toast.LENGTH_SHORT).show()
//        }
//
//        btnAspectRatio.setOnClickListener {
//            Toast.makeText(this, "Aspect ratio options", Toast.LENGTH_SHORT).show()
//        }
//
//        btnSelectMultiple.setOnClickListener {
//            toggleMultipleSelection()
//        }
//
//        btnLibrary.setOnClickListener {
//            openGallery()
//        }
//
//        btnPhoto.setOnClickListener {
//            openCamera()
//        }
//
//        btnVideo.setOnClickListener {
//            Toast.makeText(this, "Video selection", Toast.LENGTH_SHORT).show()
//        }
//
//        // Setup gallery image click listeners
//        galleryImages.forEachIndexed { index, imageView ->
//            imageView.setOnClickListener {
//                handleImageSelection(imageView, index)
//            }
//        }
//    }
//
//    private fun populateGalleryImages() {
//        // This is a placeholder implementation
//        // In a real app, you would load actual images from the device gallery
//        galleryImages.forEach { imageView ->
//            imageView.setImageResource(android.R.drawable.ic_menu_gallery)
//        }
//    }
//
//    private fun handleImageSelection(imageView: ImageView, index: Int) {
//        if (isMultipleSelectionMode) {
//            // Handle multiple selection
//            imageView.alpha = if (imageView.alpha == 1.0f) {
//                // Add selection indicator
//                0.5f
//            } else {
//                // Remove selection indicator
//                1.0f
//            }
//        } else {
//            // Single selection - update main image
//            ivMainImage.setImageDrawable(imageView.drawable)
//
//            // Reset all other images to normal opacity
//            galleryImages.forEach { it.alpha = 1.0f }
//
//            // Highlight selected image
//            imageView.alpha = 0.7f
//        }
//    }
//
//    private fun toggleMultipleSelection() {
//        isMultipleSelectionMode = !isMultipleSelectionMode
//
//        if (isMultipleSelectionMode) {
//            Toast.makeText(this, "Multiple selection enabled", Toast.LENGTH_SHORT).show()
//            btnSelectMultiple.alpha = 0.5f
//        } else {
//            Toast.makeText(this, "Single selection enabled", Toast.LENGTH_SHORT).show()
//            btnSelectMultiple.alpha = 1.0f
//            // Reset all image selections
//            galleryImages.forEach { it.alpha = 1.0f }
//            selectedImages.clear()
//        }
//    }
//
//    private fun showAlbumSelection() {
//        val albums = arrayOf("Recents", "Camera", "Screenshots", "Downloads")
//        val builder = android.app.AlertDialog.Builder(this)
//        builder.setTitle("Select Album")
//        builder.setItems(albums) { _, which ->
//            tvRecents.text = albums[which]
//            Toast.makeText(this, "Selected album: ${albums[which]}", Toast.LENGTH_SHORT).show()
//        }
//        builder.show()
//    }
//
//    private fun openGallery() {
//        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
//        startActivityForResult(intent, PICK_IMAGE_REQUEST)
//    }
//
//    private fun openCamera() {
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//            != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this,
//                arrayOf(Manifest.permission.CAMERA),
//                PERMISSION_REQUEST_CODE)
//        } else {
//            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivityForResult(intent, CAMERA_REQUEST)
//        }
//    }
//
//    private fun checkPermissions() {
//        val permissions = arrayOf(
//            Manifest.permission.READ_EXTERNAL_STORAGE,
//            Manifest.permission.CAMERA
//        )
//
//        val permissionsToRequest = permissions.filter {
//            ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
//        }
//
//        if (permissionsToRequest.isNotEmpty()) {
//            ActivityCompat.requestPermissions(
//                this,
//                permissionsToRequest.toTypedArray(),
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
//        if (requestCode == PERMISSION_REQUEST_CODE) {
//            val allPermissionsGranted = grantResults.all { it == PackageManager.PERMISSION_GRANTED }
//
//            if (allPermissionsGranted) {
//                Toast.makeText(this, "Permissions granted", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "Permissions required for full functionality", Toast.LENGTH_LONG).show()
//            }
//        }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (resultCode == Activity.RESULT_OK) {
//            when (requestCode) {
//                PICK_IMAGE_REQUEST -> {
//                    data?.data?.let { uri ->
//                        currentSelectedImage = uri
//                        loadImageIntoMainView(uri)
//                    }
//                }
//                CAMERA_REQUEST -> {
//                    data?.extras?.get("data")?.let { bitmap ->
//                        ivMainImage.setImageBitmap(bitmap as Bitmap)
//                    }
//                }
//            }
//        }
//    }
//
//    private fun loadImageIntoMainView(uri: Uri) {
//        try {
//            val inputStream: InputStream? = contentResolver.openInputStream(uri)
//            val bitmap: Bitmap = BitmapFactory.decodeStream(inputStream)
//            ivMainImage.setImageBitmap(bitmap)
//        } catch (e: Exception) {
//            e.printStackTrace()
//            Toast.makeText(this, "Failed to load image", Toast.LENGTH_SHORT).show()
//        }
//    }
}
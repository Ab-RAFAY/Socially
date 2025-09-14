package com.example.smdassignment1

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.io.InputStream

class Activity15 : AppCompatActivity() {

//    private lateinit var btnCancel: TextView
//    private lateinit var btnDone: TextView
//    private lateinit var ivProfilePhoto: ImageView
//    private lateinit var btnChangePhoto: TextView
//    private lateinit var etName: EditText
//    private lateinit var etUsername: EditText
//    private lateinit var etWebsite: EditText
//    private lateinit var etBio: EditText
//    private lateinit var etBioLine2: EditText
//    private lateinit var btnSwitchProfessional: TextView
//    private lateinit var tvEmail: TextView
//    private lateinit var tvPhone: TextView
//    private lateinit var tvGender: TextView
//
//    private val PICK_IMAGE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity15)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity16::class.java)
            startActivity(intent)
            finish() // removes Activity5 from back stack
        }, 10000) // 10000 ms = 10 seconds

        //initViews()
        //setupClickListeners()
    }

//    private fun initViews() {
//        btnCancel = findViewById(R.id.btnCancel)
//        btnDone = findViewById(R.id.btnDone)
//        ivProfilePhoto = findViewById(R.id.ivProfilePhoto)
//        btnChangePhoto = findViewById(R.id.btnChangePhoto)
//        etName = findViewById(R.id.etName)
//        etUsername = findViewById(R.id.etUsername)
//        etWebsite = findViewById(R.id.etWebsite)
//        etBio = findViewById(R.id.etBio)
//        btnSwitchProfessional = findViewById(R.id.btnSwitchProfessional)
//        tvEmail = findViewById(R.id.etEmail)
//        tvPhone = findViewById(R.id.etPhone)
//        tvGender = findViewById(R.id.etGender)
//    }
//
//    private fun setupClickListeners() {
//        btnCancel.setOnClickListener {
//            onBackPressed()
//        }
//
//        btnDone.setOnClickListener {
//            saveProfile()
//        }
//
//        btnChangePhoto.setOnClickListener {
//            openImageChooser()
//        }
//
//        btnSwitchProfessional.setOnClickListener {
//            Toast.makeText(this, "Switch to Professional Account clicked", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    private fun openImageChooser() {
//        val intent = Intent()
//        intent.type = "image/*"
//        intent.action = Intent.ACTION_GET_CONTENT
//        startActivityForResult(Intent.createChooser(intent, "Select Profile Picture"), PICK_IMAGE_REQUEST)
//    }
//
//    @Deprecated("This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {
//            val uri: Uri = data.data!!
//            try {
//                val inputStream: InputStream? = contentResolver.openInputStream(uri)
//                val bitmap: Bitmap = BitmapFactory.decodeStream(inputStream)
//                ivProfilePhoto.setImageBitmap(bitmap)
//            } catch (e: Exception) {
//                e.printStackTrace()
//                Toast.makeText(this, "Failed to load image", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//    private fun saveProfile() {
//        val name = etName.text.toString().trim()
//        val username = etUsername.text.toString().trim()
//        val website = etWebsite.text.toString().trim()
//        val bio = etBio.text.toString().trim()
//        val bioLine2 = etBioLine2.text.toString().trim()
//
//        if (name.isEmpty()) {
//            Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_SHORT).show()
//            etName.requestFocus()
//            return
//        }
//
//        if (username.isEmpty()) {
//            Toast.makeText(this, "Username cannot be empty", Toast.LENGTH_SHORT).show()
//            etUsername.requestFocus()
//            return
//        }
//
//        // Here you can save the profile data to your database or shared preferences
//        // For now, we'll just show a success message
//        Toast.makeText(this, "Profile updated successfully", Toast.LENGTH_SHORT).show()
//
//        // You can return the updated data to the previous activity if needed
//        val resultIntent = Intent()
//        resultIntent.putExtra("name", name)
//        resultIntent.putExtra("username", username)
//        resultIntent.putExtra("website", website)
//        resultIntent.putExtra("bio", bio)
//        resultIntent.putExtra("bioLine2", bioLine2)
//        setResult(Activity.RESULT_OK, resultIntent)
//
//        finish()
//    }
//
////    override fun onBackPressed() {
////        super.onBackPressed()
////        finish()
////    }

}
package com.example.smdassignment1

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        // Initialize UI components
        val usernameEditText = findViewById<EditText>(R.id.username)
        val yourNameEditText = findViewById<EditText>(R.id.yourName)
        val yourLastNameEditText = findViewById<EditText>(R.id.yourLastName)
        val dateOfBirthEditText = findViewById<EditText>(R.id.dateOfBirth)
        val emailEditText = findViewById<EditText>(R.id.email)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val createAccountButton = findViewById<android.widget.Button>(R.id.createAccountButton)
        val eyeIcon = findViewById<ImageView>(R.id.eyeIcon)

//        // Set initial values
//        usernameEditText.setText("tejpatil064")
//        yourNameEditText.setText("Tejas")
//        yourLastNameEditText.setText("Patil")
//        dateOfBirthEditText.setText("02 - 09 - 2003")

        // Password visibility toggle with single icon
        var isPasswordVisible = false
        eyeIcon.setOnClickListener {
            if (isPasswordVisible) {
                passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            } else {
                passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            }
            passwordEditText.setSelection(passwordEditText.text.length) // keep cursor at end
            isPasswordVisible = !isPasswordVisible
        }

        // Handle Create Account button click (placeholder)
        createAccountButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val yourName = yourNameEditText.text.toString()
            val yourLastName = yourLastNameEditText.text.toString()
            val dateOfBirth = dateOfBirthEditText.text.toString()
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra("username", username)
            intent.putExtra("yourName", yourName)
            intent.putExtra("yourLastName", yourLastName)
            intent.putExtra("dateOfBirth", dateOfBirth)
            startActivity(intent)
        }
    }
}
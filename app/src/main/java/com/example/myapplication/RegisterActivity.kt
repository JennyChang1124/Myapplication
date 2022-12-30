package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {
            if (editUsername.text.trim().isNotEmpty() || editEmail.text.trim()
                    .isNotEmpty() || editCPassword.text.trim()
                    .isNotEmpty() || editPassword.text.trim().isNotEmpty()
            ) {
                Toast.makeText(this, "Input provided", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Input required", Toast.LENGTH_LONG).show()
            }
        }
        tvLogin.setOnClickListener {
            val   intent = Intent(this,MainActivity::class.java);
            startActivity(intent)
        }
    }
}
package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener{

            if (edUsername.text.trim().isNotEmpty()|| edPassword.text.trim().isNotEmpty()) {
                Toast.makeText(this, "Input provided", Toast.LENGTH_LONG).show()
            }else{
                    Toast.makeText( this,"Input required",Toast.LENGTH_LONG).show()
                }
        tvRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java);
            startActivity(intent)
            }
        }
    }
}
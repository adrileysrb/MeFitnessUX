package com.example.mefitnessux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvCreateAccount = findViewById<TextView>(R.id.textView3)
        tvCreateAccount.setOnClickListener { v ->
            startActivity(Intent(this, SignUpActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            finish()
        }
    }
}
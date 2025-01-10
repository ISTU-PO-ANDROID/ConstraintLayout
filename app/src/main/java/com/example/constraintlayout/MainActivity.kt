package com.example.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chainButton = findViewById<Button>(R.id.chainButton)

        chainButton.setOnClickListener{
            val intent = Intent(this, ChainActivity::class.java)
            startActivity(intent)
        }
    }
}
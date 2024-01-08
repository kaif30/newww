package com.example.newww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var forget :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        forget=findViewById(R.id.forgot_password_)
        forget.setOnClickListener {
            Toast.makeText(this, "Bhulakkad", Toast.LENGTH_SHORT).show()
        }



    }

}

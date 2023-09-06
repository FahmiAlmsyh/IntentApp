package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntenActivity : AppCompatActivity() {

    lateinit var btn_back : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inten)

        btn_back = findViewById(R.id.btn_back_to_main_activity)
        btn_back.setOnClickListener{
            val intent = Intent(this@IntenActivity, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
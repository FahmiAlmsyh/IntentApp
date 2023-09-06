package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IntentWithDataActivity : AppCompatActivity() {

    lateinit var tvIntentData : TextView
    lateinit var tvIntentKelas : TextView

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val CLASS_DATA = "class_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_with_data)

        tvIntentData = findViewById(R.id.tv_intent_data)
        tvIntentKelas = findViewById(R.id.tv_intent_class)

        val data = intent.getStringExtra(EXTRA_DATA)
        val kelas = intent.getStringExtra(CLASS_DATA)

        tvIntentData.text = data
        tvIntentKelas.text = kelas
    }
}
package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnMove : Button
    lateinit var btnIntentWithData : Button
    lateinit var btnPort : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move)
        btnIntentWithData = findViewById(R.id.btn_intent_with_data)
        btnPort = findViewById(R.id.btn_port)

        btnMove.setOnClickListener{
            val intent = Intent(this@MainActivity, IntenActivity::class.java)

            startActivity(intent)
        }

        btnPort.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://fahmialmsyh.github.io"))

            startActivity(intent)
        }

        btnIntentWithData.setOnClickListener{
        val intent = Intent(this@MainActivity, IntentWithDataActivity::class.java)
            intent.putExtra(IntentWithDataActivity.EXTRA_DATA, "Halo Saya Fahmi")
            intent.putExtra(IntentWithDataActivity.CLASS_DATA, "Saya kelas 11")

            startActivity(intent)
        }


    }
}
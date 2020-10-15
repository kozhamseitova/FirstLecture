package com.example.firstlecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openHelloButton: Button = findViewById(R.id.button)
        openHelloButton.setOnClickListener {
            val helloScreenIntent = Intent(this, HelloActivity::class.java)
            startActivity(helloScreenIntent)
        }
    }

    override fun onStart(){
        super.onStart();
        Log.d(TAG, "onStart")
    }

    override fun onResume(){
        super.onResume();
        Log.d(TAG, "onResume")
    }

    override fun onPause(){
        Log.d(TAG, "onPause")
        super.onPause();
    }

    override fun onStop(){
        Log.d(TAG, "onStop")
        super.onStop();
    }
}
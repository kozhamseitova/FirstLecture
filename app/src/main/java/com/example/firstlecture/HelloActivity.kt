package com.example.firstlecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG1 = "HelloActivity"

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
    }

    override fun onStart(){
        super.onStart();
        Log.d(TAG1, "onStart")
    }

    override fun onResume(){
        super.onResume();
        Log.d(TAG1, "onResume")
    }

    override fun onPause(){
        Log.d(TAG1, "onPause")
        super.onPause();
    }

    override fun onStop(){
        Log.d(TAG1, "onStop")
        super.onStop();
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG1,"onRestart")
    }

    override fun onDestroy() {
        Log.d(TAG1,"onDestroy")
        super.onDestroy()
    }

}
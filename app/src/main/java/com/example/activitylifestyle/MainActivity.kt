package com.example.activitylifestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "On Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "On Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "On Destroy")
    }
}
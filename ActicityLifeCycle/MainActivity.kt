package com.example.androidexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {
    var count=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle","${++count} On Create")

    }
    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle","${++count} On Start")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d("Lifecycle","${++count} On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle","${++count} On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle","${++count} On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","${++count} On Destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle","${++count} On Restart")
    }
}
package com.example.leo.kaffee_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        val intenta = Intent(this, MainActivity::class.java)
        mHandler = Handler()
        // Set a click listener for run button
        mRunnable = Runnable {
            // Do something here
            startActivity(intenta)
        }
        // Schedule the task to repeat after 1 second
        mHandler.postDelayed(
            mRunnable, // Runnable
            2000 // Delay in milliseconds
        )
    }
}

package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Progress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)
        Handler(Looper.getMainLooper()).postDelayed(

            {
                var i= Intent(this,MainActivity::class.java)
                startActivity(i)
                finish()
            },1000)
    }
}
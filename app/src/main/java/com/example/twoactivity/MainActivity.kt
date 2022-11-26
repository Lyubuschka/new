package com.example.twoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeToNextActivity(view: View){
        val intentToCnangeToNextActivity = Intent(this, SecondActivity::class.java)
        startActivity(intentToCnangeToNextActivity)
    }
}
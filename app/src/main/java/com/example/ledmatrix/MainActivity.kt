package com.example.ledmatrix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advertise.AdvertiseActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val intent = Intent(this, AdvertiseActivity::class.java)
        startActivity(intent)
    }
}
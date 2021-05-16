package com.muramsyah.jetpackpro.testingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muramsyah.jetpackpro.testingproject.databinding.ActivityBambangBinding

class BambangActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBambangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bambang)
    }
}
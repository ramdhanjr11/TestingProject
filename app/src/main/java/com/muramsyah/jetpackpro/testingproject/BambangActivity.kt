package com.muramsyah.jetpackpro.testingproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muramsyah.jetpackpro.testingproject.databinding.ActivityBambangBinding

class BambangActivity : AppCompatActivity() {
    private lateinit var bambangBinding: ActivityBambangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bambang)
    }
}
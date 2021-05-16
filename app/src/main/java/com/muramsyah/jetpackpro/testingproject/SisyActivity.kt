package com.muramsyah.jetpackpro.testingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muramsyah.jetpackpro.testingproject.databinding.ActivitySisyBinding

class SisyActivity : AppCompatActivity() {

    private lateinit var sisyBinding: ActivitySisyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sisyBinding = ActivitySisyBinding.inflate(layoutInflater)
        setContentView(sisyBinding.root)

//        sisytralala
    }
}
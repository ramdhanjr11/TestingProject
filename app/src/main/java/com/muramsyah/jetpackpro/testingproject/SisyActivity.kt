package com.muramsyah.jetpackpro.testingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muramsyah.jetpackpro.testingproject.databinding.ActivitySisyBinding

class SisyActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySisyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySisyBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        sisytralala wkkwk ko awal awal ada
//        sisytralala wkkwk ko awal awal ada dua
    }
}
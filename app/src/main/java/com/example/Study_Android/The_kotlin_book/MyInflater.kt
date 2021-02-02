package com.example.Study_Android.The_kotlin_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Study_Android.R
import kotlinx.android.synthetic.main.activity_my_inflater.*

class MyInflater : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_inflater)

        button5.setOnClickListener {
            layoutInflater.inflate(R.layout.part1, container, true)
        }
//        button6.setOnClickListener {
//            layoutInflater.inflate(R.layout.part1, container, false)
//        }
    }
}
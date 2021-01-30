package com.example.Study_Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dog.*

class Dog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        var dog:String
        var dog2:String

        button3.setOnClickListener {
            dog = editTextTextPersonName.text.toString()
            textView.setText(dog)
        }
        button4.setOnClickListener {
            dog2 = editTextTextPersonName2.text.toString()
            textView.setText(dog2)
        }
    }
}
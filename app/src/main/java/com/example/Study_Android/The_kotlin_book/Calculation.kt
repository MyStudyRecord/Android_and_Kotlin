package com.example.Study_Android.The_kotlin_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.Study_Android.R
import kotlinx.android.synthetic.main.activity_calculation.*

class Calculation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
        var sum: Int =0
        plus1.setOnClickListener {
                val number11: Int = number1.text.toString().toInt()
                val number22: Int = number2.text.toString().toInt()
                sum = number11+number22
                sum1.text = sum.toString()
        }
    }
}
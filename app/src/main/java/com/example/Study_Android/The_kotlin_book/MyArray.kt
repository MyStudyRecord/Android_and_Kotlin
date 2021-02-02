package com.example.Study_Android.The_kotlin_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Study_Android.R
import kotlinx.android.synthetic.main.activity_my_array.*
import java.util.*

class MyArray : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_array)

        check1.setOnClickListener {
            val names = arrayOf("홍길동","전우치","춘향이")
            val names2 = Array<String>(3,{ index -> "홍길동${index}"})
            val names3 = arrayOfNulls<String>(3)
            val names4 = emptyArray<String>()

            textView.append("\n${Arrays.toString(names)}")
            textView.append("\n${Arrays.toString(names2)}")
            textView.append("\n${Arrays.toString(names3)}")
            textView.append("\n${Arrays.toString(names4)}")

        }

        check2.setOnClickListener {
            val digits = intArrayOf(1,2,3)
            digits.set(2,5)
            val aDigits = digits.get(2)
            textView.append("\n세 번째 숫자:${aDigits}")
            textView.append("\n원소 개수:${digits.count()}")
            val aIndex = digits.indexOf(5)
            textView.append("\n${aIndex}")
            //digits.plus(3)
            digits.forEach { elem -> textView.append("${elem}") }
        }
    }
}
package com.example.Study_Android.The_kotlin_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Study_Android.R
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.activity_list.check1
import kotlinx.android.synthetic.main.activity_list.textView
import kotlinx.android.synthetic.main.activity_my_array.*
import java.util.*

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        check1.setOnClickListener {
            val names = listOf("홍길동","사오정","저팔계")
            val names2 = List<String>(3, {index ->  "홍길동${index}"})
            val names3 = mutableListOf<String>("홍길동1","홍길동2","홍길동3")
            val names4 = emptyList<String>()
            val names5 = arrayListOf<String>("홍길동1","홍길동2","홍길동3")

            textView.append("\n${names.joinToString()}")
            textView.append("\n${names2.joinToString()}")
            textView.append("\n${names3.joinToString()}")
            textView.append("\n${names4.joinToString()}")
            textView.append("\n${names5.joinToString()}")
        }
    }
}
package com.example.Study_Android.The_kotlin_book

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Study_Android.R
import kotlinx.android.synthetic.main.activity_intent3.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent3)
        call.setOnClickListener {
            val mobile = phone_number.text.toString()
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${mobile}"))
            startActivity(intent)
        }
    }
}
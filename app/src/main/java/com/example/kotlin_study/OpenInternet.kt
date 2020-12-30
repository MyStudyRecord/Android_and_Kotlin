package com.example.kotlin_study

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_open_internet.*

class OpenInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_internet)

        open.setOnClickListener {
            val http = http.text.toString()
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(http))
            startActivity(intent)
        }


        //실시간 타이핑 변화
        http.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit","beforeTextChanged : "+s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit","onTextChanged : "+s)
            }

            override fun afterTextChanged(s: Editable?) {
                if(s.toString()=="abc"){
                    Log.d("edit","금지어")
               }
                Log.d("edit","afterTextChanged : "+s)
            }
        })
    }
}
package com.example.kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin_study.kotlin.num
import kotlinx.android.synthetic.main.activity_a_calculator.*

class A_calculator : AppCompatActivity() {

    var new = 0
    var old = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_calculator)


        n_1.setOnClickListener {  }
        n_2.setOnClickListener {  }
        n_3.setOnClickListener {  }
        n_4.setOnClickListener {  }


        plus.setOnClickListener {


        }
        equal.setOnClickListener {

        }
        CA.setOnClickListener {

        }
    }
}
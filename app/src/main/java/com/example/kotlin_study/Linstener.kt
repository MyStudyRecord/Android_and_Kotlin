package com.example.kotlin_study

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView



class Linstener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linstener)

        //뷰를 activity로 가져오는 방법
//        1. 직접 찾아서 가져온다다
       val helloo : TextView = findViewById(R.id.helloo)
//
//        2. xml을 import해서 가져온다
//        hello.


        //익명함수
        //1 람다 방식
       helloo.setOnClickListener {
           Log.d("click","Click!!")
       }
        //2 익명 함수 방식
        helloo.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click","Click!!")
            }
        })
        //3 이름이 필요한 경우(click)
        val click = object : View.OnClickListener{
            override fun onClick(v: View?) {
                helloo.setText("안녕하세요")

            }
        }
        helloo.setOnClickListener(click)


        // 뷰를 조작 하는 함수들


    }
}
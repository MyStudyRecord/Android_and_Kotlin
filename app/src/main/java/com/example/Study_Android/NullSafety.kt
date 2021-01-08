package com.example.Study_Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {
    lateinit var lateCar: Car

    class Car(var number:Int){
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number1 :Int =10
        val number11 :Int? = null

        val number5:Int = number1!! +10

        //이런건 문법에 없음
       // val number3 : number1? + number11
        val number3 = number11?.plus(number1)
        Log.d("number", "number3: "+number3)

        //삼항연산자 -> 엘비스 연산자(?:)
        //Null safety
        //number1이 null이면 10c 아니면 number1이 들어간다
        val number4 = number1 ?:10

        lateCar=Car(10)
        Log.d("number","late number : "+lateCar.number)
    }

    fun plus(a:Int, b:Int?):Int{
        if(b!=null) return a+b
        else return a
    }
    fun plus2(a:Int, b:Int?):Int?{
        return b?.plus(a)
    }
}

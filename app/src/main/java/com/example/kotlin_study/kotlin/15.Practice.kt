package com.example.kotlin_study.kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array: Array<String>){
    val a= mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0,100)
    println(a)
    a.set(0,2)
    println(a)
    //삭제
    a.removeAt(0)
    println(a)

    val b=mutableSetOf<Int>(1,2,2,3,4)
    b.add(2)
    println(b)
    //2 전체 삭제
    b.remove(2)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two",1)
    println(c)
    //two의 1을 3로 바꿈
    c.replace("two",3)
    println(c)
    //key만 출력
    println(c.keys)
    //values 만 출력
    println(c.values)
    //전부삭제
    c.clear()
    println(c)
}
package com.example.Study_Android.kotlin

fun main(array: Array<String>){
    val a= mutableListOf<Int>(1,2,3,4,5,6,70,8,9)

    //반복하는 방법1
    for(item in a){
        println(item)
    }
    println()

    //반복하는 방법2
    for ((index,item) in a.withIndex())
        println("index : "+index +" value : "+item)
    //문자열 + int(정수)등 = 문자열

    println()
    //반복하는 방법3
    //람다
    a.forEach{
        println(it)
    }

    //반복하는 방법4
    a.forEach{item->
        println(item)
    }

    //반복하는 방법5
    //값과 인덱스 같이
    a.forEachIndexed{index, item->
        println("index : "+index +" value : "+item)
    }

    //반복하는 방법6
    println(a.size)
    println()
    for (i in 0 until a.size){
        //until은 마지막을 포함 하지 않는다
        //0부터 8까지
        println(a.get(i))
    }

    //반복하는 방법7
    //step은 2칸씩 점프해 가며 출력됨 예)0,2,4,6,8
    for(i in 0 until a.size step(2)){
        println(a.get(i))
    }

    //반복하는 방법8
    //8부터 0까지 반복
    for (i in a.size-1 downTo (0))
    {
        println(a.get(i))
    }

    //반복하는 방법9
    for(i in a.size-1 downTo(0) step(2)){
        println(a.get(i))
    }

    //반복하는 방법10
    for (i in 0..a.size){
        //0부터 10까지
        //..은 마지막을 포함 <->until은 마지막을 포함하지 않는다
        println(i)
    }

    //반복하는 방법11
    var b:Int = 0
    var c:Int = 4

    while (b<c){
        b++
        println("b")
    }

    //반복하는 방법12
    do {
        println("hello")
        d++
    }while (b>c)
}
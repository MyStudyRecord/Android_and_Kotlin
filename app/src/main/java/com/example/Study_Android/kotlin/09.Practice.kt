package com.example.Study_Android.kotlin

//if, else 예제
fun main(array: Array<String>){

    val a:Int?=null
    val b:Int=10
    val c:Int=100

    if(a==null){
        println("a = null")
    }else {
        println("a = null(X)")
    }

    if (b+c==110){
        println("b + c = 110")
    }else{
        println("b + c = 110(X)")
    }

    //엘비스 연산자
    //null에 세이프 = null에 대응할수 있다
    val number: Int? = null
    val number2 = number ?:10 //만약 number이 null이라면 10이 들어가고 아니라면 number의 값이 number2에 들어간다


}
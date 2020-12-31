package com.example.Study_Android.kotlin

var a = 5 + 5 //연산가능
var b = "1"
var c = b.toInt() //문자 1을 정수 1로 바꿈
var d = b.toFloat()

var e = "AKILE"
var f = "My name is $e"

//null
var abc: Int? = null //자료형 뒤에 ?를 붙이면 null을 가질수 있음

fun main(array: Array<String>){
    println("$a \n $b \n $c \n $d \n $e \n $f \n")
    //null 출력
    println(abc)


}
package com.example.kotlin_study.kotlin

//변수 선언 방법
//1. var/val 변수명 = 값
//2. var/val 변수명: 자료형 = 값
//var은 계속해서 값 변경가능
//val은 한번 넣으면 바꿀수 없음

var num = 10
var hello = "Hello World"
var point = 3.4
val fix = 20

fun main(args:Array<String>){
    println(num)
    println(hello)
    println(fix)

    num = 100
    hello = "Ok"
    //val로 선언한 fix는 값을 바꿀수 없음
    println(num)
    println(hello)
    println(fix)
}
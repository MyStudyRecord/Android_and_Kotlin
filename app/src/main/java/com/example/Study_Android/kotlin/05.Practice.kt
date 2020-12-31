package com.example.Study_Android.kotlin

// 함수 사용 예제
// +, -, *
fun plusThree(first: Int,second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun mutiplyThree(first: Int, second: Int, third: Int = 6): Int {
    return first * second * third
}

//내부 함수
//함수 안에 함수를 넣음
fun showMyPlus(first: Int, second: Int): Int{
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int{
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>){
    val result = plusThree(10,20,30)
    val result2 = minusThree(10,10,10)
    val result3 = mutiplyThree(10,5,1)
    println("$result\n$result2\n$result3\n")

    //함수안에 또다른 함수
    val result4 = showMyPlus(10,7)
    println(result4)
}
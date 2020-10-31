package com.example.kotlin_study.kotlin

//제어 흐름
//if, else


fun main(array: Array<String>) {
    val a: Int = 10
    val b: Int = 20

    //방법1
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }

    //방법2
    if (a > b) {
        println("a가 b보다 클때만 실행된다")
    }
    //위의 코드처럼 간단한 경우 코틀린에서는 줄여서 쓸수있다
    if (a > b) println("a가 b보다 클때만 실행된다")

    //방법3
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else { //a>b 도 a<b도 아닌 그 밖에 것(a==b)
        println("모두 아닌경우")
    }

    //값을 리턴하는 if(무조건 값을 리턴해야함)
    //a가 b보다 크면 a값을 max에 넣고 아니면 b값을 max에 넣는다
    val max = if (a > b) {
        a
    } else {
        b
    }
    println(max)
    //위의 코드를 줄여서 적는 방법
    val max2 = if (a > b) a else b
    println(max2)


}
package com.example.Study_Android.kotlin

//제어흐름
//when

fun main(array: Array<String>) {
    val value: Int = 3

    //when 문
    when (value) {
        //1일때 실행
        1 -> {
            println("1")
        }
        2 -> {
            println("2")
        }
        3 -> {
            println("3")
        }
        else -> {//1,2,3 다 아닐때
            println("i do not know")
        }
    }
    //위의 코드를 if문과 비교
    if (value == 1) {
println("1")
} else if (value == 2) {
    println("2")
} else if (value == 3) {
    println("3")
} else {
    println("i do not know")
}

//값을 리턴하는 when
val value2 = when (value) {
    1 -> 10
    2 -> 20
    3 -> 30
    else -> 100
}
println(value2)
}
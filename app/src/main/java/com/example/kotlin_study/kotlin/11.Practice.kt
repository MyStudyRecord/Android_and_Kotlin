package com.example.kotlin_study.kotlin

//when예제
fun main(array: Array<String>) {

    val value: Boolean? = null
    //when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when (value) {
        true -> println("true")
        false -> println("true")
        null -> println("null")
    }

    //when의 다양한 조건식1
    val value2: Int = 10
    when (value2) {
        is Int -> println("value2 is int")//is : 타입을 물으는 연산자(value2 가 int타입이냐고 물어봄)->true
        else -> println("value2 is not int")
    }

    //when의 다양한 조건식2
    val value5: Int = 87
    when (value5) {
        in 60..70 -> println("60~70")//value5가 60~70사이에 있다면
        else -> println("value is not 60~70")
    }
}
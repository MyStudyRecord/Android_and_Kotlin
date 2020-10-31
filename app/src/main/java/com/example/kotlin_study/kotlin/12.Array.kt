package com.example.kotlin_study.kotlin

//배열
//배열이 필요한 이유
// 그룹(모음집)이 필요할때

fun main(array: Array<String>){
    //생성방법1
    // var group1 = arrayOf<자료형>()
    var group1 = arrayOf<Int>(1,2,3,4,5)

    println(group1 is Array)

    //생성방법2
    //<자료형>을 적어주지 않으면 array에는 모든 타입이 들어갈수있음
    var group2 = arrayOf(1,2,3,"박",4)

    //배열의 값을 꺼내는 방법1
    val test1 = group1.get(0)
    println(test1)

    //배열의 값을 꺼내는 방법2
    val test2 = group1[0]
    println(test2)

    //배열의 값을 바꾸는 방법1
    group1.set(0,100)
    println(group1[0])

    //배열의 값을 바꾸는 방법2
    group1[0]=100
    println(group1[0])
}
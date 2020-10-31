package com.example.kotlin_study.kotlin

//함수
// 선언방법
//fun 함수명 (변수명: 타입, 변수명: 타입...(여러개 가능)) : 반환형 {
//              함수내용
//              return 반환값
// }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트(기본값)을 갖는 함수
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//반환값이 없는 함수
fun printPlus(first: Int, second: Int): Unit { //Unit = 아무것도 리턴하지 않겠다/ 생략가능
    val result: Int = first + second
    println(result)
}

//반환값이 없는 함수(Unit생략가능)
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

//가변인자를 갖는 함수
fun plusMany(vararg numbers: Int){ //vararg : 인수를 1개부터 n개까지 받을수 있게 해준다
    for (number in numbers){
        println(number)
    }
}

//간단하게 함수를 선언하는 방법
fun plusShow(first: Int, second: Int) = first + second

fun main(array: Array<String>) {
    //첫번째 함수호출방법
    val result = plus(10, 20)
    println(result)
    //두번째 인수를 명시적으로 전달하는방법
    val result1 = plus(first = 10, second = 20)
    println(result1)

    //디폴트 값 함수 호출
    println()
    val result4 = plusFive(10, 20)
    println(result4)

    var result5 = plusFive(10)
    println(result5) //10 + 5

    //반환값이 없는 함수 호출
    printPlus(10, 20)
    printPlus2(10, 30)

    //간단한 함수 호출
    println(plusShow(100, 100))

    //가변인자 함수 호출
    println() //줄뛰기
    plusMany(1,2,3,4,5)

}
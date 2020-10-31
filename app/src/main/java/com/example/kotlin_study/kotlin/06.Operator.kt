package com.example.kotlin_study.kotlin

//연산자
//산술 연산자
//+, -, *, /(몫), %(나머지)

//대입 연산자
//좌 = 우 (우의 값이 좌에 들어간다)
//number = 5 (가능), 5 = number(불가능)

//복합 대입 연산자
// +=, -=, *=, /=, %=
//a += 10 -> a=a+10
//a -= 10 -> a=a-10
//a *= 10 -> a=a*10
//a /= 10 -> a=a/10
//a %= 10 -> a=a%10

//증감 연산자
//++, --
//예)a++, a--

//비교 연산자
//>, >=, <, <=, ==, !=
//10 >= 2 -> True (10이 2보다 크거나 같은가)
//10 <= 2 -> False (2가 10보다 크거나 같은가)
//True == True -> True (True가 True와 같은가)
//True == False -> False (True가 True와 같은가)
//Ture != Ture -> False (True가 True와 다른가)
//Ture != False -> Ture (True가 True와 다른가)

//논리 연산자
//&& : 좌변과 우변 모두 Ture인 경우 Ture
//|| : 좌변 또는 우변 하나가 Ture인 경우 Ture
//! : Ture를 false로 false를 Ture로 바꿈
//! : (예) !Ture -> False

fun main(array: Array<String>) {
    //산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    //대입 연산자
    var f = 5
    println(f)

    //복합 대입 연산자
    a += 10
    println(a)
    b-=10
    println(b)
    c%=2
    println(c)

    //증감 연산자
    a++ //+1
    b-- //-1
    println(a)
    println(b)

    //비교연산자
    var g = a > b
    var h = a==b
    println(g)
    println(h)

    //논리 연산자
    var j = h && g
    var i = h || g
    println(j)
    println(i)
}

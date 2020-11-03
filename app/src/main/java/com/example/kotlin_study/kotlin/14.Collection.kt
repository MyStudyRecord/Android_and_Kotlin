package com.example.kotlin_study.kotlin

//collection(모읍집)
//list, set, map

fun main(array: Array<String>) {
    //값을 변경할수 없는 collection(immutable collections)
    //list -> 중복을 허용한다
    val numberlist = listOf<Int>(1, 2, 3)
    println(numberlist)
    val numberlist2 = listOf<Int>(3,3,3,3,3,3)
    println(numberlist2)

    //set -> 중복을 허용하지 않는다
    //순서가 없다/ get못씀
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)

    //map -> key,value
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one")) //출력값 1



    //값을 변경할수 있는 collection(Mutable collection)
    val mnumber = mutableListOf<Int>(1,2,3)
    mnumber.add(3,10)
    println()
    println(mnumber)

    val munberset = mutableSetOf<Int>(1,4,2,9,7)
    munberset.add(8)
    println(munberset)

    val munbermap = mutableMapOf<String,Int>("one" to 1)
    //map는 다른것들과 값을 넣을때 다름
    munbermap.put("two",2)
    println(munbermap)
    println(munbermap.get("one"))


}
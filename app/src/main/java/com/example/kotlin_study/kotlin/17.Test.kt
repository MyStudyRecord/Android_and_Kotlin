package com.example.kotlin_study.kotlin

fun main(array: Array<String>){
    first();

}
fun first(){
    val list1 = MutableList(9,{0})
    val list2 = MutableList(9,{true})
    for(i in 0..8){
        list1[i] = i+1
    }
    println(list1)

    for (i in 0..8)
    {
        if (list1[i]%2==1){
            list2[i]=false
        }
    }
    println(list2)
}

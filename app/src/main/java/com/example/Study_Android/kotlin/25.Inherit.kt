package com.example.Study_Android.kotlin

//두번까지는 봐준다
//두번 이상이 넘어가면 리펙토링 해라

fun main(args:Array<String>){
    val superCar100 = SuperCar100()
    superCar100.drive()

}

open class Car100(){
    open fun drive():String{
       // println("달린다")
        return "달린다"
    }
    fun stop(){

    }
}

class SuperCar100(): Car100(){
    override fun drive() :String{
        //super.drive()
        val run = super.drive()
        return "빨리 $run"
    }

}
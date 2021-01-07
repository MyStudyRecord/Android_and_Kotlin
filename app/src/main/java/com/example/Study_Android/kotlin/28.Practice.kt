package com.example.Study_Android.kotlin


//인터페이스도 구현이 있는 함수를 만들수 있다
//인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다
//인터페이스에 구현이 없는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 반드시 구현해야 한다


fun main(args:Array<String>){
    val student = Student_1()
    student.sleep()
}

interface Person_1{
    //abstract 반드시 구현해야함
    fun eat(){
        println("먹는다")
    }
    fun sleep(){
        println("잔다")
    }
    abstract fun study()
}

class Student_1 :Person_1{
    override fun study() {
    }
}
class Teacher_1:Person_1{
    override fun study() {
    }
}
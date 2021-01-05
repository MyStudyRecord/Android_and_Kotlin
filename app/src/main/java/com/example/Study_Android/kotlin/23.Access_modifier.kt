package com.example.Study_Android.kotlin


//pirvate 키워드 땜에 외부에서 사용못한다
fun main(array:Array<String>){
    val testAccess: TestAccess= TestAccess("아무개")
    testAccess.test()
    println(testAccess.name)
    testAccess.name = "아무개 투"
    println(testAccess.name)

    val reward:Reward=Reward()
    reward.rewardAmount=2000
}

class Reward(){
    var rewardAmount : Int = 1000

}

class TestAccess{
    var name:String = "홍길동"
    private var hint:Int=0

    constructor(name:String){
        this.name=name
    }
    fun changeName(newName:String){
        this.name=newName
    }
    fun test(){
        println("테스트")
    }
}

class RunningCar(){
    fun runFast(){

    }
    fun run(){

    }
}
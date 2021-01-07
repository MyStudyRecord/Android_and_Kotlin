package com.example.Study_Android.kotlin

//과제
//Night, Monster (부모)
//SuperNight, SuperMonster (자식)

fun main(array: Array<String>){
    val monster=SuperMonster(100,10)
    val night=SuperNight(200,30)
    monster.act(night)
    monster.bite(night)

}

//상속이 만들어낸 특징
//자식 클래스는 부모 클래스의 타입이다
//부모 클래스는 자식 클래스의 타입이 아니다

open class Charator(var hp:Int, val dmg:Int){
    fun act(charator: Charator, dmg: Int = this.dmg){
        charator.hart(dmg)
    }
    open fun hart(dmg: Int){
        hp -=dmg
        if(hp>0) println("${javaClass.simpleName} 남은 체력 $hp")
        else println("사망")
    }
}
class SuperMonster(hp :Int,dmg:Int) : Charator(hp,dmg){
    fun bite(charator: Charator){
        super.act(charator, dmg+2)
    }
}
class SuperNight(hp :Int,dmg:Int) : Charator(hp,dmg){
    val hartpower =2
    override fun hart(dmg: Int) {
        super.hart(dmg - hartpower)
    }
}
package com.example.Study_Android.kotlin

fun main(array:Array<String>){
    val night1=Night(20,4)
    val monster1=Monster(15,3)

    night1.attack(monster1)
    monster1.attact(night1)

}

class Night(var hp:Int, var power:Int){
    fun attack(monster:Monster){
        monster.defense(power)
    }
    fun defense(damage: Int){
        hp-=damage
        if(hp>0){
            heal()
            println("기사 현재 체력은 $hp 입니다")
        }
        else println("기사가 죽었습니다")
    }
    fun heal(){
        hp +=3
    }
}

class Monster(var hp:Int, var power:Int){
    fun attact(night: Night){
        night.defense(power)
    }
    fun defense(damage:Int){
        hp -=damage
        if(hp>0) println("몬스터 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다")
    }

}
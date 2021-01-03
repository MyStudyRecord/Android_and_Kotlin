package com.example.Study_Android.kotlin

/*
1. 사칙 연산을 수행할 수 있는 클래스
2. 은행 계좌 만들기
    -계좌 생성 기능(이름, 생년 월일)
    -잔고를 확인 하는 기능
    -출금 기능
    -예금 기능
3.TV 클래스
    -on/ off 기능
    -채널을 돌리는 기능
    -초기 채널은 (S사 M사 K사 3개)
 */

fun main(array: Array<String>){

    val math = Math()
    math.divide(1,2)
    math.plus(4,1)
    math.multiply(6,6)
    println()
    val math2 =Math2()
    println(math2.minus(10,2,2,2,5))
    println()
    val bank = Bank()
    bank.In(1000)
    bank.out(300)
    bank.out(1000)
    bank.check()
    println()
    val tv = Tv()
    tv.changeChannel(0)
    tv.tvOnOff("on")
    tv.changeChannel(0)
    tv.changeChannel(1)
    println("=")
    val math3=Math3(3)
    val math3_1 = math3.plus(5).minus(5)
    println(math3_1)
    println()
    val account =Account("홍길동","1990/2/1",1000)
    println(account.checkBalance())

}

class Math(){
    var value:Int = 0
    fun plus(one :Int, two :Int){
        value = one + two
        println("$value")
    }
    fun subtract(one :Int, two :Int){
        value = one - two
        println("$value")
    }
    fun multiply(one :Int, two :Int){
        value = one * two
        println("$value")
    }
    fun divide(one :Int, two :Int){
        value = one / two
        println("$value")
    }
}

class Math2(){
    fun plus(vararg numbers:Int):Int{
        var result = 0
        numbers.forEach {
            result+=it
        }
        return result
    }
    fun minus(vararg numbers:Int):Int{
        var result:Int = numbers[0]
        for(i in 0 until numbers.size) {
            if(i!=0){
                result = result - numbers[i]
            }
        }
        return result
    }
    fun multiply(vararg numbers:Int):Int{
        var result:Int = 1
        numbers.forEach {
            if(it !=0){
                result *= it
            }
        }
        return result
    }
    fun divide(vararg  numbers:Int):Int {
        var result:Int = numbers[0]
        numbers.forEachIndexed{index, value->
            if(index!=0){
                if(value !=0){
                    result = result / value
                }
            }
        }
        return result
    }
}

class  Math3(val initialValue: Int){
    fun plus(one :Int):Math3{
            val result = this.initialValue + number
            return Math3(result)
    }
    fun minus(one :Int):Math3{
        val result = this.initialValue -number
        return Math3(result)
    }
    fun multiply(one :Int):Math3{
        val result = this.initialValue * number
        return Math3(result)
    }
    fun divide(one :Int):Math3{
        val result = this.initialValue / number
        return Math3(result)
    }
}

/*2. 은행 계좌 만들기
-계좌 생성 기능(이름, 생년 월일)
-잔고를 확인 하는 기능
-출금 기능
-예금 기능
*/
class Bank(){
    var amount:Int=0
    fun In(money:Int){
        amount+=money
        println("$money 예금")
    }
    fun out(money:Int){
        if(amount<money){
            println("잔고가 충분하지 않습니다")
        }else {
            amount -= money
            println("$money 출금")
        }
    }
    fun check(){
        println("현재 남은 잔고는 $amount 입니다")
    }

}




class Account(val name:String, val birth:String, var balance:Int){
    fun checkBalance():Int{
        return balance
    }
    fun withdraw(amount:Int):Boolean{
        if(balance>=amount){
            balance = balance - amount
            return true
        }else{
            return false
        }
    }
    fun save(amount: Int){
        balance +=amount
    }
}


/*3.TV 클래스
-on/ off 기능
-채널을 돌리는 기능
-초기 채널은 (S사 M사 K사 3개)
*/
class Tv(){
    var state:String="off"
    var channel= arrayOf("S","M","K")
    var nowChannel = channel[0]

    fun tvOnOff(value:String){
        state=value
        println("TV가 $state 상태로 되었습니다")
    }

    fun changeChannel(value:Int){
        if(state=="off"){
            println("먼저 TV를 틀어주세요")
        }else{
            nowChannel=channel[value]
            println("현재 채널은 $nowChannel 입니다다")
       }
    }

}

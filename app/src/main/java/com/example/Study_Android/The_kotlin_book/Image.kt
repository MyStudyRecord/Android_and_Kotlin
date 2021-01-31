package com.example.Study_Android.The_kotlin_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Study_Android.R
import kotlinx.android.synthetic.main.activity_image.*

class Image : AppCompatActivity() {
    var person: Person? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        createPersonButton.setOnClickListener {
            makePerson(1)
        }
        createStudentButton.setOnClickListener {
            makePerson(2)
        }





    }
    fun makePerson(type:Int){
        val name = input1.text.toString()
        val age = input2.text.toString()
        val address = input3.text.toString()

        when(type){
            1->{
                person = Person(name, age, address)
                imageView.setImageResource(R.drawable.youtube)
            }
            2->{
                person = Person(name, age, address)
                imageView.setImageResource(R.drawable.ic_launcher_foreground)
            }
        }
        output1.setText("사람을 만들었습니다. : ${type}, ${person?.name}")
    }
}

class Person(val name:String, val age:String, val address:String){

}
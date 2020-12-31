
package com.example.Study_Android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val a=10
        val b=a+10
        val c=b+10
        change_activity.setOnClickListener {
//            //this 나 this@Intent1이나 같음
//            //하지만 어쩔때는 this가 크러쉬 오류가 남, 때문에 this@Intent1으로 습관을 들이는게 좋다
//            val intent = Intent(this@Intent1, Intent2::class.java)
//
//            //key, value 방식(Dictionary) -> key와 value를 쌍으로 만들어 저장한다
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2",2)
//            startActivity(intent)

//            val intent2 = Intent(this@Intent1,Intent2::class.java)
//            //apply -> 앞에있는것을 적용
//            intent2.apply {
//                this.putExtra("number1",1)
//                this.putExtra("number2",1)
//            }
//            startActivityForResult(intent2,200)



            //암시적 인텐트
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==20)
        Log.d("number",""+requestCode)
        Log.d("number",""+resultCode)
        super.onActivityResult(requestCode, resultCode, data)
    }
}
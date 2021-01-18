package com.example.Study_Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        //방법1
        val runnable: Runnable = object :Runnable{
            override fun run() {
                Log.d("thread-1","Thread1 is made")
            }
        }
        val thread :Thread = Thread(runnable)
        //방법2(람다x)
        Thread(object : Runnable{
            override fun run() {
                Log.d("thread-1","Thread2 is made")

            }

        }).start()
        //방법3(람다)
        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-1","Thread3 is made")
            //ui쓰레드 위에서 런한다(메인쓰레드에서 돌아감)
            runOnUiThread{
                btn_1.setBackgroundColor(getColor(R.color.black))
            }

        }).start()



        btn_1.setOnClickListener {
            thread.start()

        }

    }
}
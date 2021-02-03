package com.example.Study_Android.The_kotlin_book

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class mycustomlayout : LinearLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
}
package com.example.text_style

import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

fun textViewStyle(tv: TextView, color:String){

    tv.text="Hi library"
    tv.setTextColor(Color.parseColor(color))
    tv.gravity = Gravity.CENTER




}
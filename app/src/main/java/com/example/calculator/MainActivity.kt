package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zero_button.setOnClickListener { setTextFields("0")}
    }
    fun setTextFields(str: String){
        math_operation.append(str)
    }
}
package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zero_button.setOnClickListener { setTextFields("0") }
        one_button.setOnClickListener { setTextFields("1") }
        two_button.setOnClickListener { setTextFields("2") }
        three_button.setOnClickListener { setTextFields("3") }
        four_button.setOnClickListener { setTextFields("4") }
        five_button.setOnClickListener { setTextFields("5") }
        six_button.setOnClickListener { setTextFields("6") }
        seven_button.setOnClickListener { setTextFields("7") }
        eight_button.setOnClickListener { setTextFields("8") }
        nine_button.setOnClickListener { setTextFields("9") }
        open_bracket_button.setOnClickListener { setTextFields("(") }
        close_bracket_button.setOnClickListener { setTextFields(")") }
        divide_button.setOnClickListener { setTextFields("/") }
        multiply_button.setOnClickListener { setTextFields("*") }
        plus_button.setOnClickListener { setTextFields("+") }
        minus_button.setOnClickListener { setTextFields("-") }
    }
    fun setTextFields(str: String){
        math_operation.append(str)
    }
}
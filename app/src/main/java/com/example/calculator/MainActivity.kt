package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //добавляем события для кнопок
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
        //очищаем поля
        ac_button.setOnClickListener {
            math_operation.text = ""
            result_text.text = ""
        }
        //удаляем последний символ
        back_button.setOnClickListener {
            val str = math_operation.text.toString() /* добавили переменную str и поместили в неё
            значение поля math_operation по свойству text и явно приведя его к типу строка */
            if(str.isNotEmpty()) // isNotEmpty - функция проверки что строка не пустая, возврощает true
                math_operation.text = str.substring(0, str.length - 1) /* Обрезаем строку начиня с
                нулевого элемента и заканчивая предпоследним */
            result_text.text = ""
        }
    }
    fun setTextFields(str: String){
        math_operation.append(str)
    }
}
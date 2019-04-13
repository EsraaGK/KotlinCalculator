package com.example.esraagamalkhodier.calculator


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var first:Double = 0.0
    var second :Double = 0.0
    var operator = '+'
    var result: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var numberOneEditText: EditText = findViewById(R.id.text_one)

        var numberTwoEditText: EditText = findViewById(R.id.text_two)

        var resultTextView: TextView = findViewById(R.id.text_result)

        var buttonAdd: Button = findViewById(R.id.button_add)
        buttonAdd.setOnClickListener {
            operator = '+'
        }

        var buttonSub: Button = findViewById(R.id.button_sub)
        buttonSub.setOnClickListener {
            operator = '-'
        }
        var buttonDiv: Button = findViewById(R.id.button_div)
        buttonDiv.setOnClickListener {
            operator = '/'
        }
        var buttonMul: Button = findViewById(R.id.button_mul)
        buttonMul.setOnClickListener {
            operator = '*'
        }
        var buttonClear: Button = findViewById(R.id.button_cl)
        buttonClear.setOnClickListener {
            numberOneEditText.setText("")
            numberTwoEditText.setText("")
            resultTextView.text = ""

        }
        var buttonResult: Button = findViewById(R.id.button_result)

        buttonResult.setOnClickListener {
            first = numberOneEditText.text.toString().toDouble()
            second = numberTwoEditText.text.toString().toDouble()


            if (operator=='+'){
                result = first+second
            }else if (operator=='-'){
                result = first-second
            }else if (operator=='*'){
                result = first*second
            }else if (operator=='/'){
                result = first/second
            }else{
                resultTextView.text = "Error! operator is not correct"
            }

            resultTextView.text = "$result"
        }
    }
}

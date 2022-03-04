package com.example.mimas_bitcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class CalculatorActivity : AppCompatActivity() {
    private val cal = Calculator_Code()

    private lateinit var input1: Spinner
    private lateinit var input2: Spinner
    private lateinit var operationDesired: Spinner
    private lateinit var calculateAnswer: TextView
    internal lateinit var inputText1: EditText
    internal lateinit var inputText2: EditText

    private var input1BaseChoice = 0
    private var input2BaseChoice = 0
    private var operationDesiredChoice = 0
    var finalSolution = "  "
    var insertText1 = "0"
    var insertText2 = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        input1 = findViewById<View>(R.id.spinner1_cal) as Spinner
        input2 = findViewById<View>(R.id.spinner2_cal) as Spinner
        operationDesired = findViewById<View>(R.id.spinner_operation) as Spinner
        calculateAnswer = findViewById<View>(R.id.solution) as TextView
        inputText1 = findViewById<View>(R.id.editText1_cal) as EditText
        inputText2 = findViewById<View>(R.id.editText2_cal) as EditText

        val baseOptions = arrayOf("Hexadecimal", "Binary", "Decimal")
        input1.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, baseOptions)
        input2.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, baseOptions)

        val operationOptions = arrayOf("+", "-", "*", "/")
        operationDesired.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, operationOptions)

        input1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onNothingSelected(parent: AdapterView<*>?) {
                calculateAnswer.text = "Input or Conversion Desired Needed"
            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                insertText1 = inputText1.text.toString()
                input1BaseChoice = position
                //calculateNow()
                //calculateAnswer.text = finalSolution
            }
        }

        input2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onNothingSelected(parent: AdapterView<*>?) {
                calculateAnswer.text = "Input or Conversion Desired Needed"
            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                insertText2 = inputText2.text.toString()
                input2BaseChoice = position
                //calculateNow()
                //calculateAnswer.text = finalSolution
            }
        }

        operationDesired.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onNothingSelected(parent: AdapterView<*>?) {
                calculateAnswer.text = "Input or Conversion Desired Needed"
            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                operationDesiredChoice = position
                //calculateNow()
                //calculateAnswer.text = finalSolution
            }
        }

        @SuppressLint("SetTextI18n")
        calculateAnswer.text = "final_solution"
    }

    fun submit(view: View){
        calculateNow()
        println(insertText1)
        println(insertText2)
        println(input1BaseChoice)
        println(input2BaseChoice)
        calculateAnswer.text = finalSolution
    }

    private fun calculateNow(){
        //variables for desired parameters
        //input text 1 (string): insertText1
        //input text 2 (string): insertText2
        //base of first input (int): input1BaseChoice
        //base of second input (int): input2BaseChoice

        //addition
        if(operationDesiredChoice == 0){
            finalSolution = cal.addition(insertText1, insertText1, input1BaseChoice, input2BaseChoice)
        }
        //subtraction
        else if(operationDesiredChoice == 1){
            //finalSolution = cal.subtraction(insertText1, insertText2, input1BaseChoice, input2BaseChoice)
        }
        //multiplication
        else if(operationDesiredChoice == 2){
            //finalSolution = cal.multiplication(insertText1, insertText2, input1BaseChoice, input2BaseChoice)
        }
        //division
        else if(operationDesiredChoice == 3){
            //finalSolution = cal.division(insertText1, insertText2, input1BaseChoice, input2BaseChoice)
        }
        else{
            finalSolution = "system error"
        }
    }
}
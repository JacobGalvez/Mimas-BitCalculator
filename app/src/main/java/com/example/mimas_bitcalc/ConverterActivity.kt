package com.example.mimas_bitcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ConverterActivity : AppCompatActivity() {
    private lateinit var input: Spinner
    private lateinit var conversionDesired: Spinner
    private lateinit var answer: TextView
    internal lateinit var inputText: EditText

    private var inputBaseChoice = 0
    private var convertBaseDesiredChoice = 0
    private var finalSolution = "  "
    var insertText = "0"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        input = findViewById<View>(R.id.spinner1) as Spinner
        conversionDesired = findViewById<View>(R.id.spinner2) as Spinner
        answer = findViewById<View>(R.id.solution) as TextView
        inputText = findViewById<View>(R.id.editText2) as EditText

        val options = arrayOf("Hexadecimal", "Binary", "Decimal")
        input.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        conversionDesired.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)


        input.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onNothingSelected(parent: AdapterView<*>?) {
                answer.text = "Input or Conversion Desired Needed"
            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                insertText = inputText.text.toString()
                inputBaseChoice = position
                convertNow()
                answer.text = finalSolution
            }
        }

        conversionDesired.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onNothingSelected(parent: AdapterView<*>?) {
                answer.text = "Input or Conversion Desired Needed"
            }

            //@SuppressLint("SetTextI18n")
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                insertText = inputText.text.toString()
                convertBaseDesiredChoice = position
                convertNow()
                answer.text = finalSolution
            }
        }

        @SuppressLint("SetTextI18n")
        answer.text = "final_solution"
    }

    fun convertNow() {
        //variables for desired parameters
        //input text (string): insertText

        //hex to hex case
        if(inputBaseChoice == 0 && convertBaseDesiredChoice == 0){
            finalSolution = "the input"
        }
        //hex to binary case
        else if(inputBaseChoice == 0 && convertBaseDesiredChoice == 1){
            //finalSolution = function to do this
        }
        //hex to decimal case
        else if(inputBaseChoice == 0 && convertBaseDesiredChoice == 2){
            //finalSolution = function to do this
        }
        //binary to hex case
        else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 0){
            //finalSolution = function to do this
        }
        //binary to binary case
        else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 1){
            finalSolution = "the input"
        }
        //binary to decimal case
        else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 2){
            //finalSolution = function to do this
        }
        //decimal to hex case
        else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 0){
            //finalSolution = function to do this
        }
        //decimal to binary case
        else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 1){
            //finalSolution = function to do this
        }
        //decimal to decimal case
        else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 2){
            finalSolution = "the input"
        }
        else{
            finalSolution = "system error"
        }

    }
}
package com.example.mimas_bitcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.mimas_bitcalc.MainActivity.Companion.SG

class ConverterActivity : AppCompatActivity() {
    internal val con = Conversion_Code()
    internal val hist = HistoryActivity()

    private lateinit var input: Spinner
    private lateinit var conversionDesired: Spinner
    private lateinit var answer: TextView
    internal lateinit var inputText: EditText

    private var inputBaseChoice = 0
    private var convertBaseDesiredChoice = 0
    private var finalSolution = "  "
    var insertText = "0"
    var conHisVal = " "


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        input = findViewById<View>(R.id.spinner1) as Spinner
        conversionDesired = findViewById<View>(R.id.spinner2) as Spinner
        answer = findViewById<View>(R.id.solution) as TextView
        inputText = findViewById<View>(R.id.editText2) as EditText

        val options = arrayOf("HEX", "BIN", "DEC", "OCT")
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
                if (insertText == "")
                    finalSolution = "0"
                else {
                    //answer.text = finalSolution
                }
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
                if (insertText == "")
                    finalSolution = "0"
                else {
                    //answer.text = finalSolution
                }
            }
        }

        @SuppressLint("SetTextI18n")
        answer.text = "......."
    }

    fun submit(view: View) {
        //variables for desired parameters
        //input text (string): insertText
        insertText = inputText.text.toString()

        if (insertText == "") {
            answer.text = "0"
        }
        else{
            //hex to hex case
            if(inputBaseChoice == 0 && convertBaseDesiredChoice == 0){
                answer.text = insertText
                conHisVal = hist.conversionHistory(insertText, " (hex) converted to hex: ", insertText)
            }
            //hex to binary case
            else if(inputBaseChoice == 0 && convertBaseDesiredChoice == 1){
                answer.text = con.hexadecimalToBinary(insertText)
                conHisVal = hist.conversionHistory(insertText, " (hex) converted to binary: ", con.hexadecimalToBinary(insertText))
            }
            //hex to decimal case
            else if(inputBaseChoice == 0 && convertBaseDesiredChoice == 2){
                answer.text = con.hexadecimalToDecimal(insertText)
                conHisVal = hist.conversionHistory(insertText, "(hex) converted to decimal: ", con.hexadecimalToDecimal(insertText))
            }
            //hex to octal case
            else if(inputBaseChoice == 0 && convertBaseDesiredChoice == 3){
                answer.text = con.hexToOct(insertText)
                conHisVal = hist.conversionHistory(insertText, "(hex) converted to octal: ", con.hexToOct(insertText))
            }
            //binary to hex case
            else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 0){
                answer.text = con.binToHex(insertText)
                conHisVal = hist.conversionHistory(insertText, "(binary) converted to hex: ", con.binToHex(insertText))
            }
            //binary to binary case
            else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 1){
                answer.text = insertText
                conHisVal = hist.conversionHistory(insertText, "(binary) converted to binary: ", insertText)
            }
            //binary to decimal case
            else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 2){
                answer.text = con.binToDec(insertText)
                conHisVal = hist.conversionHistory(insertText, "(binary) converted to decimal: ", con.binToDec(insertText))
            }
            //binary to octal case
            else if(inputBaseChoice == 1 && convertBaseDesiredChoice == 3){
                answer.text = con.binToOct(insertText)
                conHisVal = hist.conversionHistory(insertText, "(binary) converted to octal: ", con.binToOct(insertText))
            }
            //decimal to hex case
            else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 0){
                answer.text = con.decToHex(insertText)
                conHisVal = hist.conversionHistory(insertText, "(decimal) converted to hex: " , con.decToHex(insertText))
            }
            //decimal to binary case
            else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 1){
                answer.text = con.decToBin(insertText)
                conHisVal = hist.conversionHistory(insertText, "(decimal) converted to binary: ", con.decToBin(insertText))
            }
            //decimal to decimal case
            else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 2){
                answer.text = insertText
                conHisVal = hist.conversionHistory(insertText, "(decimal) converted to decimal: ", insertText)
            }
            //decimal to octal case
            else if(inputBaseChoice == 2 && convertBaseDesiredChoice == 3){
                answer.text = con.decToOct(insertText)
                conHisVal = hist.conversionHistory(insertText, "(decimal) converted to Octal: ", con.decToOct(insertText))
            }
            //octal to hex case
            else if(inputBaseChoice == 3 && convertBaseDesiredChoice == 0){
                answer.text = con.octToHex(insertText)
                conHisVal = hist.conversionHistory(insertText, "(octal) converted to hex: " , con.octToHex(insertText))
            }
            //octal to binary case
            else if(inputBaseChoice == 3 && convertBaseDesiredChoice == 1){
                answer.text = con.octToBin(insertText)
                conHisVal = hist.conversionHistory(insertText, "(octal) converted to binary: ", con.octToBin(insertText))
            }
            //octal to decimal case
            else if(inputBaseChoice == 3 && convertBaseDesiredChoice == 2){
                answer.text = con.octToDec(insertText)
                conHisVal = hist.conversionHistory(insertText, "(octal) converted to decimal: ", con.octToDec(insertText))
            }
            //octal to octal case
            else if(inputBaseChoice == 3 && convertBaseDesiredChoice == 3){
                answer.text = insertText
                conHisVal = hist.conversionHistory(insertText, "(octal) converted to octal: ", insertText)
            }
            else {
                answer.text = "system error"
            }
        }
        SG.getConverterString(conHisVal)
    }
}
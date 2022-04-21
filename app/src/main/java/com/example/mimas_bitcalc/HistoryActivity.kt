package com.example.mimas_bitcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HistoryActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
    }


    fun conversionHistory(num1: String, answer: String, baseTypeChange: String): String {
        val origNumber = num1
        val convNumber = answer

        val log = (origNumber + convNumber + baseTypeChange)

        System.out.println(log)

        return log
    }

    fun calculatorHistory(num1: String, base1: Int, base2: Int, num2: String, operation: String, solutionString: String): String {

        var base1ToWords = when(base1) // gets the base of the first number and converts it to english.
        {
            0 -> "(hexadecimal)"
            1 -> "(binary)"
            2 -> "(decimal)"
            else -> "ERROR"
        }
        var base2ToWords = when(base2) // gets the base of the second number and converts it to english.
        {
            0 -> "(hexadecimal)"
            1 -> "(binary)"
            2 -> "(decimal)"
            else -> "ERROR"
        }

        // saves history in readable format to a string named log
        var log = (num1 + base1ToWords + operation + num2 + base2ToWords + " = " + solutionString + "(decimal)")

        println(log)

        return log
    }


}
package com.example.mimas_bitcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.mimas_bitcalc.MainActivity.Companion.SG

class HistoryActivity : AppCompatActivity() {
    lateinit var converterHistory: TextView
    lateinit var calculateHistory: TextView

    lateinit var gotCalInput: String
    lateinit var gotConInput: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        calculateHistory = findViewById<View>(R.id.Cal_History) as TextView
        converterHistory = findViewById<View>(R.id.Con_History) as TextView

        gotCalInput = SG.setNowCalculatorString()
        gotConInput = SG.setNowConverterString()

        converterHistory.text = gotConInput
        calculateHistory.text = gotCalInput
    }


    fun conversionHistory(num1: String, answer: String, baseTypeChange: String): String {
        val origNumber = num1
        val convNumber = answer

        val log = (origNumber + convNumber + baseTypeChange)

        if (baseTypeChange == "Incorrect Input")
            return ""

        System.out.println(log)

        return log
    }

    fun calculatorHistory(num1: String, base1: Int, base2: Int, num2: String, operation: String, solutionString: String): String {

        var base1ToWords = when(base1) // gets the base of the first number and converts it to english.
        {
            0 -> "(hexadecimal)"
            1 -> "(binary)"
            2 -> "(decimal)"
            3 -> "(octal)"
            else -> "ERROR"
        }
        var base2ToWords = when(base2) // gets the base of the second number and converts it to english.
        {
            0 -> "(hexadecimal)"
            1 -> "(binary)"
            2 -> "(decimal)"
            3 -> "(octal)"
            else -> "ERROR"
        }

        // saves history in readable format to a string named log
        var log = (num1 + base1ToWords + operation + num2 + base2ToWords + " = " + solutionString + "(decimal)")

        println(log)

        if (solutionString == "Incorrect Input")
            return ""

        return log
    }

    fun clear_hist(view: View) {
        converterHistory.text = "History Cleared"
        calculateHistory.text = "History Cleared"
        SG.getConverterString("Nothing done here yet")
        SG.getCalculatorString("Nothing done here yet")
    }

}
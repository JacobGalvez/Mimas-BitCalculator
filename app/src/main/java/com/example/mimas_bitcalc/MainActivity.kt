package com.example.mimas_bitcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn_history_chk: Button
    private lateinit var btn_convert_chk: Button
    private lateinit var btn_calculate_chk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_history_chk = findViewById<View>(R.id.btn_history) as Button
        btn_convert_chk = findViewById<View>(R.id.btn_convert) as Button
        btn_calculate_chk = findViewById<View>(R.id.btn_calculator) as Button
    }

    fun clicked_convert(view: View){
        val intent = Intent(this, ConverterActivity::class.java)
        startActivity(intent)
    }

    fun clicked_calculate(view: View){
        val intent = Intent(this, CalculatorActivity::class.java)
        startActivity(intent)
    }

    fun clicked_history(view: View){
        val intent = Intent(this, HistoryActivity::class.java)
        startActivity(intent)
    }
}
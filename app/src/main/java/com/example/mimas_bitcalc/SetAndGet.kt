package com.example.mimas_bitcalc

class SetAndGet {
    private var calculatorString = " "
    private var converterString = " "

    fun getCalculatorString(str: String) {
        this.calculatorString = str
    }

    fun setNowCalculatorString() : String{
        return this.calculatorString
    }

    fun getConverterString(str: String) {
        this.converterString = str
    }

    fun setNowConverterString() : String {
        return this.converterString
    }
}
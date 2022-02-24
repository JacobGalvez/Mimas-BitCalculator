package com.example.mimas_bitcalc

class Conversion_Code {

    fun binToDec(num1: String): String {
        var binary = num1.toLong()
        var decimal = 0
        var i = 0
        var digit: Long

        while (binary.toInt() != 0) {
            digit = binary % 10
            binary /= 10
            decimal += (digit * Math.pow(2.0, i.toDouble())).toInt()
            ++i
        }
        return decimal.toString()
    }
    
}
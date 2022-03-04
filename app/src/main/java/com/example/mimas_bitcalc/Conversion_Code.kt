package com.example.mimas_bitcalc

class Conversion_Code {

    fun hexadecimalToBinary(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 16)

        var userBinary = (Integer.toBinaryString(convertedNumber))

        return userBinary
    }

    fun hexadecimalToDecimal(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 16)

        var userDecimal = convertedNumber.toString()
        
        return userDecimal
    }


}
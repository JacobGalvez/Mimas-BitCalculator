package com.example.mimas_bitcalc

class Conversion_Code {

    fun hexadecimalToBinary(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 16) //Parse's the integer from string and calculates base16->base10

        var userBinary = (Integer.toBinaryString(convertedNumber))

        return userBinary
    }

    fun hexadecimalToDecimal(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 16) // parses the integer from string and calculates base16->base10

        var userDecimal = convertedNumber.toString() // converts int to string
        
        return userDecimal
    }


}
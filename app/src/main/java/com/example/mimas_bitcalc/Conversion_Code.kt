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



    fun binToDec(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 2)

        var userDecimal = convertedNumber.toString()

        return userDecimal
    }

    fun binToHex(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 2)

        var userHex = convertedNumber.toString()

        return userHex
    }
    
    fun decToBin(num1: String): String {

        var decimal = num1.toInt()
        var binary = Integer.toBinaryString(decimal)

        return binary.toString()
    }

    fun decToHex(num1: String): String {

        var convertedNumber = Integer.parseInt(num1, 10)

        var  userHex = convertedNumber.toString()

        return userHex
    }
}
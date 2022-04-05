package com.example.mimas_bitcalc

class Conversion_Code {

    var answer = ""
    var baseTypeChange = ""
    fun hexadecimalToBinary(num1: String): String {

        val convertedNumber = Integer.parseInt(num1, 16) //Parse's the integer from string and calculates base16->base10

        val userBinary = (Integer.toBinaryString(convertedNumber))

        answer = userBinary
        baseTypeChange = " (hexadecimal) Converted to (binary): "

        return userBinary
    }

    fun hexadecimalToDecimal(num1: String): String {

        val convertedNumber = Integer.parseInt(num1, 16) // parses the integer from string and calculates base16->base10

        val userDecimal = convertedNumber.toString() // converts int to string

        answer = userDecimal
        baseTypeChange = " (hexadecimal) Converted to (decimal): "

        
        return userDecimal
    }



    fun binToDec(num1: String): String {

        val convertedNumber = Integer.parseInt(num1, 2)

        val userDecimal = convertedNumber.toString(10)

        answer = userDecimal
        baseTypeChange = " (binary) Converted to (decimal): "

        return userDecimal
    }

    fun binToHex(num1: String): String {

        val convertedNumber = Integer.parseInt(num1, 2)

        val userHex = convertedNumber.toString(16)

        answer = userHex
        baseTypeChange = " (binary) Converted to (hexadecimal): "
        return userHex
    }
    
    fun decToBin(num1: String): String {

        val decimal = num1.toInt()
        val binary = Integer.toBinaryString(decimal)

        answer = binary.toString()
        baseTypeChange = " (decimal) Converted to (binary): "
        return binary.toString()
    }

    fun decToHex(num1: String): String {

        val convertedNumber = Integer.parseInt(num1, 10)

        val  userHex = convertedNumber.toString(16)

        answer = userHex
        baseTypeChange = " (decimal) Converted to (hexadecimal): "
        return userHex
    }

    fun conversionHistory(num1: String): String {
        val origNumber = num1
        val convNumber = answer

        val log = (origNumber + baseTypeChange + convNumber)

        System.out.println(log)

        return log
    }
}
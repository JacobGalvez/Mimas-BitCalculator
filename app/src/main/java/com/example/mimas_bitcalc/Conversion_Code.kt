package com.example.mimas_bitcalc

class Conversion_Code {

    private val valid = Input_Validation()

    var answer = ""
    var baseTypeChange = ""
    fun hexadecimalToBinary(num1: String): String {

        if(valid.hexValid(num1) != "") { return valid.hexValid(num1) }

        val convertedNumber = Integer.parseInt(num1, 16) //Parse's the integer from string and calculates base16->base10

        val userBinary = (Integer.toBinaryString(convertedNumber))

        answer = userBinary
        baseTypeChange = " (hexadecimal) Converted to (binary): "

        return userBinary
    }

    fun hexadecimalToDecimal(num1: String): String {

        if(valid.hexValidNegative(num1) != "") { return valid.hexValidNegative(num1) }

        val convertedNumber = Integer.parseInt(num1, 16) // parses the integer from string and calculates base16->base10

        val userDecimal = convertedNumber.toString() // converts int to string

        answer = userDecimal
        baseTypeChange = " (hexadecimal) Converted to (decimal): "

        
        return userDecimal
    }



    fun binToDec(num1: String): String {

        if(valid.binValidNegative(num1) != "") { return valid.binValidNegative(num1) }

        val convertedNumber = Integer.parseInt(num1, 2)

        val userDecimal = convertedNumber.toString(10)


        answer = userDecimal
        baseTypeChange = " (binary) Converted to (decimal): "

        return userDecimal
    }

    fun binToHex(num1: String): String {

        if(valid.binValidNegative(num1) != "") { return valid.binValidNegative(num1) }

        val convertedNumber = Integer.parseInt(num1, 2)

        var userHex = convertedNumber.toString(16)

        //-0 is not a valid solution
        if(userHex == "-0"){
            userHex = "0"
        }

        answer = userHex
        baseTypeChange = " (binary) Converted to (hexadecimal): "

        return userHex

    }
    
    fun decToBin(num1: String): String {

        if(valid.decValid(num1) != "") { return valid.decValid(num1) }

        val decimal = num1.toInt()
        val binary = Integer.toBinaryString(decimal)

        answer = binary.toString()
        baseTypeChange = " (decimal) Converted to (binary): "
        return binary.toString()
    }

    fun decToHex(num1: String): String {

        if(valid.decValidNegative(num1) != "") { return valid.decValidNegative(num1) }

        val convertedNumber = Integer.parseInt(num1, 10)

        val  userHex = convertedNumber.toString(16)

        answer = userHex
        baseTypeChange = " (decimal) Converted to (hexadecimal): "
        return userHex
    }

    fun octToBin(num1: String): String {

        if(valid.octValid(num1) != "") { return valid.octValid(num1) }

        val octal = Integer.parseInt(num1, 8)

        val binary = Integer.toBinaryString(octal)

        answer = binary
        baseTypeChange = " (octal) Converted to (binary): "
        return binary
    }

    fun octToDec(num1: String): String {

        if(valid.octValid(num1) != "") { return valid.octValid(num1) }

        val decimal = Integer.parseInt(num1, 8)

        answer = decimal.toString()
        baseTypeChange = " (octal) Converted to (decimal): "
        return decimal.toString()
    } 

    fun octToHex(num1: String): String {

        if(valid.octValid(num1) != "") { return valid.octValid(num1) }

        val octal = Integer.parseInt(num1, 8)

        val hex = Integer.toHexString(octal)

        answer = hex
        baseTypeChange = " (octal) Converted to (hexadecimal): "
        return hex
    }

    fun binToOct(num1: String): String {

        if(valid.binValid(num1) != "") { return valid.binValid(num1) }

        val binary = Integer.parseInt(num1, 2)

        val octal = Integer.toOctalString(binary)

        answer = octal
        baseTypeChange = " (binary) Converted to (octal): "
        return octal
    }

    fun decToOct(num1: String): String {

        if(valid.decValid(num1) != "") { return valid.decValid(num1) }

        val decimal = num1.toInt()

        val octal = Integer.toOctalString(decimal)

        answer = octal
        baseTypeChange = " (decimal) Converted to (octal): "
        return octal
    }

    fun hexToOct(num1: String): String {

        if(valid.hexValid(num1) != "") { return valid.hexValid(num1) }

        val hex = Integer.parseInt(num1, 16)

        val octal = Integer.toOctalString(hex)

        answer = octal
        baseTypeChange = " (hexadecimal) Converted to (octal): "
        return octal
    }

}
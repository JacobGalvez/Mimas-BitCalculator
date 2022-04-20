package com.example.mimas_bitcalc

class Conversion_Code {

    var answer = ""
    var baseTypeChange = ""
    fun hexadecimalToBinary(num1: String): String {
        var error = ""

        var i = 0
        //checks if the given string is using correct chars
        //user is able to use capitals or lowercase
        // do not allow '-' will cause incorrect output
        while(i < num1.length){
            var hexChar = num1.get(i)
            if((hexChar < '0' || hexChar > '9') && (hexChar < 'a' || hexChar > 'f') && (hexChar < 'A' || hexChar > 'F')){
                error = "Incorrect Input"
                return error
            }
            i++
        }

        val convertedNumber = Integer.parseInt(num1, 16) //Parse's the integer from string and calculates base16->base10

        val userBinary = (Integer.toBinaryString(convertedNumber))

        answer = userBinary
        baseTypeChange = " (hexadecimal) Converted to (binary): "

        return userBinary
    }

    fun hexadecimalToDecimal(num1: String): String {
        var error = ""

        var i = 0
        //checks if the given string is using correct chars
        //user is able to use capitals or lowercase
        while(i < num1.length){
            var hexChar = num1.get(i)
            if((hexChar < '0' || hexChar > '9') && (hexChar < 'a' || hexChar > 'f') && (hexChar < 'A' || hexChar > 'F') && (hexChar != '-')){
                error = "Incorrect Input"
                return error
            }
            i++
        }


        val convertedNumber = Integer.parseInt(num1, 16) // parses the integer from string and calculates base16->base10

        val userDecimal = convertedNumber.toString() // converts int to string

        answer = userDecimal
        baseTypeChange = " (hexadecimal) Converted to (decimal): "

        
        return userDecimal
    }



    fun binToDec(num1: String): String {
        var error = ""
        //won't crash if number is too long
        if(num1.length > 31){
            error = "Input Max Reached"
            return error
        }
        var i = 0
        while(i < num1.length){
            //make sure string has valid characters only
            if(num1.get(i) != '0' && num1.get(i) != '1' && num1.get(i) != '-'){
                error = "Incorrect Input"
                return error
            }
            i++
        }

        val convertedNumber = Integer.parseInt(num1, 2)

        val userDecimal = convertedNumber.toString(10)


        answer = userDecimal
        baseTypeChange = " (binary) Converted to (decimal): "

        return userDecimal
    }

    fun binToHex(num1: String): String {
        var error = ""
        //input validation
        //won't crash if number is too long
        if(num1.length > 31){
            error = "Input Max Reached"
            return error
        }
        var i = 0
        while(i < num1.length){
            //make sure string has valid characters only
            if(num1.get(i) != '0' && num1.get(i) != '1' && num1.get(i) != '-'){
                error = "Incorrect Input"
                return error
            }
            i++
        }


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

}
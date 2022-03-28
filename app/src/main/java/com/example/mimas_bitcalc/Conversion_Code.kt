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

    fun binToHex(num1: String): String {
        var binary =  num1.toLong()
        var hex = ""
        var Digits: Long
        var fourDigits: Int

        while(binary.toInt() != 0){
            Digits = binary % 10000
            fourDigits = Digits.toInt()
            if(fourDigits == 0){
                hex += "0"
            }
            else if(fourDigits == 1){
                hex += "1"
            }
            else if(fourDigits == 10){
                hex += "2"
            }
            else if(fourDigits == 11){
                hex += "3"
            }
            else if(fourDigits == 100){
                hex += "4"
            }
            else if(fourDigits == 101){
                hex += "5"
            }
            else if(fourDigits == 110){
                hex += "6"
            }
            else if(fourDigits == 111){
                hex += "7"
            }
            else if(fourDigits == 1000){
                hex += "8"
            }
            else if(fourDigits == 1001){
                hex += "9"
            }
            else if(fourDigits == 1010){
                hex += "A"
            }
            else if(fourDigits == 1011){
                hex += "B"
            }
            else if(fourDigits == 1100){
                hex += "C"
            }
            else if(fourDigits == 1101){
                hex += "D"
            }
            else if(fourDigits == 1110){
                hex += "E"
            }
            else if(fourDigits == 1111){
                hex += "F"
            }
            binary /= 10000
        }
        hex = hex.reversed()
        return hex
    }
    
    fun decToBin(num1: String): String {

        var decimal = num1.toInt()
        var binary = Integer.toBinaryString(decimal)

        return binary.toString()
    }

    fun decToHex(num1: String): String {
        var decimal = num1.toInt()
        var hex = ""

        while(decimal > 0){
            var rem = decimal % 16

            if(rem == 0){
                hex += "0"
            }
            else if(rem == 1){
                hex += "1"
            }
            else if(rem == 2){
                hex += "2"
            }
            else if(rem == 3){
                hex += "3"
            }
            else if(rem == 4){
                hex += "4"
            }
            else if(rem == 5){
                hex += "5"
            }
            else if(rem == 6){
                hex += "6"
            }
            else if(rem == 7){
                hex += "7"
            }
            else if(rem == 8){
                hex += "8"
            }
            else if(rem == 9){
                hex += "9"
            }
            else if(rem == 10){
                hex += "A"
            }
            else if(rem == 11){
                hex += "B"
            }
            else if(rem == 12){
                hex += "C"
            }
            else if(rem == 13){
                hex += "D"
            }
            else if(rem == 14){
                hex += "E"
            }
            else if(rem == 15){
                hex += "F"
            }

            decimal /= 16
        }
        hex.reversed()
        return hex
    }
}
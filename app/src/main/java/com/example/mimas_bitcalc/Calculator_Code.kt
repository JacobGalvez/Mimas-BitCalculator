package com.example.mimas_bitcalc

class Calculator_Code {

    private val converter = Conversion_Code()



    fun addition(num1: String, num2: String, base1: Int, base2: Int): String {

        // switch statement for base1 that converts the number to decimal
        // (for easier operations)
        val firstNumber = when(base1) {
            1 -> converter.binToDec(num1)
            2 -> num1
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }

        // switch statement for base1 that converts the number to decimal
        // (for easier operations)
        val secondNumber = when(base2) {
            1 -> converter.binToDec(num2)
            2 -> num2
            0 -> converter.hexadecimalToDecimal(num2)
            else -> "ERROR"
        }

        // uses the addition operation on the two numbers given and returns the number in a
        // decimal base string
        var solution = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)
        var solutionString = solution.toString()

        
        return solutionString
    }


    fun subtraction(num1: String, num2: String, base1: Int, base2: Int): String {

        // switch statement for base1 that converts the number to decimal
        // (for easier operations)
        val firstNumber = when(base1) {
            1 -> converter.binToDec(num1)
            2 -> num1
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }

        // switch statement for base2 that converts the number to decimal
        // (for easier operations)
        val secondNumber = when(base2) {
            1 -> converter.binToDec(num2)
            2 -> num2
            0 -> converter.hexadecimalToDecimal(num2)
            else -> "ERROR"
        }

        // uses the subtraction operation on the two numbers given and returns the number in a
        // decimal base string
        var solution = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber)
        var solutionString = solution.toString()

        return solutionString
    }

fun multiplication(num1: String, num2: String, base1: Int, base2: Int): String {

    // switch statement for base1 that converts the number to decimal
    // (for easier operations)
    val firstNumber = when(base1) {
        1 -> converter.binToDec(num1)
        2 -> num1
        0 -> converter.hexadecimalToDecimal(num1)
        else -> "ERROR"
    }

    // switch statement for base2 that converts the number to decimal
    // (for easier operations)
    val secondNumber = when(base2) {
    
        1 -> converter.binToDec(num2)
        2 -> num2
        0 -> converter.hexadecimalToDecimal(num2)
        else -> "ERROR"
    }

    // uses the multiplication operation on the two numbers given and returns the number in a
    // decimal base string
    var solution = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber)
    var solutionString = solution.toString()

    
    return solutionString
}

fun division(num1: String, num2: String, base1: Int, base2: Int): String {

    // switch statement for base2 that converts the number to decimal
    // (for easier operations)
    val firstNumber = when(base1) {
    
        1 -> converter.binToDec(num1)
        2 -> num1
        0 -> converter.hexadecimalToDecimal(num1)
        else -> "ERROR"
    }

    // switch statement for base2 that converts the number to decimal
    // (for easier operations)
    val secondNumber = when(base2) {
    
        1 -> converter.binToDec(num2)
        2 -> num2
        0 -> converter.hexadecimalToDecimal(num2)
        else -> "ERROR"
    }

    // uses the multiplication operation on the two numbers given and returns the number in a
    // decimal base string
    var solution = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)
    var solutionString = solution.toString()

    
    return solutionString
    }

fun calculatorHistory(num1: String, base1: Int, base2: Int, num2: String, operation: String, solutionString: String): String {

    var base1ToWords = when(base1) // gets the base of the first number and converts it to english.
    {
        0 -> "(hexadecimal)"
        1 -> "(binary)"
        2 -> "(decimal)"
        else -> "ERROR"
    }
    var base2ToWords = when(base2) // gets the base of the second number and converts it to english.
    {
        0 -> "(hexadecimal)"
        1 -> "(binary)"
        2 -> "(decimal)"
        else -> "ERROR"
    }

    // saves history in readable format to a string named log
    var log = (num1 + base1ToWords + operation + num2 + base2ToWords + " = " + solutionString + "(decimal)")

    println(log)

    return log
}
}
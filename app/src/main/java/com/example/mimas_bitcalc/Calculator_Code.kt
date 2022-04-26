package com.example.mimas_bitcalc

class Calculator_Code {

    private val converter = Conversion_Code()

    fun addition(num1: String, num2: String, base1: Int, base2: Int): String {

        // switch statement for base1 that converts the number to decimal
        // (for easier operations)
        val firstNumber = when(base1) {
            1 -> converter.binToDec(num1)
            2 -> num1
            3 -> converter.octToDec(num1)
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }

        // switch statement for base1 that converts the number to decimal
        // (for easier operations)
        val secondNumber = when(base2) {
            1 -> converter.binToDec(num2)
            2 -> num2
            3 -> converter.octToDec(num2)
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
            3 -> converter.octToDec(num1)
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }

        // switch statement for base2 that converts the number to decimal
        // (for easier operations)
        val secondNumber = when(base2) {
            1 -> converter.binToDec(num2)
            2 -> num2
            3 -> converter.octToDec(num2)
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
            3 -> converter.octToDec(num1)
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }

        // switch statement for base2 that converts the number to decimal
        // (for easier operations)
        val secondNumber = when(base2) {

            1 -> converter.binToDec(num2)
            2 -> num2
            3 -> converter.octToDec(num2)
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
            3 -> converter.octToDec(num1)
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }
        // switch statement for base2 that converts the number to decimal
        // (for easier operations)
        val secondNumber = when(base2) {

            1 -> converter.binToDec(num2)
            2 -> num2
            3 -> converter.octToDec(num2)
            0 -> converter.hexadecimalToDecimal(num2)
            else -> "ERROR"
        }
        // If statement included in-case that division does not equal a whole number : Produces a Remainder value
        if (Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber) > 0)
        {
            var remainder = Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber)

            var numerator = Integer.parseInt(firstNumber) - remainder

            var solution = numerator / Integer.parseInt(secondNumber)

            var solutionString = solution.toString() + " R:" + remainder

            return solutionString
        }
        else // if no remainder found do regular division
        {
            // uses the multiplication operation on the two numbers given and returns the number in a
            // decimal base string
            var solution = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)
            var solutionString = solution.toString()


            return solutionString
        }
    }

}
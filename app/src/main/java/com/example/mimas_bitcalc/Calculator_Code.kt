package com.example.mimas_bitcalc

class Calculator_Code {

    private val converter = Conversion_Code()

    fun addition(num1: String, num2: String, base1: Int, base2: Int): String {
  
        val firstNumber = when(base1) { // switch statement for base1
            
            1 -> converter.binToDec(num1)
            2 -> num1
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }
    
        val secondNumber = when(base2) { // switch statement for base2
    
            1 -> converter.binToDec(num2)
            2 -> num2
            0 -> converter.hexadecimalToDecimal(num2)
            else -> "ERROR"
        }

        var solution = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber) // use operations on numbers
        //System.out.print(firstNumber + " + " + secondNumber)
        //System.out.print(" -> Solution(decimal): ")
        var solutionString = solution.toString() // convert back to a string
        
        return solutionString
    }

    fun subtraction(num1: String, num2: String, base1: Int, base2: Int): String {
    
        val firstNumber = when(base1) {
            
            1 -> converter.binToDec(num1)
            2 -> num1
            0 -> converter.hexadecimalToDecimal(num1)
            else -> "ERROR"
        }
            
        val secondNumber = when(base2) {
            
            1 -> converter.binToDec(num2)
            2 -> num2
            0 -> converter.hexadecimalToDecimal(num2)
            else -> "ERROR"
        }

        var solution = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber)
        //System.out.print(firstNumber + " - " + secondNumber)
        //System.out.print(" -> Solution(decimal): ")
        var solutionString = solution.toString()
        
        return solutionString
    }

fun multiplication(num1: String, num2: String, base1: Int, base2: Int): String {
  
    val firstNumber = when(base1) {
    
        1 -> converter.binToDec(num1)
        2 -> num1
        0 -> converter.hexadecimalToDecimal(num1)
        else -> "ERROR"
    }
    
    val secondNumber = when(base2) {
    
        1 -> converter.binToDec(num2)
        2 -> num2
        0 -> converter.hexadecimalToDecimal(num2)
        else -> "ERROR"
    }

    var solution = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber)
    //System.out.print(firstNumber + " * " + secondNumber)
    //System.out.print(" -> Solution(int): ")
    var solutionString = solution.toString()
    
    return solutionString
}

fun division(num1: String, num2: String, base1: Int, base2: Int): String {
  
    val firstNumber = when(base1) {
    
        1 -> converter.binToDec(num1)
        2 -> num1
        0 -> converter.hexadecimalToDecimal(num1)
        else -> "ERROR"
    }
    
    val secondNumber = when(base2) {
    
        1 -> converter.binToDec(num2)
        2 -> num2
        0 -> converter.hexadecimalToDecimal(num2)
        else -> "ERROR"
    }

    var solution = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)
    //System.out.print(firstNumber + " / " + secondNumber)
    //System.out.print(" -> Solution(decimal): ")
    var solutionString = solution.toString()
    
    return solutionString
    }
}
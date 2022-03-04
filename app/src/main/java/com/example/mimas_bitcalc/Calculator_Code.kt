package com.example.mimas_bitcalc

class Calculator_Code {

    fun addition(num1: String, num2: String, base1: Int, base2: Int): String {
  
        val firstNumber = when(base1) {
            
            2 -> binToDec(num1)
            10 -> num1
            16 -> hexToDecimal(num1)
            else -> "ERROR"
        }
    
        val secondNumber = when(base2) {
    
            2 -> binToDec(num2)
            10 -> num2
            16 -> hexToDecimal(num2)
            else -> "ERROR"
        }

        var solution = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)
        System.out.print(firstNumber + " + " + secondNumber)
        System.out.print(" -> Solution(decimal): ")
        var solutionString = solution.toString()
        
        return solutionString
    }

    fun subtraction(num1: String, num2: String, base1: Int, base2: Int): String {
    
        val firstNumber = when(base1) {
            
            2 -> binToDec(num1)
            10 -> num1
            16 -> hexToDecimal(num1)
            else -> "ERROR"
        }
            
        val secondNumber = when(base2) {
            
            2 -> binToDec(num2)
            10 -> num2
            16 -> hexToDecimal(num2)
            else -> "ERROR"
        }

        var solution = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber)
        System.out.print(firstNumber + " - " + secondNumber)
        System.out.print(" -> Solution(decimal): ")
        var solutionString = solution.toString()
        
        return solutionString
    }

fun multiplication(num1: String, num2: String, base1: Int, base2: Int): String {
  
    val firstNumber = when(base1) {
    
        2 -> binToDec(num1)
        10 -> num1
        16 -> hexToDecimal(num1)
        else -> "ERROR"
    }
    
    val secondNumber = when(base2) {
    
        2 -> binToDec(num2)
        10 -> num2
        16 -> hexToDecimal(num2)
        else -> "ERROR"
    }

    var solution = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber)
    System.out.print(firstNumber + " * " + secondNumber)
    System.out.print(" -> Solution(int): ")
    var solutionString = solution.toString()
    
    return solutionString
}

fun division(num1: String, num2: String, base1: Int, base2: Int): String {
  
    val firstNumber = when(base1) {
    
        2 -> binToDec(num1)
        10 -> num1
        16 -> hexToDecimal(num1)
        else -> "ERROR"
    }
    
    val secondNumber = when(base2) {
    
        2 -> binToDec(num2)
        10 -> num2
        16 -> hexToDecimal(num2)
        else -> "ERROR"
    }

    var solution = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)
    System.out.print(firstNumber + " / " + secondNumber)
    System.out.print(" -> Solution(decimal): ")
    var solutionString = solution.toString()
    
    return solutionString
    }
}
package com.example.mimas_bitcalc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CalculatorTesting {
    private val calculator = Calculator_Code()

    @Test
    @DisplayName("Decimal Subtraction")
    fun subtractionOperationsDecimalEquals() {
        var ans = calculator.subtraction("1000", "500", 2, 2)
        Assertions.assertEquals(ans, "500")
    }

    @Test
    @DisplayName("Hexadecimal Subtraction")
    fun subtractionOperationsHexEquals() {
        var ans = calculator.subtraction("64", "32", 0, 0)
        Assertions.assertEquals(ans, "50")
    }

    @Test
    @DisplayName("Binary Subtraction")
    fun subtractionOperationsBinaryEquals() {
        var ans = calculator.subtraction("11100", "1110", 1, 1)
        Assertions.assertEquals(ans, "14")
    }

    @Test
    @DisplayName("Binary Addition")
    fun additionOperationsBinaryEquals() {
        var ans = calculator.addition("11100", "1110", 1, 1)
        Assertions.assertEquals(ans, "42")
    }

    @Test
    @DisplayName("Decimal Addition")
    fun additionOperationsDecimalEquals() {
        var ans = calculator.addition("495", "505", 2, 2)
        Assertions.assertEquals(ans, "1000")
    }

    @Test
    @DisplayName("Hexadecimal Addition")
    fun additionOperationsHexEquals() {
        var ans = calculator.addition("64", "32", 0, 0)
        Assertions.assertEquals(ans, "150")
    }

    //
    @Test
    @DisplayName("Binary Multiply Binary")
    fun multBinBin() {
        var ans = calculator.multiplication("1001", "10", 1, 1)
        Assertions.assertTrue(ans == "18")
    }

    @Test
    @DisplayName("Hexadecimal Multiply Decimal")
    fun multHexDec() {
        var ans = calculator.multiplication("a", "7", 0, 2)
        Assertions.assertTrue(ans == "70")
    }

    @Test
    @DisplayName("Hexadecimal Multiply Binary")
    fun multHexBin() {
        var ans = calculator.multiplication("b", "10", 0, 1)
        Assertions.assertTrue(ans == "22")
    }
}
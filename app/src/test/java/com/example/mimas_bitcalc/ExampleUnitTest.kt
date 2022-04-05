package com.example.mimas_bitcalc

//import org.junit.Test
//import org.junit.Assert.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class JUnitTesting {

    internal val converter = Conversion_Code()
    internal val calculator = Calculator_Code()

    //dec to binary tests
    @Test
    @DisplayName("Decimal to Binary to Decimal")
    fun decToBinToDec() {
        var ans = converter.decToBin("10")
        ans = converter.binToDec(ans)
        assertEquals(ans, "10")
    }
    @Test
    @DisplayName("Decimal to Binary: Equals")
    fun decToBinEquals() {
        var ans = converter.decToBin("15")
        assertEquals(ans, "1111")
    }
    @Test
    @DisplayName("Decimal to Binary: True")
    fun decToBinTrue() {
        var ans = converter.decToBin("10")
        assertTrue(ans == "1010")
    }
    @Test
    @DisplayName("Decimal to Binary: False")
    fun decToBinFalse() {
        var ans = converter.decToBin("10")
        assertFalse(ans == "10")
    }

    //dec to hex tests
    @Test
    @DisplayName("Decimal to Hex to Decimal")
    fun decToHexToDec() {
        var ans = converter.decToHex("10")
        ans = converter.hexadecimalToDecimal(ans)
        assertEquals(ans, "10")
    }

    @Test
    @DisplayName("Decimal to Hex: True")
    fun decToHexTrue() {
        var ans = converter.decToHex("123")
        assertTrue(ans == "7b")
    }

    @Test
    @DisplayName("Decimal to Hex: Equals")
    fun decToHexEquals() {
        var ans = converter.decToHex("321")
        assertEquals(ans, "141")
    }

    @Test
    @DisplayName("Decimal to Hex: False")
    fun decToHexFalse() {
        var ans = converter.decToHex("22")
        assertFalse(ans == "141")
    }
    
    @Test
    @DisplayName("Subtraction Operations(Decimal): Equals")
    fun subtractionOperationsDecimalEquals() {
        var ans = calculator.subtraction("1000", "500", 2, 2)
        assertEquals(ans, "500")
    }

    @Test
    @DisplayName("Subtraction Operations(Hex) : Equals")
    fun subtractionOperationsHexEquals() {
        var ans = calculator.subtraction("64", "32", 0, 0)
        assertEquals(ans, "50")
    }

    @Test
    @DisplayName("Subtraction Operations(Binary): Equals")
    fun subtractionOperationsBinaryEquals() {
        var ans = calculator.subtraction ("11100", "1110", 1, 1)
        assertEquals(ans, "14")
    }

    @Test
    @DisplayName("Addition Operations(Binary): Equals")
    fun additionOperationsBinaryEquals() {
        var ans = calculator.addition("11100", "1110", 1, 1)
        assertEquals(ans, "42")
    }

    @Test
    @DisplayName("Addition Operations(Decimal): Equals")
    fun additionOperationsDecimalEquals() {
        var ans = calculator.addition("495", "505", 2, 2)
        assertEquals(ans, "1000")
    }

    @Test
    @DisplayName("Addition Operations (Hex): Equals")
    fun additionOperationsHexEquals() {
        var ans = calculator.addition("64", "32" , 0, 0)
        assertEquals(ans, "150")
    }
}
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
    
    //hex to bin tests
    @Test
    @DisplayName("Hex to Binary to Hex")
    fun hexToBinToHex() {
        var ans = converter.hexadecimalToBinary("F")
        ans = converter.binToHex(ans)
        assertEquals(ans, "f")
    }
    @Test
    @DisplayName("Hex to Binary: True")
    fun hexToBinTrue() {
        var ans = converter.hexadecimalToBinary("FF")
        assertTrue(ans == "11111111")
    }
    @Test
    @DisplayName("Hex to Binary: Equals")
    fun hexToBinEquals() {
        var ans = converter.hexadecimalToBinary("9")
        assertEquals(ans, "1001")
    }
    @Test
    @DisplayName("Hex to Binary: False")
    fun hexToBinFalse() {
        var ans = converter.hexadecimalToBinary("B")
        assertFalse(ans == "1010")
    }

    //hex to dec tests
    @Test
    @DisplayName("Hex to Decimal to Hex")
    fun hexToDecToHex() {
        var ans = converter.decToHex("10")
        ans = converter.hexadecimalToDecimal(ans)
        assertEquals(ans, "10")
    }
    @Test
    @DisplayName("Hex to Decimal: True")
    fun hexToDecTrue() {
        var ans = converter.decToHex("123")
        assertTrue(ans == "7b")
    }
    @Test
    @DisplayName("Hex to Decimal: Equals")
    fun hexToDecEquals() {
        var ans = converter.decToHex("321")
        assertEquals(ans, "141")
    }
    @Test
    @DisplayName("Hex to Decimal: False")
    fun hexToDecFalse() {
        var ans = converter.decToHex("22")
        assertFalse(ans == "141")
    }
    
}
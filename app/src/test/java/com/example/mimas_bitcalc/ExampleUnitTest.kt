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
        var ans = converter.hexadecimalToBinary("f")
        ans = converter.binToHex(ans)
        assertEquals(ans, "f")
    }
    @Test
    @DisplayName("Hex to Binary: True")
    fun hexToBinTrue() {
        var ans = converter.hexadecimalToBinary("ff")
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

    //bin to hex tests
    @Test
    @DisplayName("Binary to Hex to Binary")
    fun binToHexToBin() {
        var ans = converter.binToHex("1110")
        ans = converter.hexadecimalToBinary(ans)
        assertEquals(ans, "1110")
    }
    @Test
    @DisplayName("Binary to Hex: True")
    fun binToHexTrue() {
        var ans = converter.binToHex("1010")
        assertTrue(ans == "a")
    }
    @Test
    @DisplayName("Binary to Hex: Equals")
    fun binToHexEquals() {
        var ans = converter.binToHex("1111")
        assertEquals(ans, "f")
    }
    @Test
    @DisplayName("Binary to Hex: False")
    fun binToHexFalse() {
        var ans = converter.binToHex("0001")
        assertFalse(ans == "b")
    }

    //bin to dec tests
    @Test
    @DisplayName("Binary to Decimal to Binary")
    fun binToDecToBin() {
        var ans = converter.binToDec("1010")
        ans = converter.decToBin(ans)
        assertEquals(ans, "1010")
    }
    @Test
    @DisplayName("Binary to Decimal: True")
    fun binToDecTrue() {
        var ans = converter.binToDec("1111")
        assertTrue(ans == "15")
    }
    @Test
    @DisplayName("Binary to Decimal: Equals")
    fun binToDecEquals() {
        var ans = converter.binToDec("0001")
        assertEquals(ans, "1")
    }
    @Test
    @DisplayName("Binary to Decimal: False")
    fun binToDecFalse() {
        var ans = converter.binToDec("1110")
        assertFalse(ans == "8")
    }

    //multiple conversions
    @Test
    @DisplayName("Multiple Decimal")
    fun multDec() {
        var ans = converter.decToBin("15")
        ans = converter.binToHex(ans)
        ans = converter.hexadecimalToDecimal(ans)
        assertTrue(ans == "15")
    }
    @Test
    @DisplayName("Multiple Binary")
    fun multBin() {
        var ans = converter.binToDec("1010")
        ans = converter.decToHex(ans)
        ans = converter.hexadecimalToBinary(ans)
        assertTrue(ans == "1010")
    }
    @Test
    @DisplayName("Multiple Hex")
    fun multHex() {
        var ans = converter.hexadecimalToBinary("f")
        ans = converter.binToDec(ans)
        ans = converter.decToHex(ans)
        assertTrue(ans == "f")
    }

    
}
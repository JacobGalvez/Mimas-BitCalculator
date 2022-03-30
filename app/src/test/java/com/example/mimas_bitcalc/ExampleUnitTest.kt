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
    
}
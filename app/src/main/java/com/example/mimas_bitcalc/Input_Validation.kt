package com.example.mimas_bitcalc

class Input_Validation {

    //this class checks each character of the user inputted string
    //will return error if not valid input for given base conversion
    //conversions will only allow '-' input if the output is correct

    fun hexValid(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            var hexChar = num1.get(i)
            if ((hexChar < '0' || hexChar > '9') && (hexChar < 'a' || hexChar > 'f') && (hexChar < 'A' || hexChar > 'F')) {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }

    fun hexValidNegative(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            var hexChar = num1.get(i)
            if ((hexChar < '0' || hexChar > '9') && (hexChar < 'a' || hexChar > 'f') && (hexChar < 'A' || hexChar > 'F') && (hexChar != '-')) {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }

    fun binValid(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            if (num1.get(i) != '0' && num1.get(i) != '1') {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }

    fun binValidNegative(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            if (num1.get(i) != '0' && num1.get(i) != '1' && num1.get(i) != '-') {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }
    fun decValid(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            if (num1.get(i) < '0' || num1.get(i) > '9') {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }

    fun decValidNegative(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            if ((num1.get(i) < '0' || num1.get(i) > '9') && (num1.get(i) != '-')) {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }

    fun octValid(num1: String): String {
        var error = ""
        var i = 0
        while (i < num1.length) {
            if (num1.get(i) < '0' || num1.get(i) > '7') {
                error = "Incorrect Input"
                return error
            }
            i++
        }
        return error
    }
}
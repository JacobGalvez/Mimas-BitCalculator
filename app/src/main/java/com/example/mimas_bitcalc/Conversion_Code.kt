package com.example.mimas_bitcalc

class Conversion_Code {

    public void hexadecimalToBinary(String userHexadecimalInput) {
        //String userHexadecimalInput = "0A"; //  later add user input, will be an argument in the function

        int hexadecimalToDecimal = Integer.parseInt(userHexadecimalInput, 16);

        String userInputConversion = (Integer.toBinaryString(hexadecimalToDecimal));

        System.out.println("Conversion (Should be 10) : " + userInputConversion);
    }

    public void hexadecimalToDecimal(String userHexNumber) {
        //String userHexNumber = "0A";

        int userNumberConversion = Integer.parseInt(userHexNumber, 16);

        System.out.println("Hex: " + userHexNumber + " Converted to Decimal: " + userNumberConversion);
    }


}
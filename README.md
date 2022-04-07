# Mimas BitCalc #

### Description ###

* Developers: Nicolas Canals, Matthew Whieldon, Jacob Galvez
* What are you creating? An android app for bit conversions and calculations.
* Who is this program for: Students, Teachers, Engineers, Computer Scientists, and Information Technology Specialists.
* Why are we doing this? To give people a simple android application to be able to perform bit calculations and conversions efficiently. 

### General Info ###
![mimasbitcalc](https://user-images.githubusercontent.com/49767496/153975436-5de74b9f-610f-493c-b024-dc89ba818e1e.jpeg)

### Technologies ###

* IDE: Android Studio
* Programming Language: Kotlin
* Bitbucket
* Git
* Jira

### Features ###

* Binary conversion: converts binary to hex and decimal. (User Story: Colin Patterson)
* Hex conversion: converts hex to binary and decimal. (User Story: Colin Patterson)
* Decimal conversion: converts decimal to hex and binary. (User Story: Colin Patterson)
* Addition: perform addition for all 3 bit versions. (User Story: Seth Carranza)
* Subtraction: perform subtraction for all 3 bit versions. (User Story: Seth Carranza)
* Division: perform division for all 3 bit versions. (User Story: Seth Carranza)
* Multiplication: perform multiplication for all 3 bit versions. (User Story: Seth Carranza)

## Sprint 1 ##
### Jacob Galvez
* Created Hexadecimal -> Binary function, and created Hexadecimal -> Decimal function.
* Also created mathematical operation functions (+, -, *, /) so that a user can operate on different number bases.
* BIT-13, BIT-14 (conversion functions) - https://bitbucket.org/cs3398-s22-mimas/bitcalc/commits/4aff2b832ee51487a7d1075a9864d2616a273cc0
* BIT-27, BIT-28, BIT-29 (math operation functions) - https://bitbucket.org/cs3398-s22-mimas/bitcalc/commits/fc85dcde744f3a18a1997c7eea1178c4cac3901d
* Next Steps: Adding in more base conversions, implementing a good design pattern, and working on history backend data.
### Matthew Whieldon
* Created conversion functions for Binary to Decimal, Binary to Hexadecimal, Decimal to Binary, and Decimal to Hexadecimal.
* URL: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/Conversion_Code.kt
* Next Steps: Create functions to allow conversion to and from Octal.
### Nicolas Canals
* Created the Main Page for the Application (BIT-10)
* URL for the kotlin code for the main page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/MainActivity.kt
* URL for the XML layout code for the main page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/res/layout/activity_main.xml
* Created the Converter Page for the Application (BIT-11)
* URL for the kotlin code for the converter page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/ConverterActivity.kt
* URL for the XML layout code for the converter page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/res/layout/activity_converter.xml
* Created the Calculator Page for the Application (BIT-12)
* URL for the kotlin code for the calculator page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/CalculatorActivity.kt
* URL for the XML layout code for the calculator page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/res/layout/activity_calculator.xml
* Next Steps: Fix Layout for all 3 pages (main, converter, calculator) to have more user friendly layouts, Create History Page, Clean out "debt" from all code made, add in 1 test 

## Sprint 2 ##
### Jacob Galvez

### Matthew Whieldon

### Nicolas Canals
* Updated UI for the Main Page of the Application (BIT-34)
* URL for the kotlin code for the main page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/MainActivity.kt
* URL for the XML layout code for the main page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/res/layout/activity_main.xml
* Updated UI for the Converter Page of the Application and fixed bugs with inputs for conversions(BIT-37)
* URL for the kotlin code for the converter page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/ConverterActivity.kt
* URL for the XML layout code for the converter page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/res/layout/activity_converter.xml
* Updated UI for the Calculator Page of the Application and fixed bugs with inputs for calculations(BIT-35)
* URL for the kotlin code for the calculator page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/java/com/example/mimas_bitcalc/CalculatorActivity.kt
* URL for the XML layout code for the calculator page: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/main/res/layout/activity_calculator.xml
* Added Tests for the multiplication function of our calculator handling hexadecimal, decimal, binary (BIT-38)
* URL for the test code for the multiplication calculations: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/app/src/test/java/com/example/mimas_bitcalc/ExampleUnitTest.kt
* Research done to implement design patterns / SOLID Principles (BIT-43)
* URL for the research file: https://bitbucket.org/cs3398-s22-mimas/bitcalc/src/master/Research
* Next Steps: Create History Page, Finalize Layout for all 4 pages (main, converter, calculator, History), Fix bugs handling input validation, Organize test code and make tests for all possible calculation and conversion possibilities, Clean out "debt" in all code
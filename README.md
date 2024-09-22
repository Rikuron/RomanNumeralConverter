# RomanNumeralConverter
A simple Roman Numeral Converter made with Java and IntelliJ.

Imports the following classes:
    • java.util.ArrayList
    • java.util.Map
    • java.util.Scanner

Prompts the user to input a String of Roman Numerals ('I', 'V', 'X', 'L', 'C', 'D', 'M') and converts it into its corresponding integer value.

The String is split off into characters and each character is inserted into an ArrayList.

Creates a Hashmap inserting the Roman Numerals as Keys with their corresponding integer value as its connected Value.

Declares a variable integer Result and Previous Value as 0.

Passes the ArrayList to a for-loop, checking first the last character.
    - Within the ArrayList a variable Value is declared and initialized as the value connected to the character being checked by the for-loop.
    - If Value is less than Previous Value (default is 0), then Result is substracted by the Value. If Value is greater than or equal to the Previous Value, then the Value is added to the Result. Either way, after checking, the Value is set as the Previous Value.
    - After checking all the characters, the integer Result is returned.

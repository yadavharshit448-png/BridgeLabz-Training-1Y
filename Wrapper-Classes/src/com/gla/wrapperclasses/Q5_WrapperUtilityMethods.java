package com.gla.wrapperclasses;

/**
 * Q5. Wrapper Class Utility Methods
 * Demonstrates utility methods from Integer, Double, Boolean, and Character.
 */
public class Q5_WrapperUtilityMethods {

    public static void main(String[] args) {
        System.out.println("=== Wrapper Class Utility Methods ===\n");

        // Integer.parseInt() - converts String to int
        int parsedInt = Integer.parseInt("123");
        System.out.println("Integer.parseInt(\"123\")         = " + parsedInt);

        // Double.parseDouble() - converts String to double
        double parsedDouble = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\")      = " + parsedDouble);

        // Boolean.parseBoolean() - converts String to boolean
        boolean parsedBoolean = Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean(\"true\")    = " + parsedBoolean);

        // Integer.toBinaryString() - converts int to binary string
        String binaryStr = Integer.toBinaryString(10);
        System.out.println("Integer.toBinaryString(10)      = " + binaryStr);

        // Character.isDigit() - checks if char is a digit
        boolean isDigit = Character.isDigit('5');
        System.out.println("Character.isDigit('5')          = " + isDigit);

        // Character.toUpperCase() - converts char to uppercase
        char upper = Character.toUpperCase('a');
        System.out.println("Character.toUpperCase('a')      = " + upper);
    }
}

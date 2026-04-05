package com.gla.wrapperclasses;

/**
 * Q6. Input Conversion Utility
 * A safeParseInt() method that converts a String to an int,
 * and returns -1 if the conversion fails (NumberFormatException).
 */
public class Q6_InputConversionUtility {

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("  [Warning] Cannot parse \"" + input + "\": " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Safe Parse Int Utility ===\n");

        String[] testInputs = {"123", "abc", "45.6", "0"};

        for (String input : testInputs) {
            int result = safeParseInt(input);
            System.out.println("safeParseInt(\"" + input + "\") = " + result);
        }
    }
}

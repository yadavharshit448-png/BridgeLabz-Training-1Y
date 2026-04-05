package com.gla.wrapperclasses;

/**
 * Scenario 3. User Input Validation (Login System)
 * Method returns true if age is a valid integer and >= 18, else false.
 */
public class S3_UserInputValidation {
    public static boolean validateAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Validating '25': " + validateAge("25"));
        System.out.println("Validating '16': " + validateAge("16"));
        System.out.println("Validating 'abc': " + validateAge("abc"));
    }
}

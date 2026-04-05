package com.gla.wrapperclasses;

import java.util.Scanner;

/**
 * Q8. Character Wrapper Use Case
 * Counts total letters, digits, and special characters in a user-entered string.
 * Uses Character wrapper class methods.
 */
public class Q8_CharacterWrapperUseCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int whitespace = 0;
        int special = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                whitespace++;
            } else {
                special++;
            }
        }

        System.out.println("\n=== Character Analysis ===");
        System.out.println("Input         : \"" + input + "\"");
        System.out.println("Total letters : " + letters);
        System.out.println("Total digits  : " + digits);
        System.out.println("Whitespace    : " + whitespace);
        System.out.println("Special chars : " + special);

        sc.close();
    }
}

package com.gla.array.Level2;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Question 5: Reverse digits of a number using array
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        String numStr = String.valueOf(Math.abs(number));
        int len = numStr.length();
        int[] digits = new int[len];
        
        long temp = Math.abs(number);
        for (int i = 0; i < len; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }
        
        // Digits are naturally extracted in reverse order (LSD first)
        // Question asks to store digits, then reverse? 
        // "store the digits of the number in an array and display the array in reverse order"
        // If I store them as LSD at index 0, normal print is "reverse order" of the number.
        // Let's print them as stored (which is reverse of original).
        
        System.out.print("Reversed Number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
        scanner.close();
    }
}

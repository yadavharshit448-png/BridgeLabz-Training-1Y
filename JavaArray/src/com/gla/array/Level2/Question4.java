package com.gla.array.Level2;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Question 4: Largest and Second Largest Digit (Dynamic Resizing)
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        long temp = Math.abs(number);
        if (temp == 0) {
            digits[index++] = 0;
        }
        
        while (temp > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] newDigits = new int[maxDigit];
                System.arraycopy(digits, 0, newDigits, 0, digits.length);
                digits = newDigits;
            }
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }
        
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
        scanner.close();
    }
}

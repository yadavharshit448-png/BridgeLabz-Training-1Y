package com.gla.array.Level2;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Question 3: Largest and Second Largest Digit (Fixed size 10)
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        long temp = Math.abs(number); // Handle negative numbers
        if (temp == 0) {
            digits[index++] = 0;
        }
        
        while (temp > 0) {
            if (index == maxDigit) {
                System.out.println("Number too large for array size of 10. Truncating.");
                break;
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

package com.gla.array.Level2;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Question 10: Frequency of each digit
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int[] frequency = new int[10];
        long temp = Math.abs(number);
        
        if (temp == 0) {
            frequency[0]++;
        } else {
            while (temp > 0) {
                int digit = (int)(temp % 10);
                frequency[digit]++;
                temp /= 10;
            }
        }
        
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        scanner.close();
    }
}

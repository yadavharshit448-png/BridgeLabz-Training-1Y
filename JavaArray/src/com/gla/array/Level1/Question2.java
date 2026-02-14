package com.gla.array.Level1;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Question 2: Analyze 5 numbers
        
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive");
                if (num % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }
        
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
        scanner.close();
    }
}

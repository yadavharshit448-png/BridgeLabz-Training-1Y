package com.gla.array.Level1;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Question 5: Multiplication table from 6 to 9 for a user entered number
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Array to store results for 6, 7, 8, 9 (4 elements)
        // Hint says "from 6 to 9", let's deduce size. 6,7,8,9 -> 4 indices
        int[] multiplicationResult = new int[4]; 
        
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        scanner.close();
    }
}

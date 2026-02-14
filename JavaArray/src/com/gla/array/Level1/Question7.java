package com.gla.array.Level1;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Question 7: Odd and Even arrays
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Error: Not a natural number");
            System.exit(0);
        }
        
        // Max possible size is number / 2 + 1 (roughly half)
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        
        int oddIndex = 0;
        int evenIndex = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }
        
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}

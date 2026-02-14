package com.gla.array.Level1;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Question 4: Store up to 10 numbers or until 0/negative
        
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        int index = 0;
        double total = 0.0;
        
        System.out.println("Enter numbers (0 or negative to stop, max 10):");
        while (true) {
            if (index >= 10) break;
            
            double input = scanner.nextDouble();
            if (input <= 0) break;
            
            numbers[index] = input;
            total += input;
            index++;
        }
        
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + total);
        scanner.close();
    }
}

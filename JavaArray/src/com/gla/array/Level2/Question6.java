package com.gla.array.Level2;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Question 6: BMI Calculator
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] weightStatus = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Height (m): ");
            heights[i] = scanner.nextDouble();
            
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmis[i] <= 18.4) weightStatus[i] = "Underweight";
            else if (bmis[i] <= 24.9) weightStatus[i] = "Normal";
            else if (bmis[i] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        
        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s%n",
                    (i + 1), heights[i], weights[i], bmis[i], weightStatus[i]);
        }
        scanner.close();
    }
}

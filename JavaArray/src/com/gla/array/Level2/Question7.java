package com.gla.array.Level2;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Question 7: BMI Calculator using 2D Array
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        
        // Rows: Persons, Cols: 0=Weight, 1=Height, 2=BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            
            // Validation loop
            do {
                System.out.print("Weight (kg): ");
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Height (m): ");
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        
        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        scanner.close();
    }
}

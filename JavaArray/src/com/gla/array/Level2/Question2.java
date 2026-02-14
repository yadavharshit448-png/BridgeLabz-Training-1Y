package com.gla.array.Level2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Question 2: Youngest (Age) and Tallest (Height) among 3 friends (Amar, Akbar, Anthony)
        
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i]);
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height: ");
            heights[i] = scanner.nextDouble();
        }
        
        int minAgeIndex = 0;
        int maxHeightIndex = 0;
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        
        System.out.println("Youngest friend is " + friends[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("Tallest friend is " + friends[maxHeightIndex] + " with height " + heights[maxHeightIndex]);
        scanner.close();
    }
}

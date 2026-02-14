package com.gla.array.Level1;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Question 1: Check voting eligibility for 10 students
        
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        scanner.close();
    }
}

package com.gla.array.Level2;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // Question 9: Student Grades (2D Array)
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        // Rows: Students, Cols: 0=Phy, 1=Chem, 2=Math
        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = getInput(scanner);
            System.out.print("Chemistry: ");
            marks[i][1] = getInput(scanner);
            System.out.print("Maths: ");
            marks[i][2] = getInput(scanner);
            
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            
            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        
        System.out.println("\nGrade Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Phy: %.0f, Chem: %.0f, Math: %.0f, Pct: %.2f%%, Grade: %s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        scanner.close();
    }
    
    public static double getInput(Scanner s) {
        double val;
        while (true) {
            val = s.nextDouble();
            if (val >= 0) break;
            System.out.print("Invalid input. Enter positive marks: ");
        }
        return val;
    }
}

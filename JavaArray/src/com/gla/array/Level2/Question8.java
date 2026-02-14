package com.gla.array.Level2;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Question 8: Student Grades
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics: ");
            physics[i] = getInput(scanner);
            System.out.print("Chemistry: ");
            chemistry[i] = getInput(scanner);
            System.out.print("Maths: ");
            maths[i] = getInput(scanner);
            
            double total = physics[i] + chemistry[i] + maths[i];
            percentages[i] = total / 3.0; // Assuming 100 marks per subject
            
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
                    (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
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

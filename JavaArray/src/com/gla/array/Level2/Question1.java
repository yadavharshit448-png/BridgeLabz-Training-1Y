package com.gla.array.Level2;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Question 1: Employee Bonus
        
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            double years = scanner.nextDouble();
            
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }
            
            salaries[i] = salary;
            yearsOfService[i] = years;
            totalOldSalary += salary;
        }
        
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        scanner.close();
    }
}

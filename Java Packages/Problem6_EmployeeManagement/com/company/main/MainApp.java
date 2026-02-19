package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Problem 6: Employee Management System");

        // 1. Define classes with encapsulation (Done in Employee.java)
        // 2. Import necessary classes (Done above)

        Employee emp = new Employee(101, "Jane Doe", "IT", 50000);
        
        System.out.println("Before Bonus:");
        emp.displayDetails();
        
        Payroll payroll = new Payroll();
        payroll.calculateBonus(emp);
        
        System.out.println("\nAfter Bonus:");
        // 3. Display employee details and salary after bonus
        emp.displayDetails();
        
        // 4. Folder structure explanation
        System.out.println("\nFolder Structure Explanation:");
        System.out.println("The package 'com.company.hr' maps to folder 'com/company/hr'.");
        System.out.println("Java enforces this structure to locate classes at runtime.");
        System.out.println("If the folder structure doesn't match the package declaration, the JVM won't find the classes.");
    }
}

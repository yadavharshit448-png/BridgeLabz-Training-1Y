package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double currentSalary = e.getSalary();
        double bonus = currentSalary * 0.10;
        double newSalary = currentSalary + bonus;
        
        e.setSalary(newSalary);
        
        System.out.println("\n--- Bonus Calculation ---");
        System.out.println("Bonus Amount (10%): $" + bonus);
        System.out.println("Updated Salary: $" + newSalary);
    }
}

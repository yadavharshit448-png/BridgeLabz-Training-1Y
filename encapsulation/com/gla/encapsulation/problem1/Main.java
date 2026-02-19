package com.gla.encapsulation.problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(101, "Alice", 5000, 1000));
        employees.add(new PartTimeEmployee(102, "Bob", 0, 20, 50));

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("-------------------------");
        }
    }
}

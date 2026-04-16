package com.gla.map_assignment;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Alice", 50000.0);
        salaries.put("Bob", 60000.0);
        salaries.put("Charlie", 45000.0);
        
        // Give raise
        String emp = "Alice";
        if (salaries.containsKey(emp)) salaries.put(emp, salaries.get(emp) * 1.10);
        else System.out.println("Employee not found");
        
        double total = 0;
        double maxSalary = 0;
        String highestPaid = "";
        
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            total += e.getValue();
            if (e.getValue() > maxSalary) {
                maxSalary = e.getValue();
                highestPaid = e.getKey();
            }
        }
        
        System.out.println("Average Salary: " + (total / salaries.size()));
        System.out.println("Highest Paid: " + highestPaid + " (" + maxSalary + ")");
    }
}

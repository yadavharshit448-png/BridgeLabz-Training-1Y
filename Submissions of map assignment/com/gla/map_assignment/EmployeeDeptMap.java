package com.gla.map_assignment;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDeptMap {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "IT");
        empDept.put(102, "HR");
        empDept.put(103, "IT");
        empDept.put(104, "Finance");
        
        empDept.put(102, "IT"); // Move from HR to IT
        
        String searchDept = "IT";
        System.out.println("Employees in " + searchDept + ":");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if (e.getValue().equals(searchDept)) System.out.println(e.getKey());
        }
        
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }
        System.out.println("Total per department: " + deptCount);
    }
}

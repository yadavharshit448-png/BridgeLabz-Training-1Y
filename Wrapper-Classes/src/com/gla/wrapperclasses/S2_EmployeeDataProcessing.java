package com.gla.wrapperclasses;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Scenario 2. Employee Data Processing
 * Converts int[] array into an ArrayList<Integer> using wrapper classes.
 * Finds the youngest and oldest employee ages using Collections.min() and Collections.max().
 */
public class S2_EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {35, 28, 42, 24, 55, 31, 29};
        ArrayList<Integer> ageList = new ArrayList<>();
        
        for (int age : ages) {
            ageList.add(age); // auto-boxing: int to Integer
        }
        
        int youngest = Collections.min(ageList); // auto-unboxing result
        int oldest = Collections.max(ageList);   // auto-unboxing result
        
        System.out.println("Ages list: " + ageList);
        System.out.println("Youngest employee: " + youngest);
        System.out.println("Oldest employee: " + oldest);
    }
}

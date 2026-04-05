package com.gla.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Scenario 8. Student Marks Report
 * Converts inputs (Strings, ints, etc) to valid Integers, ignores null/invalid, computes avg.
 */
public class S8_StudentMarksReport {
    public static void main(String[] args) {
        Object[] rawMarks = {"85", 95, Integer.valueOf(88), "null", "invalid"};
        
        List<Integer> validMarks = new ArrayList<>();
        
        for (Object mark : rawMarks) {
            try {
                if (mark instanceof String) {
                    if (!mark.equals("null")) {
                        // String to Integer
                        validMarks.add(Integer.parseInt((String) mark));
                    }
                } else if (mark instanceof Integer) {
                    validMarks.add((Integer) mark); // already Integer
                }
            } catch (NumberFormatException e) {
                // Ignore invalid strings
            }
        }
        
        System.out.println("Valid marks: " + validMarks);
        
        int sum = 0;
        for (Integer mark : validMarks) {
            sum += mark; // auto-unboxing
        }
        
        double avg = validMarks.isEmpty() ? 0 : (double) sum / validMarks.size();
        System.out.println("Average mark: " + avg);
    }
}

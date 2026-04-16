package com.gla.map_assignment;

import java.util.HashMap;
import java.util.Map;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> scores = new HashMap<>();
        
        Map<String, Integer> math = new HashMap<>();
        math.put("Alice", 85); math.put("Bob", 92);
        
        Map<String, Integer> phy = new HashMap<>();
        phy.put("Alice", 95); phy.put("Bob", 88);
        
        scores.put("Math", math);
        scores.put("Physics", phy);
        
        for (Map.Entry<String, Map<String, Integer>> subjEntry : scores.entrySet()) {
            String subject = subjEntry.getKey();
            Map<String, Integer> studentMarks = subjEntry.getValue();
            
            String topper = "";
            int maxScore = -1;
            double total = 0;
            boolean above90 = false;
            
            for (Map.Entry<String, Integer> m : studentMarks.entrySet()) {
                total += m.getValue();
                if (m.getValue() > maxScore) {
                    maxScore = m.getValue();
                    topper = m.getKey();
                }
                if (m.getValue() > 90) above90 = true;
            }
            
            System.out.println("Subject: " + subject);
            System.out.println("Topper: " + topper + " (" + maxScore + ")");
            System.out.println("Average: " + (total / studentMarks.size()));
            if (above90) System.out.println("At least one student scored >90.");
            System.out.println();
        }
    }
}

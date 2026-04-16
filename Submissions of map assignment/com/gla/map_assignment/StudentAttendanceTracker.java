package com.gla.map_assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};
        for (String s : students) attendance.put(s, 0);
        
        List<List<String>> dailyLogs = List.of(
            List.of("Alice", "Bob", "Charlie"),
            List.of("Alice", "Charlie", "David", "Eve"),
            List.of("Bob", "Charlie"),
            List.of("Alice", "Bob", "Charlie", "David", "Eve")
        );
        
        for (List<String> daily : dailyLogs) {
            for (String present : daily) {
                attendance.put(present, attendance.get(present) + 1);
            }
        }
        
        int threshold = 3;
        System.out.println("Under-attending (< " + threshold + "):");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey() + " - Days: " + entry.getValue());
            }
        }
    }
}

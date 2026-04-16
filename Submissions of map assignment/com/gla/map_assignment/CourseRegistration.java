package com.gla.map_assignment;

import java.util.HashMap;
import java.util.Map;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("CS102", 4);
        courses.put("CS103", 55);
        
        courses.put("CS101", courses.get("CS101") + 6);
        courses.put("CS102", Math.max(0, courses.get("CS102") - 1));
        
        System.out.println("Near full (>=50):");
        for(Map.Entry<String, Integer> e : courses.entrySet()) 
            if(e.getValue() >= 50) System.out.println(e.getKey() + " (" + e.getValue() + ")");
            
        System.out.println("Under-subscribed (<5):");
        for(Map.Entry<String, Integer> e : courses.entrySet()) 
            if(e.getValue() < 5) System.out.println(e.getKey() + " (" + e.getValue() + ")");
    }
}

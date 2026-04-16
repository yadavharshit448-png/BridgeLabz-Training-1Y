package com.gla.map_assignment;

import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();
        String[] logs = {"home", "about", "products", "home", "products", "contact", "home"};
        
        for (String page : logs) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(visits.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        System.out.println("Visits (Descending):");
        for (Map.Entry<String, Integer> e : sorted) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        
        if (!sorted.isEmpty()) {
            System.out.println("Most Visited: " + sorted.get(0).getKey());
        }
    }
}

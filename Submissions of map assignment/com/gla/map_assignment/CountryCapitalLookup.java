package com.gla.map_assignment;

import java.util.Map;
import java.util.TreeMap;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C.");
        countries.put("Japan", "Tokyo");
        countries.put("France", "Paris");
        
        String query = "Japan";
        System.out.println("Capital of " + query + ": " + countries.getOrDefault(query, "Unknown country"));
        
        System.out.println("All countries:");
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

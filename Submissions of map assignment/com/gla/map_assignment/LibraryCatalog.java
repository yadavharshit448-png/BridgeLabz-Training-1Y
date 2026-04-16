package com.gla.map_assignment;

import java.util.Map;
import java.util.TreeMap;

public class LibraryCatalog {
    public static void main(String[] args) {
        TreeMap<String, String> catalog = new TreeMap<>();
        catalog.put("978-123", "Java Basics");
        catalog.put("978-456", "Advanced Java");
        catalog.put("978-789", "Data Structures");
        
        String searchIsbn = "978-456";
        System.out.println("Search ISBN " + searchIsbn + ": " + catalog.getOrDefault(searchIsbn, "Book not found"));
        
        catalog.remove("978-123");
        
        System.out.println("Sorted Catalog:");
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

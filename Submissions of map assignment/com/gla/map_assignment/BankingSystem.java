package com.gla.map_assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> balances = new HashMap<>();
        balances.put("ACC1", 1000.0);
        balances.put("ACC2", 5000.0);
        balances.put("ACC3", 2500.0);
        balances.put("ACC4", 6000.0);
        
        // Operations
        balances.put("ACC1", balances.get("ACC1") + 500); // Deposit
        double withdraw = 2000;
        if (balances.get("ACC3") >= withdraw) {
            balances.put("ACC3", balances.get("ACC3") - withdraw);
        } else {
            System.out.println("Insufficient funds for ACC3");
        }
        
        List<Map.Entry<String, Double>> sorted = new ArrayList<>(balances.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        System.out.println("Customers sorted by balance:");
        sorted.forEach(System.out::println);
        
        System.out.println("Top 3:");
        for (int i = 0; i < Math.min(3, sorted.size()); i++) {
            System.out.println(sorted.get(i));
        }
    }
}

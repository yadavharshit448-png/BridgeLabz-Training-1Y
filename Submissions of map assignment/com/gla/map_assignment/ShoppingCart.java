package com.gla.map_assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 12000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1500.0);
        
        cart.remove("Mouse"); // Simulated removal
        
        System.out.println("Cart Items:");
        double total = 0;
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " : Rs." + e.getValue());
            total += e.getValue();
        }
        
        if (total > 15000) {
            total = total * 0.90; // 10% discount
            System.out.println("Discount applied!");
        }
        System.out.println("Total Bill: Rs." + total);
    }
}

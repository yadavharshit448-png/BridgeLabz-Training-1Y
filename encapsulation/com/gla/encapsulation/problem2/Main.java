package com.gla.encapsulation.problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(201, "Laptop", 50000));
        products.add(new Clothing(202, "T-Shirt", 1000));
        products.add(new Groceries(203, "Rice", 500));

        for (Product p : products) {
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println("Product: " + p.getName());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Discount: " + p.calculateDiscount());
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-------------------------");
        }
    }
}

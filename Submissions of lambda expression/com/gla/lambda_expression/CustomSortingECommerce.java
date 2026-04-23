package com.gla.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSortingECommerce {
    static class Product {
        String name;
        double price;
        double rating;

        Product(String n, double p, double r) {
            name = n; price = p; rating = r;
        }
        public String toString() { return name + " (Rs." + price + ", " + rating + "*)"; }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000, 4.5));
        products.add(new Product("Mouse", 800, 4.2));
        products.add(new Product("Phone", 30000, 4.8));

        System.out.println("Sorted by price:");
        Collections.sort(products, (p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSorted by rating (descending):");
        Collections.sort(products, (p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);
    }
}

package com.gla.generics_assignment;

import java.util.List;

public class PriceCalculator {
    static class Product {
        double price;
        Product(double p) { price = p; }
        public double getPrice() { return price; }
    }
    static class Mobile extends Product { Mobile(double p) { super(p); } }
    static class Laptop extends Product { Laptop(double p) { super(p); } }

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = List.of(new Mobile(500), new Mobile(300));
        System.out.println("Total mobile price: " + calculateTotal(mobiles));
    }
}

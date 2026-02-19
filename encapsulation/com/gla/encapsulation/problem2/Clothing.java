package com.gla.encapsulation.problem2;

public class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 20% discount for clothing
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        // 5% tax
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "GST 5%";
    }
}

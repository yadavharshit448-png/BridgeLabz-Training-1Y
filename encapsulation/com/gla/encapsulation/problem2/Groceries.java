package com.gla.encapsulation.problem2;

public class Groceries extends Product implements Taxable {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 5% discount for groceries
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        // 0% tax or minimal
        return 0;
    }

    @Override
    public String getTaxDetails() {
        return "No Tax";
    }
}

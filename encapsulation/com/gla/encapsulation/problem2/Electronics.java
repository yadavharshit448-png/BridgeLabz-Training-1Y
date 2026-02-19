package com.gla.encapsulation.problem2;

public class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 10% discount for electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 18% tax
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST 18%";
    }
}

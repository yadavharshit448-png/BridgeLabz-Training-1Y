package com.gla.generics_assignment;

public class DynamicMarketplace {
    static abstract class Category {}
    static class BookCategory extends Category {}
    
    static class Product<T extends Category> {
        double price;
        public Product(double price) { this.price = price; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
        public String toString() { return "Price: " + price; }
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(100);
        applyDiscount(book, 10);
        System.out.println(book);
    }
}

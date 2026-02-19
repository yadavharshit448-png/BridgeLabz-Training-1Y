package com.gla.encapsulation.problem6;

public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Additional charge for packaging or processing non-veg?
        // Prompt says "include additional charges".
        return (getPrice() * getQuantity()) + 50; 
    }

    @Override
    public double applyDiscount() {
        return 0; // No discount on Non-Veg
    }

    @Override
    public String getDiscountDetails() {
        return "No discount available";
    }
}

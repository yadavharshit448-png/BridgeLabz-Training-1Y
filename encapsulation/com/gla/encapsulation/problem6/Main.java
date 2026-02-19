package com.gla.encapsulation.problem6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);
            
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).applyDiscount();
                System.out.println("Discount: " + discount + " (" + ((Discountable) item).getDiscountDetails() + ")");
                System.out.println("Final Price: " + (total - discount));
            }
            System.out.println("---------------------------------");
        }
    }
}

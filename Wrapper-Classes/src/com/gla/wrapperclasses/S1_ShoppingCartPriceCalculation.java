package com.gla.wrapperclasses;

/**
 * Scenario 1. Shopping Cart Price Calculation
 * Converts string prices to numeric values using wrapper classes,
 * handles invalid prices using try-catch.
 */
public class S1_ShoppingCartPriceCalculation {

    public static void main(String[] args) {
        // String prices from e-commerce app (could be invalid)
        String[] prices = {"250", "499", "99", "abc", "150", "null", "350"};

        int total = 0;
        System.out.println("=== Shopping Cart Price Calculation ===\n");

        for (String price : prices) {
            try {
                int value = Integer.parseInt(price);
                total += value;
                System.out.println("Item price: " + value + " rupees  [VALID]");
            } catch (NumberFormatException e) {
                System.out.println("Invalid price \"" + price + "\" - skipped  [INVALID]");
            }
        }

        System.out.println("\nTotal Cart Price: Rs. " + total);
    }
}

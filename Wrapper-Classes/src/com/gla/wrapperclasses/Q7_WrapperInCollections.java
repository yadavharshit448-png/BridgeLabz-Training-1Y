package com.gla.wrapperclasses;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Q7. Wrapper Objects in Collections
 * Converts primitive double[] into ArrayList<Double>,
 * then calculates the highest and average price.
 */
public class Q7_WrapperInCollections {

    public static void main(String[] args) {
        // Given primitive double array
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        // Convert to ArrayList<Double> using auto-boxing (wrapper objects)
        ArrayList<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);  // auto-boxing: double -> Double
        }

        System.out.println("Prices list: " + priceList);

        // Highest price
        double highest = Collections.max(priceList);  // auto-unboxing inside
        System.out.println("Highest price : " + highest);

        // Average price
        double sum = 0.0;
        for (Double price : priceList) {
            sum += price;  // auto-unboxing: Double -> double
        }
        double average = sum / priceList.size();
        System.out.printf("Average price : %.2f%n", average);
    }
}

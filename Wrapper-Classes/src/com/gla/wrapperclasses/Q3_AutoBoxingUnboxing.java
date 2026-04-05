package com.gla.wrapperclasses;

import java.util.ArrayList;

/**
 * Q3. Auto-boxing and Auto-unboxing
 * Create an ArrayList<Integer>, add 5 values using auto-boxing,
 * then calculate sum using auto-unboxing.
 * Expected Output: Sum of numbers = 55
 */
public class Q3_AutoBoxingUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Auto-boxing: primitive int -> Integer object automatically
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(5);

        int sum = 0;
        // Auto-unboxing: Integer object -> primitive int automatically
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of numbers = " + sum);
    }
}

package com.gla.wrapperclasses;

import java.util.Scanner;

/**
 * Q1. Primitive to Wrapper Conversion
 * Converts an integer input into an Integer object and displays both forms.
 */
public class Q1_PrimitiveToWrapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitiveValue = sc.nextInt();

        // Convert primitive int to Integer object (auto-boxing)
        Integer wrapperValue = Integer.valueOf(primitiveValue);

        System.out.println("Primitive int value : " + primitiveValue);
        System.out.println("Integer object value: " + wrapperValue);
        System.out.println("Integer object class: " + wrapperValue.getClass().getName());

        sc.close();
    }
}

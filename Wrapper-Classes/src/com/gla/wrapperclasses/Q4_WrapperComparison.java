package com.gla.wrapperclasses;

/**
 * Q4. Wrapper Comparison
 * Demonstrates why == and .equals() behave differently with Integer objects.
 * Java caches Integer values from -128 to 127 (integer cache pool).
 */
public class Q4_WrapperComparison {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("=== Wrapper Comparison Demo ===\n");

        System.out.println("a == b       : " + (a == b));
        System.out.println("c == d       : " + (c == d));
        System.out.println("a.equals(b)  : " + a.equals(b));
        System.out.println("c.equals(d)  : " + c.equals(d));

        System.out.println();
        System.out.println("=== Explanation ===");
        System.out.println("a == b  is TRUE  because Java caches Integer values between -128");
        System.out.println("        and 127. Both 'a' and 'b' point to the SAME cached object.");
        System.out.println();
        System.out.println("c == d  is FALSE because 200 is outside the cache range.");
        System.out.println("        'c' and 'd' are two DIFFERENT Integer objects in heap memory,");
        System.out.println("        so == compares references (addresses), not values.");
        System.out.println();
        System.out.println(".equals() always compares VALUES, so both return TRUE.");
    }
}

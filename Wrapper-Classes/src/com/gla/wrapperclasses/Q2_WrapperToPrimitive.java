package com.gla.wrapperclasses;

/**
 * Q2. Wrapper to Primitive Conversion
 * Given a Double object with value 45.67, convert to double and int.
 */
public class Q2_WrapperToPrimitive {

    public static void main(String[] args) {
        Double doubleObject = 45.67;  // auto-boxing

        // Convert Double wrapper to primitive double (auto-unboxing)
        double doubleValue = doubleObject.doubleValue();

        // Convert Double wrapper to primitive int via casting
        int intValue = (int) doubleObject.doubleValue();

        System.out.println("Double object   : " + doubleObject);
        System.out.println("Primitive double: " + doubleValue);
        System.out.println("Primitive int   : " + intValue + "  (truncated by casting)");
    }
}

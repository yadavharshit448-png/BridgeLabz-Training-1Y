package com.gla.generics_assignment;

public class CompareValues {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));
        System.out.println(isEqual("Hello", "World"));
    }
}

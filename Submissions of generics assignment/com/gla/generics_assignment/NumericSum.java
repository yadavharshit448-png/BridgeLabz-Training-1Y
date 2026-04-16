package com.gla.generics_assignment;

import java.util.List;

public class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5);
        System.out.println("Int sum: " + sumNumbers(ints));
        System.out.println("Double sum: " + sumNumbers(doubles));
    }
}

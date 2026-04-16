package com.gla.collections;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));
        
        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);
        
        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);
        
        Set<Integer> symDiff = new HashSet<>(diff1);
        symDiff.addAll(diff2);
        
        System.out.println("Symmetric Difference: " + symDiff);
    }
}

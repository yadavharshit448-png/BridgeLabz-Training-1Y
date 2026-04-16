package com.gla.collections;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3, 4));
        
        System.out.println("Set1 is subset of Set2: " + set2.containsAll(set1));
    }
}

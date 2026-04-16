package com.gla.collections;

import java.util.Set;

public class CheckEqualSets {
    public static <T> boolean areSetsEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);
        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
    }
}

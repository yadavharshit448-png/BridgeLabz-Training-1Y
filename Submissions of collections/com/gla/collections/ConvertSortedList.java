package com.gla.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(5, 3, 9, 1));
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        System.out.println("Sorted List: " + list);
    }
}

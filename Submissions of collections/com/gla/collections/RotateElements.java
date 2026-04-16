package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class RotateElements {
    public static <T> void rotateOptions(List<T> list, int positions) {
        if (list == null || list.isEmpty()) return;
        int n = list.size();
        positions = positions % n;
        if (positions < 0) positions += n;
        
        List<T> temp = new ArrayList<>(list.subList(n - positions, n));
        temp.addAll(list.subList(0, n - positions));
        
        for (int i = 0; i < n; i++) {
            list.set(i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        rotateOptions(lst, 2);
        System.out.println(lst);
    }
}

package com.gla.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static <T> void reverse(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        reverse(list1);
        System.out.println("Reversed ArrayList: " + list1);
        
        List<Integer> list2 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        reverse(list2);
        System.out.println("Reversed LinkedList: " + list2);
    }
}

package com.gla.collections;

import java.util.LinkedList;

public class FindNthElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("A", "B", "C", "D", "E"));
        int n = 2;
        
        // Approach with 2 pointers assuming standard LinkedList custom impl or using index iterator
        // For java.util.LinkedList, we can use an iterator to delay the second pointer
        java.util.Iterator<String> fast = list.iterator();
        java.util.Iterator<String> slow = list.iterator();
        
        for(int i=0; i<n; i++) {
            if(fast.hasNext()) fast.next();
            else return; // N is larger than list
        }
        
        while(fast.hasNext()) {
            fast.next();
            slow.next();
        }
        
        System.out.println(slow.next()); // Will output D
    }
}

package com.gla.wrapperclasses;

import java.util.ArrayList;

/**
 * Scenario 9. Performance Impact of Wrapper Classes
 * Benchmarks filling and summing int[] vs ArrayList<Integer>.
 */
public class S9_PerformanceImpact {
    public static void main(String[] args) {
        int limit = 1_000_000;
        
        System.out.println("Starting benchmark with " + limit + " items...\n");
        
        // --- Primitive array benchmark ---
        long startPrimitiveFill = System.nanoTime();
        int[] arr = new int[limit];
        for (int i = 0; i < limit; i++) {
            arr[i] = i;
        }
        long endPrimitiveFill = System.nanoTime();
        
        long startPrimitiveSum = System.nanoTime();
        long sumPrimitive = 0;
        for (int i = 0; i < limit; i++) {
            sumPrimitive += arr[i];
        }
        long endPrimitiveSum = System.nanoTime();
        
        // --- Wrapper ArrayList benchmark ---
        long startWrapperFill = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            list.add(i); // auto-boxing
        }
        long endWrapperFill = System.nanoTime();
        
        long startWrapperSum = System.nanoTime();
        long sumWrapper = 0;
        for (Integer num : list) {
            sumWrapper += num; // auto-unboxing
        }
        long endWrapperSum = System.nanoTime();
        
        System.out.println("--- primitive int[] ---");
        System.out.println("Fill time: " + (endPrimitiveFill - startPrimitiveFill) / 1_000_000.0 + " ms");
        System.out.println("Sum time:  " + (endPrimitiveSum - startPrimitiveSum) / 1_000_000.0 + " ms");
        System.out.println("Sum:       " + sumPrimitive);
        
        System.out.println("\n--- ArrayList<Integer> ---");
        System.out.println("Fill time: " + (endWrapperFill - startWrapperFill) / 1_000_000.0 + " ms");
        System.out.println("Sum time:  " + (endWrapperSum - startWrapperSum) / 1_000_000.0 + " ms");
        System.out.println("Sum:       " + sumWrapper);
        
        System.out.println("\n(Notice how auto-boxing and dealing with objects is slower than primitive types)");
    }
}

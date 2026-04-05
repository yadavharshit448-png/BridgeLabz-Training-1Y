package com.gla.wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Scenario 6. Product Ratings Analyzer
 * Combines int[] and ArrayList<Integer>, ignores nulls using Objects.nonNull(), 
 * computes average.
 */
public class S6_ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3};
        List<Integer> wrapperRatings = Arrays.asList(4, null, 5, 2, null);
        
        List<Integer> combinedList = new ArrayList<>();
        
        // Add primitives (auto-boxing)
        for (int r : primitiveRatings) {
            combinedList.add(r);
        }
        
        // Add wrappers, filtering nulls
        for (Integer r : wrapperRatings) {
            if (Objects.nonNull(r)) {
                combinedList.add(r);
            }
        }
        
        System.out.println("Combined valid ratings: " + combinedList);
        
        double sum = 0;
        for (Integer r : combinedList) {
            sum += r; // auto-unboxing
        }
        
        double avg = combinedList.isEmpty() ? 0 : sum / combinedList.size();
        System.out.println("Average rating: " + avg);
    }
}

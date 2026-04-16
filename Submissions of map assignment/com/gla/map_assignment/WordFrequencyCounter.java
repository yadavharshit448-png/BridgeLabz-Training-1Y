package com.gla.map_assignment;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        String[] words = input.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println(freqMap);
    }
}

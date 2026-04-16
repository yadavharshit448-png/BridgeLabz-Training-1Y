package com.gla.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
    public static Map<String, Integer> getFrequencies(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : list) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        System.out.println(getFrequencies(List.of("apple", "banana", "apple", "orange")));
    }
}

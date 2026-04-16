package com.gla.map_assignment;

import java.util.HashMap;
import java.util.Map;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] castVotes = {"Alice", "Bob", "Alice", "Charlie", "Alice", "Bob", "Charlie", "Alice", "Bob", "Alice"};
        
        for (String vote : castVotes) {
            votes.put(vote, votes.getOrDefault(vote, 0) + 1);
        }
        
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("Votes: " + votes);
        System.out.println("Winner: " + winner);
    }
}

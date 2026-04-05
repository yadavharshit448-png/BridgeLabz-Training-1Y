package com.gla.wrapperclasses;

/**
 * Scenario 7. Game Scoreboard
 * Counts players without scores (score == null) and calculates total valid scores
 * via auto-unboxing.
 */
public class S7_GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {150, null, 200, 50, null, 300};
        
        int notPlayedCount = 0;
        int totalScore = 0;
        
        for (Integer score : scores) {
            if (score == null) {
                notPlayedCount++;
            } else {
                totalScore += score; // auto-unboxing: Integer to int
            }
        }
        
        System.out.println("Players who have not played: " + notPlayedCount);
        System.out.println("Total valid scores: " + totalScore);
    }
}

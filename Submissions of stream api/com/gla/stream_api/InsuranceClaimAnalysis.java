package com.gla.stream_api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    static class Claim {
        String claimType;
        double amount;
        Claim(String type, double amt) { claimType = type; amount = amt; }
    }

    public static void main(String[] args) {
        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Auto", 12000),
            new Claim("Health", 8000),
            new Claim("Home", 50000),
            new Claim("Auto", 15000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(c -> c.claimType, 
                     Collectors.averagingDouble(c -> c.amount)));

        System.out.println("Average Claims by Type:");
        avgClaims.forEach((type, avg) -> System.out.println(type + ": Rs." + avg));
    }
}

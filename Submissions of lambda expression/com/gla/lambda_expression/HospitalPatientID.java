package com.gla.lambda_expression;

import java.util.List;

public class HospitalPatientID {
    public static void main(String[] args) {
        List<String> patientIds = List.of("PID-001", "PID-002", "PID-003", "PID-004");
        
        System.out.println("Patient IDs for Admin Verification:");
        // Using method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}

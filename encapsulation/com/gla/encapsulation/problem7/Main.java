package com.gla.encapsulation.problem7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Alice", 30, 5, 1000));
        patients.add(new OutPatient(102, "Bob", 45, 500));

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            p.addRecord("Diagnosed with Flu");
            p.viewRecords();
            System.out.println("---------------------------");
        }
    }
}

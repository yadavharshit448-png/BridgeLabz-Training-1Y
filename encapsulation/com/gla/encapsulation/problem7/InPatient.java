package com.gla.encapsulation.problem7;

public class InPatient extends Patient {
    private int daysStayed;
    private double roomCharge;

    public InPatient(int patientId, String name, int age, int daysStayed, double roomCharge) {
        super(patientId, name, age);
        this.daysStayed = daysStayed;
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() {
        return daysStayed * roomCharge + 2000; // Base consult fee
    }
}

package com.gla.encapsulation.problem7;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
        System.out.println("Record added for " + name);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + name + ": " + medicalHistory);
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

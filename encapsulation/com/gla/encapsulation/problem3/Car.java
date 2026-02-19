package com.gla.encapsulation.problem3;

public class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: Basic Coverage";
    }
}

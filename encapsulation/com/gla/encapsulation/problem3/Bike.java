package com.gla.encapsulation.problem3;

public class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: Third Party";
    }
}

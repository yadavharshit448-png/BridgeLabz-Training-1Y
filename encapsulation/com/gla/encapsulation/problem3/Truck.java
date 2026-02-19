package com.gla.encapsulation.problem3;

public class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // Additional charge for truck
    }

    @Override
    public double calculateInsurance() {
        return 1000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: Commercial";
    }
}

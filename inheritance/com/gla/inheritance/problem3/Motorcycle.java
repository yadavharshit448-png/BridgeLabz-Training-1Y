package com.gla.inheritance.problem3;

public class Motorcycle extends Vehicle {
    private int engineCC;

    public Motorcycle(int maxSpeed, String fuelType, int engineCC) {
        super(maxSpeed, fuelType);
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Engine: " + engineCC + " CC");
    }
}

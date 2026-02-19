package com.gla.inheritance.problem11;

public class Main {
    public static void main(String[] args) {
        PetrolVehicle car = new PetrolVehicle("Sedan", 180);
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250);

        car.displayDetails();
        car.refuel();

        System.out.println("---");

        tesla.displayDetails();
        tesla.charge();
    }
}

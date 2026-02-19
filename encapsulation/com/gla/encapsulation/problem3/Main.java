package com.gla.encapsulation.problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("UP80AB1234", 1000));
        vehicles.add(new Bike("UP80XY5678", 500));
        vehicles.add(new Truck("UP80ZZ9999", 2000));

        int days = 5;
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());
                System.out.println("Details: " + ((Insurable) v).getInsuranceDetails());
            }
            System.out.println("-------------------------");
        }
    }
}

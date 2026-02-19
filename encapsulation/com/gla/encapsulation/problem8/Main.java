package com.gla.encapsulation.problem8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("KA01AB1234", "John", 20));
        fleet.add(new Bike("KA01XY5678", "Doe", 10));
        fleet.add(new Auto("KA01ZZ9999", "Smith", 15));

        double distance = 10.0;
        for (Vehicle v : fleet) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            v.updateLocation("Bangalore");
            System.out.println("Current Location: " + v.getCurrentLocation());
            System.out.println("---------------------------------");
        }
    }
}

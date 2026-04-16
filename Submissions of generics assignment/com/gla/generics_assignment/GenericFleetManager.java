package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class GenericFleetManager {
    static class Vehicle { public String toString() { return "Vehicle"; } }
    static class Truck extends Vehicle { public String toString() { return "Truck"; } }
    static class Bike extends Vehicle { public String toString() { return "Bike"; } }

    static class FleetManager<T extends Vehicle> {
        List<T> fleet = new ArrayList<>();
        public void addVehicle(T v) { fleet.add(v); }
        public void showFleet() { System.out.println(fleet); }
    }

    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck());
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike());
        bikeFleet.showFleet();
    }
}

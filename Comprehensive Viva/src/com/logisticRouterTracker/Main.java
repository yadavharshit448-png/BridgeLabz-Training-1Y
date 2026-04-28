package com.logisticRouterTracker;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.getRouteHistory().addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30.0, 60.0, 70.0));
        driver.getRouteHistory().addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20.0, 15.0, 15.0));
        driver.getRouteHistory().addCheckpoint(new RestCheckpoint("C3", "Motel X", 40.0, 60.0, 95.0));
        driver.getRouteHistory().addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30.0, 45.0, 60.0));

        System.out.println("Driver: " + driver.getDriverId() + " - " + driver.getName());
        System.out.println("Route Summary:");
        driver.getRouteHistory().printRoute();
        System.out.println("Total Distance: " + driver.getRouteHistory().computeTotalDistance() + " km");
        System.out.println("Total Penalty: " + driver.getRouteHistory().computeTotalPenalty());
        System.out.println("Route Score: " + driver.getRouteScore());

        if (driver.getRouteHistory().checkConsistency()) {
            System.out.println("Critical Route Check: All required checkpoints present");
        } else {
            System.out.println("Critical Route Check: Missing required critical checkpoints");
        }
    }
}

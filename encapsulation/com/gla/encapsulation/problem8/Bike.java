package com.gla.encapsulation.problem8;

public class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // Bikes are cheaper? Or ratePerKm handles it. Let's assume ratePerKm is base, maybe adjustments.
        // Actually, ratePerKm should define the cost. Let's just use rate * distance.
        // But prompt says "overriding calculateFare() based on type-specific rates".
        // If ratePerKm is field, then maybe method logic differs?
        // E.g. Bike might have surge pricing or discount.
        // Let's keep it simple: just rate * distance.
    }
}

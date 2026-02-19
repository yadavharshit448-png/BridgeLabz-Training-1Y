package com.gla.interfaces.problem6;

// 1. Payment Gateway Integration
interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed.");
    }
}

class PayPal implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment: " + amount);
    }
}

// 2. Data Export Feature
interface DataExporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exporting to JSON...");
    }
}

class Report implements DataExporter {
    @Override
    public void export() {
        System.out.println("Exporting data...");
    }
}

// 3. Smart Vehicle Dashboard
interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery display not supported for this vehicle.");
    }
}

class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 100 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

class PetrolCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 120 km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Payment
        PaymentProcessor pp = new PayPal();
        pp.processPayment(100);
        pp.refund(50);

        System.out.println("---");

        // 2. Data Export
        DataExporter de = new Report();
        de.export();
        de.exportToJSON();

        System.out.println("---");

        // 3. Vehicle
        Vehicle ev = new ElectricCar();
        ev.displaySpeed();
        ev.displayBattery();

        Vehicle pv = new PetrolCar();
        pv.displaySpeed();
        pv.displayBattery();
    }
}

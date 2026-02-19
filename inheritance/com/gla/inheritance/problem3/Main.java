package com.gla.inheritance.problem3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(100, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", 200);

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("----------------");
        }
    }
}

package com.gla.interfaces.problem2;

interface VehicleRental {
    void rent();

    void returnVehicle();
}

class Car implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Car Rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car Returned");
    }
}

class Bike implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Bike Rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike Returned");
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleRental car = new Car();
        VehicleRental bike = new Bike();

        car.rent();
        car.returnVehicle();
        bike.rent();
        bike.returnVehicle();
    }
}

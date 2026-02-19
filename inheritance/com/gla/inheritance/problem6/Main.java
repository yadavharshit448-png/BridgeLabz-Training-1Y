package com.gla.inheritance.problem6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(1, LocalDate.now());
        Order o2 = new ShippedOrder(2, LocalDate.now(), "TRK123");
        Order o3 = new DeliveredOrder(3, LocalDate.now().minusDays(2), "TRK456", LocalDate.now());

        System.out.println("Order 1: " + o1.getOrderStatus());
        System.out.println("Order 2: " + o2.getOrderStatus());
        System.out.println("Order 3: " + o3.getOrderStatus());
    }
}

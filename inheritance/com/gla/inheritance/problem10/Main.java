package com.gla.inheritance.problem10;

public class Main {
    public static void main(String[] args) {
        Chef c = new Chef("Gordon", 1);
        Waiter w = new Waiter("Harry", 2);

        c.displayInfo();
        c.performDuties();

        w.displayInfo();
        w.performDuties();
    }
}

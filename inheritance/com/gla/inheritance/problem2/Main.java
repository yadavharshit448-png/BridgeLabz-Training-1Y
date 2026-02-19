package com.gla.inheritance.problem2;

public class Main {
    public static void main(String[] args) {
        Employee mgr = new Manager("Alice", 101, 80000, 10);
        Employee dev = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000);

        mgr.displayDetails();
        System.out.println("---");
        dev.displayDetails();
        System.out.println("---");
        intern.displayDetails();
    }
}

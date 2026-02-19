package app;

import gla.student.Student;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Problem 4: Modular Programming");

        Student student = new Student("Bob", 102);
        student.display();

        System.out.println("\nDifferences between Packages and Modules:");
        System.out.println("1. Packages group related classes, while Modules group related packages.");
        System.out.println("2. Packages are a logical grouping, while Modules are a physical grouping.");
        System.out.println("3. Modules provide strong encapsulation (can hide public classes in packages).");
        System.out.println("4. Modules explicitly declare dependencies using 'requires'.");
    }
}

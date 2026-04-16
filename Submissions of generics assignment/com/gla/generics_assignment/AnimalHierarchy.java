package com.gla.generics_assignment;

import java.util.List;

public class AnimalHierarchy {
    static class Animal { public String toString() { return "Animal"; } }
    static class Dog extends Animal { public String toString() { return "Dog"; } }
    static class Cat extends Animal { public String toString() { return "Cat"; } }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}

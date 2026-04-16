package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    static class Fruit { public String toString() { return "Fruit"; } }
    static class Apple extends Fruit { public String toString() { return "Apple"; } }
    static class Mango extends Fruit { public String toString() { return "Mango"; } }
    static class Car {}

    static class FruitBox<T extends Fruit> {
        List<T> fruits = new ArrayList<>();
        public void add(T fruit) { fruits.add(fruit); }
        public void display() { System.out.println(fruits); }
    }

    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
        
        // FruitBox<Car> carBox = new FruitBox<>(); // Won't compile
    }
}

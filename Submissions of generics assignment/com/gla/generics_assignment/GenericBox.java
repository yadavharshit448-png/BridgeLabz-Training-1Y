package com.gla.generics_assignment;

public class GenericBox {
    static class Box<T> {
        private T value;

        public void set(T val) {
            this.value = val;
        }

        public T get() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String value: " + strBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(10.5);
        System.out.println("Double value: " + doubleBox.get());
    }
}

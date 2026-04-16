package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class GenericCart {
    static class Cart<T> {
        List<T> items = new ArrayList<>();
        public void addItem(T item) { items.add(item); }
        public void removeItem(T item) { items.remove(item); }
        public void displayItems() { System.out.println(items); }
    }

    public static void main(String[] args) {
        Cart<String> electronics = new Cart<>();
        electronics.addItem("Phone");
        electronics.addItem("Laptop");
        electronics.displayItems();

        Cart<String> clothing = new Cart<>();
        clothing.addItem("Shirt");
        clothing.displayItems();
    }
}

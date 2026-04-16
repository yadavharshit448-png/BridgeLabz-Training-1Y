package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class SmartWarehouseSystem {
    static abstract class WarehouseItem {}
    static class Electronics extends WarehouseItem { public String toString() { return "Electronics"; } }
    static class Groceries extends WarehouseItem { public String toString() { return "Groceries"; } }

    static class Storage<T extends WarehouseItem> {
        List<T> items = new ArrayList<>();
        public void add(T item) { items.add(item); }
        public List<T> getItems() { return items; }
    }

    public static void displayAllItems(List<? extends WarehouseItem> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Storage<Electronics> elecStorage = new Storage<>();
        elecStorage.add(new Electronics());
        displayAllItems(elecStorage.getItems());
    }
}

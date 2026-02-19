package com.gla.encapsulation.problem5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Magazine(2, "National Geographic", "Various"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                System.out.println("Available? " + ((Reservable) item).checkAvailability());
                ((Reservable) item).reserveItem();
            }
            System.out.println("--------------------------------");
        }
    }
}

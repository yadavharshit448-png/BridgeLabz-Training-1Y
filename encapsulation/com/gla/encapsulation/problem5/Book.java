package com.gla.encapsulation.problem5;

public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved: " + getTitle());
        } else {
            System.out.println("Book not available: " + getTitle());
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

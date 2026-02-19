package com.gla.encapsulation.problem5;

public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved: " + getTitle());
        } else {
            System.out.println("DVD not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

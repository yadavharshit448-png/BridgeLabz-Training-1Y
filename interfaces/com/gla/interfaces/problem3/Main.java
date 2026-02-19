package com.gla.interfaces.problem3;

interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class Wallet implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}

public class Main {
    public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment card = new CreditCard();
        DigitalPayment wallet = new Wallet();

        upi.pay(500);
        card.pay(1000);
        wallet.pay(250);
    }
}

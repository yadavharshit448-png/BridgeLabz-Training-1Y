package com.gla.inheritance.problem8;

public class Main {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("SA123", 10000, 4.0);
        BankAccount ca = new CheckingAccount("CA456", 50000, 20000);
        BankAccount fd = new FixedDepositAccount("FD789", 100000, 12);

        sa.displayDetails();
        sa.displayAccountType();
        System.out.println("---");
        ca.displayDetails();
        ca.displayAccountType();
        System.out.println("---");
        fd.displayDetails();
        fd.displayAccountType();
    }
}

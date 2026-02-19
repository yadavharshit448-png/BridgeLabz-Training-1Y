package com.gla.inheritance.problem8;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

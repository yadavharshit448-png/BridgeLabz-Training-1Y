package com.gla.encapsulation.problem4;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

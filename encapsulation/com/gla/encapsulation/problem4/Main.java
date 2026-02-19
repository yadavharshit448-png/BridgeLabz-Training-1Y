package com.gla.encapsulation.problem4;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "John", 10000, 4.0);
        sa.deposit(5000);
        System.out.println("Savings Interest: " + sa.calculateInterest());

        CurrentAccount ca = new CurrentAccount(2001, "BusinessCorp", 50000, 100000);
        ca.withdraw(20000);
        System.out.println("Current Account Interest: " + ca.calculateInterest());
        System.out.println("Loan Eligibility: " + ca.calculateLoanEligibility());
    }
}

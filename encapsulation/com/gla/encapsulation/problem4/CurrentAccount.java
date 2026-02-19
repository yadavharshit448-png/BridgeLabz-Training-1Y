package com.gla.encapsulation.problem4;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(long accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Current accounts usually don't declare interest, or very low.
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for loan: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Example logic
    }
}

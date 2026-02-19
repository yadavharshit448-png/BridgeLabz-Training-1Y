package com.gla.inheritance.problem8;

public class FixedDepositAccount extends BankAccount {
    private int lockPeriodMonths;

    public FixedDepositAccount(String accountNumber, double balance, int lockPeriodMonths) {
        super(accountNumber, balance);
        this.lockPeriodMonths = lockPeriodMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account (Lock Period: " + lockPeriodMonths + " months)");
    }
}

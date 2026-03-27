package com.gla;

class BankAccount {
    private String accountHolderName;
    private int balance;

    public BankAccount(String name, int initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    public synchronized void checkBalance(String userType) {
        System.out.println(userType + " user is checking balance for account: " + accountHolderName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(userType + " user finished checking. Balance: $" + balance);
    }
}

class UserThread implements Runnable {
    private BankAccount account;
    private String userType;

    public UserThread(BankAccount account, String userType) {
        this.account = account;
        this.userType = userType;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Check " + i + " by " + userType + " [Priority: " + Thread.currentThread().getPriority() + "] ---");
            account.checkBalance(userType);
        }
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);

        Thread premiumUser = new Thread(new UserThread(account, "Premium"));
        premiumUser.setPriority(10); // MAX_PRIORITY

        Thread regularUser = new Thread(new UserThread(account, "Regular"));
        regularUser.setPriority(5);  // NORM_PRIORITY

        Thread basicUser = new Thread(new UserThread(account, "Basic"));
        basicUser.setPriority(1);   // MIN_PRIORITY

        premiumUser.start();
        regularUser.start();
        basicUser.start();
    }
}

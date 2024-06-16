package com.ix_edtech;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit.");
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}


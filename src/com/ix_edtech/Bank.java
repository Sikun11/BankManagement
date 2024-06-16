package com.ix_edtech;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createSavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        accounts.add(new SavingsAccount(accountNumber, initialBalance, interestRate));
    }

    public void createCheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        accounts.add(new CheckingAccount(accountNumber, initialBalance, overdraftLimit));
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccountType(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.displayAccountType();
        } else {
            System.out.println("Account not found.");
        }
    }
}


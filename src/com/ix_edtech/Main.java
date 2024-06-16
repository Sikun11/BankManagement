package com.ix_edtech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bank Menu:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Display Account Type");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String savingsAccountNumber = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double savingsInitialBalance = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double interestRate = scanner.nextDouble();
                    bank.createSavingsAccount(savingsAccountNumber, savingsInitialBalance, interestRate);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String checkingAccountNumber = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double checkingInitialBalance = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    bank.createCheckingAccount(checkingAccountNumber, checkingInitialBalance, overdraftLimit);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String depositAccountNumber = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    String withdrawAccountNumber = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccountNumber, withdrawAmount);
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    String balanceAccountNumber = scanner.nextLine();
                    bank.checkBalance(balanceAccountNumber);
                    break;
                case 6:
                    System.out.print("Enter account number: ");
                    String accountTypeNumber = scanner.nextLine();
                    bank.displayAccountType(accountTypeNumber);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


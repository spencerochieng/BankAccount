/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ochieng
 */
public class BankAccount {
    // Attributes (variables)
    double balance;
    String accountNumber;
    String accountHolder;
    
    // Methods (actions/functions)
    
    // Deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: $" + amount);
    }
    
    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds! You only have: $" + balance);
        }
    }
    
    // Check balance
    void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }
    
    // Display account info
    void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("==========================");
    }
}

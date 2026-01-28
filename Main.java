/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ochieng
 */
public class Main {
    public static void main(String args[]) {
        // Create a bank account object
        BankAccount myAccount = new BankAccount();
        
        // Set account details
        myAccount.accountHolder = "John Doe";
        myAccount.accountNumber = "ACC123456";
        myAccount.balance = 1000.00;  // Starting balance
        
        // Display initial info
        myAccount.displayAccountInfo();
        
        // Make a deposit
        myAccount.deposit(500.00);
        myAccount.checkBalance();
        
        // Make a withdrawal
        myAccount.withdraw(200.00);
        myAccount.checkBalance();
        
        // Try to withdraw more than balance
        myAccount.withdraw(2000.00);
        
        // Display final info
        myAccount.displayAccountInfo();
    }
}
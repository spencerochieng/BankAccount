import java.util.Scanner;

public class BankAccount {
    // Attributes
    double balance;
    String accountNumber;
    String accountHolder;
    Scanner scanner = new Scanner(System.in);
    
    // Constructor to initialize account
    public BankAccount() {
        this.balance = 0.0;  // Start with zero balance
    }
    
    // Method to setup account details
    void setupAccount() {
        System.out.println("\n=== ACCOUNT SETUP ===");
        System.out.print("Enter Account Holder Name: ");
        this.accountHolder = scanner.nextLine();
        
        System.out.print("Enter Account Number: ");
        this.accountNumber = scanner.nextLine();
        
        System.out.println("Account setup complete!");
        System.out.println("Welcome, " + this.accountHolder + "!");
        System.out.println("Your initial balance is: $" + this.balance + "\n");
    }
    
    // Deposit money with validation
    void deposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(" Successfully deposited: $" + amount);
            System.out.println("   New balance: $" + balance);
        } else {
            System.out.println("Invalid amount! Deposit must be greater than $0");
        }
        scanner.nextLine();  // Clear buffer
    }
    
    // Withdraw money with validation
    void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Invalid amount! Withdrawal must be greater than $0");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
            System.out.println("   Available balance: $" + balance);
            System.out.println("   Requested amount: $" + amount);
            System.out.println("   Shortfall: $" + (amount - balance));
        } else {
            balance = balance - amount;
            System.out.println("Successfully withdrawn: $" + amount);
            System.out.println("   New balance: $" + balance);
        }
        scanner.nextLine();  // Clear buffer
    }
    
    // Check balance
    void checkBalance() {
        System.out.println("\n══════════════════════════");
        System.out.println("   CURRENT BALANCE");
        System.out.println("══════════════════════════");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: $" + balance);
        System.out.println("══════════════════════════\n");
    }
    
    // Display account info
    void displayAccountInfo() {
        System.out.println("\n══════════════════════════════════");
        System.out.println("        ACCOUNT INFORMATION");
        System.out.println("══════════════════════════════════");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
       
        System.out.println("══════════════════════════════════\n");
    }
    
    // Display menu and get user choice
    int displayMenu() {
        System.out.println("\n══════════════════════════════════");
        System.out.println("        BANKING MENU");
        System.out.println("══════════════════════════════════");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. View Account Information");
        System.out.println("5. Exit");
        System.out.println("══════════════════════════════════");
        
        System.out.print("Select an option (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Clear buffer
        
        return choice;
    }
}
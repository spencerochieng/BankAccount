import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║    WELCOME TO JAVA BANK SYSTEM   ║");
        System.out.println("╚══════════════════════════════════╝");
        
        // Create a new bank account
        BankAccount myAccount = new BankAccount();
        
        // Setup account details
        myAccount.setupAccount();
        
        boolean running = true;
        
        // Main program loop
        while (running) {
            int choice = myAccount.displayMenu();
            
            // Control structure to handle user choice
            if (choice == 1) {
                // Deposit
                myAccount.deposit();
                
            } else if (choice == 2) {
                // Withdraw
                myAccount.withdraw();
                
            } else if (choice == 3) {
                // Check balance
                myAccount.checkBalance();
                
            } else if (choice == 4) {
                // View account info
                myAccount.displayAccountInfo();
                
            } else if (choice == 5) {
                // Exit program
                System.out.println("\n══════════════════════════════════");
                System.out.println("   THANK YOU FOR BANKING WITH US!");
                System.out.println("══════════════════════════════════");
                
                // Final account summary
                System.out.println("\n=== FINAL ACCOUNT SUMMARY ===");
                myAccount.displayAccountInfo();
                System.out.println("Goodbye, " + myAccount.accountHolder + "!");
                
                running = false;  // Exit the loop
                
            } else {
                // Invalid choice
                System.out.println("Invalid option! Please select 1-5");
            }
            
            // Ask to continue (only if not exiting)
            if (running && choice != 5) {
                System.out.print("\nPerform another transaction? (yes/no): ");
                String continueChoice = scanner.nextLine().toLowerCase();
                
                if (continueChoice.equals("no") || continueChoice.equals("n")) {
                    System.out.println("\n══════════════════════════════════");
                    System.out.println("   THANK YOU FOR BANKING WITH US!");
                    System.out.println("══════════════════════════════════");
                    myAccount.displayAccountInfo();
                    running = false;
                }
            }
        }
        
        scanner.close();
        System.out.println("\nProgram ended. Have a nice day!");
    }
}
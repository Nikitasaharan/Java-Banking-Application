public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String email;
    String phoneNumber;
    String address;

    // Constructor
    public Account(int accountNumber, String accountHolderName, double balance, String email, String phoneNumber, String address) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully! New Balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully! Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    // Display details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    // Update contact details
    public void updateContactDetails(String email, String phoneNumber, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        System.out.println("Contact Details updated successfully!");
    }
}

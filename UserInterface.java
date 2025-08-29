import java.util.Scanner;

public class UserInterface {
    Account[] accounts = new Account[100]; //  store accounts
    int accountCount = 0;
    Scanner sc = new Scanner(System.in);

    // Create account
    public void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        accounts[accountCount] = new Account(accNum, name, balance, email, phone, address);
        accountCount++;
        System.out.println("Account created successfully!");
    }

    // Deposit
    public void performDeposit() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNum) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    // Withdraw
    public void performWithdrawal() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNum) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    // Show details
    public void showAccountDetails() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNum) {
                accounts[i].displayAccountDetails();
                return;
            }
        }
        System.out.println("Account not found!");
    }

    // Update contact
    public void updateContact() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNum) {
                System.out.print("Enter new Email: ");
                String email = sc.nextLine();
                System.out.print("Enter new Phone Number: ");
                String phone = sc.nextLine();
                System.out.print("Enter new Address: ");
                String address = sc.nextLine();

                accounts[i].updateContactDetails(email, phone, address);
                return;
            }
        }
        System.out.println("Account not found!");
    }

  
    public void mainMenu() {
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n===== Banking Application =====");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: performDeposit(); break;
                case 3: performWithdrawal(); break;
                case 4: showAccountDetails(); break;
                case 5: updateContact(); break;
                case 6: System.out.println("Exiting... Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    // Main
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}



//slip 7 Q1

import java.util.Scanner;

class Bank {
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public Bank(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Deposit operation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Withdrawal operation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    // Get balance operation
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: $" + balance);
    }
}

public class main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Bank object
        Bank myAccount = new Bank("John Doe", 1000.0);

        // Perform operations
        myAccount.displayAccountDetails();

        System.out.print("\nEnter the amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("\nEnter the amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        // Display final account details
        myAccount.displayAccountDetails();

        scanner.close();
    }
}



//slip 7 Q2

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the text file: ");
        String filePath = scanner.nextLine();

        try {
            // Read the contents of the file
            String fileContents = readFileContents(filePath);

            // Display the contents in reverse order
            System.out.println("\nOriginal Contents:");
            System.out.println(fileContents);

            // Display the contents in reverse order and change case
            System.out.println("\nReversed Contents with Changed Case:");
            displayReversedAndChangedCase(fileContents);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String readFileContents(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static void displayReversedAndChangedCase(String content) {
        StringBuilder reversedContent = new StringBuilder(content).reverse();
        StringBuilder changedCaseContent = new StringBuilder();

        for (char c : reversedContent.toString().toCharArray()) {
            if (Character.isUpperCase(c)) {
                changedCaseContent.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                changedCaseContent.append(Character.toUpperCase(c));
            } else {
                changedCaseContent.append(c);
            }
        }

        System.out.println(changedCaseContent.toString());
    }
}

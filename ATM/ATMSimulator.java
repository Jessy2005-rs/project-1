import java.util.Scanner;

public class ATMSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000; // initial balance
        int choice;
        double amount;

        System.out.println("Welcome to Simple ATM Simulator");
        System.out.println("--------------------------------");

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice(Enter 1 to 4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = sc.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM Simulator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

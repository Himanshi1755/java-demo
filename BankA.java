import java.util.Scanner;

public class BankA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Account details
        String accountNo;
        double balance = 500.00; // Default starting balance of 500
        int choice;
        double amount;

        // Input the account number
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextLine();  // Capture the account number (e.g., 12345)

        // Loop to display menu and perform actions
        while (true) {
            //System.out.println("");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Show Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Deposited " + amount + "\nAfter Deposite Current Balance is " + balance);
System.out.println();
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawl " + amount + "\nAfter Withdrawl Balance is " + balance);
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 3:
                    // Show account details
System.out.println();
                    System.out.println("Account No: " + accountNo + " \nCurrent balance is " + balance);
System.out.println();

                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting... Thank you for using our banking services!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

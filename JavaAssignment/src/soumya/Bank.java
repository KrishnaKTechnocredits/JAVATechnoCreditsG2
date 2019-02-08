package soumya;

import java.util.Scanner;

public class Bank {
	long account_no;
	int choice;
	double amount;
	double amountDep, amountWithdraw;
	String name;
	Scanner sc = new Scanner(System.in);

	// Method for getting input from user
	void inputOutput() {
		System.out.println("Enter account number: ");
		account_no = sc.nextLong();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter amount: ");
		amount = sc.nextInt();
	}

	// Method for inserting data
	void insertData() {
		System.out.println("Enter account number: ");
		account_no = sc.nextLong();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter amount: ");
		amount = sc.nextInt();
		System.out.println("Data inserted successfully");
	}

	// Method for depositing amount
	void deposit() {
		System.out.println("Enter amount to deposit: ");
		amountDep = sc.nextDouble();
		amount = amount + amountDep;
		System.out.println("Rs " + amount + " deposited to your account");
		System.out.println("Your current balance is: " + "Rs " + amount);
	}

	// Method for withdrawing amount
	void withdraw() {
		System.out.println("Enter amount to withdraw: ");
		amountWithdraw = sc.nextDouble();
		double amount1 = amount - amountWithdraw;

		if (amountWithdraw > amount) {
			System.out.println("Insufficient amount in account");
			System.out.println("Your current balance is: " + "Rs " + amount);
		} else if (amountWithdraw <= amount) {
			System.out.println("Rs " + amountWithdraw + " withdrawn from your account");
			System.out.println("Your current balance is: " + "Rs " + amount1);
		}
	}

	// Method for checking balance
	void checkBalance() {
		System.out.println("Current Balance in Account Number: " + account_no + " is " + "Rs " + amount);
	}

	// Method for displaying details
	void displayDetails() {
		System.out.println("Account Number is: " + account_no);
		System.out.println("Account Holder Name is: " + name);
		System.out.println("Current balance is: " + "Rs " + amount);
	}

	// Method for selecting user choice
	void check() {
		System.out.println("Select operations from below options:");
		System.out.println("Press 1 : For inserting data");
		System.out.println("Press 2 : For deposit");
		System.out.println("Press 3 : For withdraw");
		System.out.println("Press 4 : For checkbalance");
		System.out.println("Press 5 : For displayDetails");
		System.out.println("Enter your Choice: ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			insertData();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			checkBalance();
			break;
		case 5:
			displayDetails();
			break;
		default:
			System.out.println("Invalid Choice Entered");
		}
	}
}

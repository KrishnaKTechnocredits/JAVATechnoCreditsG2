package arpit;

import java.util.Scanner;

public class BankQ2 {

	String account_no;
	String name;
	int balance;
	Scanner sc = new Scanner(System.in);

	void detailsOfClient(int a) {
		switch (a) {
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
		}
	}

	// This method gives all details of the bank client.
	void insertData() {

		System.out.println("Enter your name: ");
		this.name = sc.next();

		System.out.println("Enter your Account number: ");
		this.account_no = sc.next();

		System.out.println("Credit your account with some initial ammount: ");
		this.balance = sc.nextInt();

		displayDetails();
	}

	// This method perform the deposit function.
	void deposit() {

		if (this.account_no == null) {

			System.out.println("Please Provide the below information for deposit in your account");
			insertData();
		}

		System.out.println("Enter the ammount which you want to deposit: ");
		int ammount = sc.nextInt();

		this.balance = balance + ammount;
		System.out.println("Your Current balance is: " + balance);

	}

	// This method perform the withdraw function
	void withdraw() {

		if (this.account_no == null) {

			System.out.println("Please Provide the below information for withdraw from your account");
			insertData();
		}

		// System.out.println("Enter the amount for withdraw: ");
		if (this.balance == 0) {

			System.out.println("Your account not have enough balance for withdraw");
			deposit();
		}

		else {

			System.out.println("Enter the ammount for withdraw: ");
			int ammount = sc.nextInt();

			if (this.balance > ammount) {

				this.balance = balance - ammount;
				System.out.println("Your current balance is: " + balance);
			}
		}

	}

	// This method perform balance enquire function.
	void checkBalance() {

		if (this.account_no == null)
			insertData();
		System.out.println("Your current balance is: " + balance);

	}

	// This method show the details of the client.
	void displayDetails() {

		System.out.println("Name of the account holder: " + name);
		System.out.println("Account number: " + account_no);
		System.out.println("Amount in the account: " + balance);

	}

}

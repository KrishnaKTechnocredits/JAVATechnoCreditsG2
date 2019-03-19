package swapnali;

import java.util.Scanner;

public class Q2_Set2_BankDetails {
	long account_no;
	int choice;
	double amount;
	double depAmount, witAmount;
	String name;
	static Scanner sc = new Scanner(System.in);
	
	void insertData() 
	{
		System.out.println("Enter account number: ");
		account_no = sc.nextLong();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter amount: ");
		amount = sc.nextInt();
	}


	void deposit() 
	{
		System.out.println("Enter amount to deposit: ");
		depAmount = sc.nextDouble();
		amount = amount + depAmount;
		System.out.println("Your current balance is: "+ amount);
	}

	
	void withdraw() 
	{
		System.out.println("Enter amount to withdraw: ");
		witAmount = sc.nextDouble();
		double withdraw = amount - witAmount;

		if (witAmount > amount) 
		{
			System.out.println("Insufficient balance");
			System.out.println("Your current balance is: "+ amount);
		}
		else if (witAmount <= amount) 
		{
			System.out.println("Amount withdrawn is: "+amount);
			System.out.println("Your current balance is: " + withdraw);
		}
	}

	
	void checkBalance() 
	{
		System.out.println("Current Balance is: "+ amount);
	}

	
	void displayDetails() {
		System.out.println("Account Number is: " + account_no);
		System.out.println("Account Holder Name is: " + name);
		System.out.println("Current balance is: "+ amount);
	}

	void OperationChoice() 
	{
		System.out.println("Menu: ");
		System.out.println("1.Insert data");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Checkbalance");
		System.out.println("5.DisplayDetails");
		System.out.println("6.Exit");
		do{
			System.out.println("Enter your choice: ");
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
			case 0:
				break;
			default:
				System.out.println("Invalid Choice");
		}
		
		}while(choice!=0);
	}
}

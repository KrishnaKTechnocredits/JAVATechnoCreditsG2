/* Service class for Bank where we insert data customer details, deposit amount in account, withdrawn amount, check updated balance and display account details */
package purva;

import java.util.Scanner;

public class Purva_Assign3_BankService_q2 {
	int account_no;
	String name;
	double amount;
	double amount_dep, amount_withdr;

	/* Inserts a/c no., name and balance in insertData method */
	void insertData() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\n" + "Enter account number of customer: ");
		account_no = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter name of customer: ");
		name = sc2.next();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter intial balance of customer: ");
		amount = sc3.nextDouble();
	}

	/* Method to deposit amount to customer's account */
	void deposit() {
		Scanner sc4 = new Scanner(System.in);
		System.out.println("\n" + "Enter amount to be deposited");
		amount_dep = sc4.nextDouble();
		amount = amount + amount_dep;
	}

	/* Mehtod to withdraw amount from customer's account */
	void withdraw() {
		Scanner sc5 = new Scanner(System.in);
		System.out.println("\n" + "Enter amount to be withdrawn");
		amount_withdr = sc5.nextDouble();
		if (amount_withdr < 0) {
			System.out.println("Invalid amount entered. Please enter valid postive amount");
			Scanner sc6 = new Scanner(System.in);
			System.out.println("\n" + "Enter amount to be withdrawn");
			amount_withdr = sc6.nextDouble();
		}
		if (amount == 0)
			System.out.println("Amount can't be withdrawn as your account has 0 balance");
		else if (amount > amount_withdr && amount != 0)
			amount = amount - amount_withdr;
		else
			System.out.println(
					"There is insufficient balance in your account. Kindly withdraw amount less than Rs. " + amount);
	}

	/* Method to check updated amount in customer's account */
	void checkBalance() {
		System.out.println("Current balance in customer's account = " + amount);
	}

	/* Method display's updated customer details */
	
	void displayDetails() {

		System.out.println("\n" + "Account details of customer are as below : ");
		System.out.println("Account Number of customer is: " + account_no);
		System.out.println("Name of customer is : " + name);
		System.out.println("Current amount available in customers account = " + (float) amount);
	}
}

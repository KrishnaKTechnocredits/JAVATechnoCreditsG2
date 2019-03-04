/* client Bank class which calls all services/ methods written in Service class */
package purva;

import java.util.Scanner;

public class Purva_Assign3_BankClient_q2 {
	public static void main(String[] args) {
		Purva_Assign3_BankService_q2 obj1 = new Purva_Assign3_BankService_q2();
		char choice;
		int option;
		do {
			System.out.println("\nWelcome to Java Bank");
			System.out.println("Menu:");
			System.out.println("1. Insert customer data");
			System.out.println("2. Deposit amount in account");
			System.out.println("3. Withdraw amount from account");
			System.out.println("4. Check updated account balance");
			System.out.println("5. Display customer account details");
			System.out.println("\n" + "Enter your choice from above menu (enter 1,2...5)");

			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {
			case 1:
				obj1.insertData();
				break;
			case 2:
				obj1.deposit();
				break;
			case 3:
				obj1.withdraw();
				break;
			case 4:
				obj1.checkBalance();
				break;
			case 5:
				obj1.displayDetails();
				break;
			default:
				System.out.println("Invalid choice!!");
			}
			/*
			 * Below Lines of code ask if user wants to continue further or end
			 * the program
			 */
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n" + "Do you want to continue (y or n): ");
			choice = sc2.next().charAt(0);
		} while ((choice == 'y') || (choice == 'y'));
	}
}

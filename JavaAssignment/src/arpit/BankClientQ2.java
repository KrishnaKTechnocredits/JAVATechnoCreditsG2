package arpit;

import java.util.Scanner;

public class BankClientQ2 {

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Menu options
		System.out.println("1-Insert Data, 2-Deposit, 3- Withdraw, 4-Check Balance");
		System.out.println("Select the options from above to check your account details: ");

		// Take the options from user from given menu options.
		int number = sc.nextInt();

		// Creating object of class
		BankQ2 bankQ2 = new BankQ2();

		// Call detailsOfClient method and provide options as a input.
		bankQ2.detailsOfClient(number);

	}

}

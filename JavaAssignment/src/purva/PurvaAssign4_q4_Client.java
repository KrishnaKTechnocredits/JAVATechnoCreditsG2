/*WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30
*/
package purva;

import java.util.Scanner;

public class PurvaAssign4_q4_Client {
	public static void main(String[] args) {
		char option = 'y';
		do {
			int tempnum;
			System.out.println("\nEnter number: ");
			Scanner sc1 = new Scanner(System.in);
			int num = sc1.nextInt();

			// calls code to count no of digits in input no
			tempnum = num;
			PurvaAssign4_q4_Service obj2 = new PurvaAssign4_q4_Service();
			int count = obj2.countOfDigit(tempnum);

			// calls code to add each digit present in input no
			PurvaAssign4_q4_Service obj1 = new PurvaAssign4_q4_Service();
			int ans = obj1.sumofDigitsinNo(tempnum, count);
			System.out.println("Sum of given number:- " + ans);

			System.out.println("\n" + "Do you want to continue(y/n): ");
			Scanner sc = new Scanner(System.in);
			option = sc.next().charAt(0);
		} while (option == 'y' || option == 'Y');

		if (option == 'n' || option == 'N') {
			System.out.println("Program has ended!!");
		}

	}

}

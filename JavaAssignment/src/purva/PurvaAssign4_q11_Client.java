/*WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and backward
i.e. actual number :- 12321
*/
package purva;

import java.util.Scanner;

public class PurvaAssign4_q11_Client {
	public static void main(String[] args) {
		char ans = 0;
		do {
			System.out.println("**Program to find if Number is Palindrome or not**");
			System.out.println("\n" + "Enter number: ");
			Scanner sc1 = new Scanner(System.in);
			int num = sc1.nextInt();

			Purva_Assign4_q11_Service obj1 = new Purva_Assign4_q11_Service();
			obj1.numberIsPalindrome(num);
			System.out.println("\n" + "Do you want to continue(y/n): ");
			Scanner sc2 = new Scanner(System.in);
			ans = sc1.next().charAt(0);
		} while (ans == 'y' || ans == 'Y');

		if (ans == 'n' || ans == 'N') {
			System.out.println("Program has ended!!");
		}

	}

}

/*WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. char value :- e
c. count of e :- 5*/

package purva;

import java.util.Scanner;

public class PurvaAssign4_q3_Client {
	public static void main(String[] args) {
		String option;
		do {
			System.out.println("User string:- ");
			Scanner sc1 = new Scanner(System.in);
			String inp = sc1.nextLine();

			System.out.println("Enter character which you want to find in a given string:- ");
			Scanner sc2 = new Scanner(System.in);
			char ch = sc1.next().charAt(0);

			//below code calls method which checks occurrence of character in input string
			PurvaAssign4_q3_Service obj1 = new PurvaAssign4_q3_Service();
			int cnt = obj1.countOfChar(inp, ch);
			System.out.println("Count of " + ch + " = " + cnt);

			System.out.println("\n" + "Do you want to continue (y/n): ");
			Scanner sc3 = new Scanner(System.in);
			option = sc3.next();
		} while (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y"));

		if (option.equalsIgnoreCase("n")) {
			System.out.println("Program has ended!!");
		}
	}
}

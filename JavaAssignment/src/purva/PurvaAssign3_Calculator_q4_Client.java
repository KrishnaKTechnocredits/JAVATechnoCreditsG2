/* Write a Java Program and create Calculator using switch statement */

package purva;

import java.util.Scanner;

public class PurvaAssign3_Calculator_q4_Client {

	public static void main(String[] args) {

		int option;
		do {

			System.out.println("\n" + "Calculator program");
			System.out.println("Please select any one option from below menu. Please enter numeric no 1 or 2....5");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. End the program");

			Scanner sc3 = new Scanner(System.in);
			option = sc3.nextInt();

			/*
			 * creating object of service class and calling all methods defined
			 * in service class via object obj2
			 */
			PurvaAssign3_Calculator_q4_Service obj2 = new PurvaAssign3_Calculator_q4_Service();

			switch (option) {
			
			/* switch case option for addition */
			case 1:
				obj2.add();
				break;

			/* switch case option for subtraction */
			case 2:
				obj2.sub();
				break;

			/* switch case option for multiplication */
			case 3:
				obj2.multiply();
				break;

			/* switch case option for division */
			case 4:
				obj2.division();
				break;

			/* switch case option for ending the program */
			case 5:
				System.out.println("\n" + "Program has ended");
				System.exit(0);
				break;

			/* switch case option for informing user that an invalid option has been selected */
			default:
				System.out.println("You have entered invalid option, please select valid menu from 1 to 5 only");
				break;

			}
		} while (true);
	}
}

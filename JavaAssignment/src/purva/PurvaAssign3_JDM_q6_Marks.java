/*
 * WAP to input student marks by condition :
Marks is greater than 0 and less than 50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100 Distinction
 */

package purva;

import java.util.Scanner;

public class PurvaAssign3_JDM_q6_Marks {
	public static void main(String[] args) {
		double marks = 0;
		char choice;
		PurvaAssign3_JDM_q6_Marks obj1 = new PurvaAssign3_JDM_q6_Marks();

		/*
		 * This loop will ask the user to input number and print the result.
		 * Also it will ask the user if they want to continue with the program
		 * or end the program
		 */
		do {
			System.out.println("\n" + "Enter Student marks b: ");
			Scanner sc = new Scanner(System.in);
			marks = sc.nextDouble();
			obj1.resultCalculator(marks);
			Scanner sc1 = new Scanner(System.in);
			System.out.print("\n" + "Do you want to continue. Enter Y for yes or N for no: ");
			choice = sc1.next().charAt(0);
		} while ((choice == 'y') || (choice == 'Y'));

	}

	/*
	 * this method will take marks as input and print the result as per
	 * condition
	 */
	void resultCalculator(double mks) {
		if (mks >= 0 && mks <= 50)
			System.out.println("As you have received " + mks + " marks, your result is FAILED");
		else if (mks > 50 && mks <= 75)
			System.out.println("As you have received " + mks + " marks, your result is 1st CLASS");
		else if (mks > 75 && mks <= 100)
			System.out.println("As you have received " + mks + " marks, your result is DISTINCTION");
		else if (mks < 0 || mks > 100)
			System.out.println("Invalid input");
	}
}
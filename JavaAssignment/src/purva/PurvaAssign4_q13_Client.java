/*WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number it self.*/

package purva;

import java.util.Scanner;

public class PurvaAssign4_q13_Client {
	public static void main(String[] args) {
		char ch = 0;
		do {
			System.out.println("Enter number: ");
			Scanner sc1 = new Scanner(System.in);
			int num = sc1.nextInt();

			// calls code which check if num is amstrong no.
			Purva_q13_Service obj1 = new Purva_q13_Service();
			obj1.amstrongNumber(num);

			// asks if user want to end program continue
			System.out.println("\n" + "Do you want to continue(y/n): ");
			Scanner sc2 = new Scanner(System.in);
			ch = sc2.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		if (ch == 'N' || ch == 'n') {
			System.out.println("Program has ended");
		}
	}

}

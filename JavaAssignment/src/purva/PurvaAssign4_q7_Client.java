/*WAP to find Fibonacci series for user defined number
a. Input number :- 5
b. Output :- 120
*/
package purva;

import java.util.Scanner;

public class PurvaAssign4_q7_Client {
	public static void main(String[] args) {
		char ch;
		do {
			System.out.println("\nEnter number: ");
			Scanner sc1 = new Scanner(System.in);
			int num = sc1.nextInt();

			PurvaAssign4_q7Service obj1 = new PurvaAssign4_q7Service();
			int fibonacciOfNum = obj1.fibonacciOfNum(num);

			System.out.println("Fibonnace series multiplication of input number " + num + " = " + fibonacciOfNum);
			System.out.println("\n" + "Do to you want to continue: ");
			Scanner sc2 = new Scanner(System.in);
			ch = sc2.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		if (ch == 'n' || ch == 'N')
			System.out.println("Program has ended!!");
	}

}

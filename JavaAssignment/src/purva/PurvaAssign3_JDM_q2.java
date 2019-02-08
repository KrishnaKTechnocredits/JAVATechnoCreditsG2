/* Find greater of two numbers using ternary operator. */

package purva;

import java.util.Scanner;

public class PurvaAssign3_JDM_q2 {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		Scanner sc2 = new Scanner(System.in);
		double num2 = sc2.nextDouble();
		double result = 0;
		result = (num1 > num2) ? num1 : num2;
		if (result == num1)
			System.out.println("\n" + "Greatest of 2 numbers is first number: " + result);
		else
			System.out.println("\n" + "Greatest of 2 numbers is second number: " + result);
	}
}

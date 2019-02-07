/* This is a service class containing all methods which are called by Client class of calculator program */
package purva;

import java.util.Scanner;

public class PurvaAssign3_Calculator_q4_Service {

	/* Method for adding 2 numbers */
	void add() {
		System.out.println("\n" + "Enter first number = ");
		Scanner sc1 = new Scanner(System.in);
		float num1 = sc1.nextFloat();
		System.out.println("Enter second number = ");
		Scanner sc2 = new Scanner(System.in);
		float num2 = sc2.nextFloat();
		System.out.println("Addition of numbers " + num1 + " and " + num2 + " = " + (num1 + num2));
	}

	/* Method for subtracting 2 numbers */
	void sub() {
		System.out.println("\n" + "Enter first number = ");
		Scanner sc1 = new Scanner(System.in);
		float num1 = sc1.nextFloat();
		System.out.println("Enter second number = ");
		Scanner sc2 = new Scanner(System.in);
		float num2 = sc2.nextFloat();
		System.out.println("Subtraction of numbers " + num1 + " and " + num2 + " = " + (num1 - num2));
	}

	/* Method for multiplying 2 numbers */
	void multiply() {
		System.out.println("\n" + "Enter first number = ");
		Scanner sc1 = new Scanner(System.in);
		float num1 = sc1.nextFloat();
		System.out.println("Enter second number = ");
		Scanner sc2 = new Scanner(System.in);
		float num2 = sc2.nextFloat();
		System.out.println("Multiplication of numbers " + num1 + " and " + num2 + " = " + (num1 * num2));
	}

	/* Method for dividing 2 numbers */
	void division() {
		System.out.println("\n" + "Enter first number = ");
		Scanner sc1 = new Scanner(System.in);
		float num1 = sc1.nextFloat();
		System.out.println("Enter second number = ");
		Scanner sc2 = new Scanner(System.in);
		float num2 = sc2.nextFloat();
		System.out.println("Division of numbers " + num1 + " and " + num2 + " = " + (num1 / num2));
	}
}

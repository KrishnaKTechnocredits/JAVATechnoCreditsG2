/*
 * This Program will find factorial of given number
 */
package soumya;

import java.util.Scanner;

public class Factorial_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		sc.close();
		Factorial_Service fact = new Factorial_Service();
		int factorial = fact.calculateFactorial(num);
		System.out.println("Factorial is: " + factorial);
	}
}

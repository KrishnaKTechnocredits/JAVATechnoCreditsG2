package soumya;

import java.util.Scanner;

public class Sqrtandcube_Service {
	double a;

	// Method for getting input from user
	void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextDouble();
	}

	// Method for finding square root of any number
	void sqrt() {
		System.out.println("Square root is: ");
		System.out.println(a * a);
	}

	// Method for finding cube of any number
	void cube() {
		System.out.println("Cube is: ");
		System.out.println(a * a * a);
	}
}
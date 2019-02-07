package soumya;

import java.util.Scanner;

public class InterestCalculation_Service {
	static double p, r, t;

	// Method for getting input from user
	static void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		p = sc.nextDouble();
		System.out.println("Enter Rate: ");
		r = sc.nextDouble();
		System.out.println("Enter Time: ");
		t = sc.nextDouble();
	}

	// Method for calculating interest
	void interestCalculator() {
		scannerInput();
		System.out.println("Simple Interest is: ");
		System.out.println((p * r * t) / 100);
	}
}

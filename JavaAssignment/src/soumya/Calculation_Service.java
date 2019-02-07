package soumya;

import java.util.Scanner;

public class Calculation_Service {
	double fNo, sNo;

	// Method for getting input from user
	void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		fNo = sc.nextDouble();
		System.out.print("Enter Second Number:");
		sNo = sc.nextDouble();
	}

	// Method calculating addition
	void sum() {
		System.out.println("Sum is: ");
		System.out.println(fNo + sNo);
	}

	// Method calculating subtraction
	void subtract() {
		System.out.println("Subtraction is: ");
		System.out.println(fNo - sNo);
	}

	// Method calculating multiplication
	void multiply() {
		System.out.println("Multiplication is: ");
		System.out.println(fNo * sNo);
	}

	// Method calculating division
	void divide() {
		System.out.println("Division is: ");
		System.out.println(fNo / sNo);
	}

	// Method calculating remainder
	void remainder() {
		System.out.println("Remainder is: ");
		System.out.println(fNo % sNo);
	}
}

package soumya;

import java.util.Scanner;

public class Calculator_Service {
	double num1, num2;
	int choice;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for calculation: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("Select operations from below options:");
		System.out.println("Press 1 : For Addition");
		System.out.println("Press 2 : For Subtraction");
		System.out.println("Press 3 : For Multipliaction");
		System.out.println("Press 4 : For Division");
		System.out.println("Press 5 : For Remainder");
		System.out.println("Enter your Choice: ");
		choice = sc.nextInt();
		sc.close();
	}

	// Method for getting calculations
	void calculator() {
		InputOutput();
		switch (choice) {
		case 1:
			System.out.println("Calculation is: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Calculation is: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Calculation is: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Calculation is: " + (num1 / num2));
			break;
		case 5:
			System.out.println("Calculation is: " + (num1 % num2));
			break;
		default:
			System.out.println("Choice not found");
		}
	}
}

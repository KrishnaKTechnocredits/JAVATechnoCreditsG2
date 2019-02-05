package monali;

import java.util.Scanner;

public class CalculatorSwitch {
	static void calSwitch() {
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter two numbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("Enter operation user want to perform: ");
		String choice = sc.next();
		sc.close();
		switch (choice) {
		case "addition":
			result = num1 + num2;
			break;
		case "substraction":
			result = num1 - num2;
			break;
		case "multiplication":
			result = num1 * num2;
			break;
		case "division":
			result = num1 / num2;
			break;
		default:
			System.out.println("Given choice not valid case");
		}
		System.out.println("Result of given choice: " + result);
	}

	public static void main(String[] args) {
		calSwitch();

	}
}

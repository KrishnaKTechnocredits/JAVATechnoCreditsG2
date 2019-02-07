package arpit;

import java.util.Scanner;

public class CalculatorUsingSwitchQ4 {

	// This function perform all the operation and show the result of that
	// operation
	void calculator(int operation, float num1, float num2) {

		switch (operation) {
		case 1:
			float sum = num1+num2;
			System.out.println("Sum of numbers is: " + sum);
			break;
		case 2:
			float diff = num1-num2;
			System.out.println("Difference of numbers is: " + diff);
			break;
		case 3:
			float mul = num1*num2;
			System.out.println("Multiplication is: " + mul);
			break;
		case 4:
			double div = num1/num2;
			System.out.println("Divion is: " + div);
			break;
		case 5:
			float modulus = num1 % num2;
			System.out.println("Modulo is: " + modulus);
			break;
		default:
			System.out.println("Operation and Input not given properly");

		}
	}

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Display the menu of all the operations
		System.out.println("Menu of Operation is: ");
		System.out.println("1-addition ,2-substraction, 3-multiplication, 4-division, 5-modulus");

		System.out.println("Enter the operation number which you want to perform ");

		// choose the number by the user to perform that operation
		int operation = sc.nextInt();

		System.out.println("Enter the first number");

		// Take the first number from user
		float number1 = sc.nextInt();

		System.out.println("Enter the second number");

		// Take the second number from user
		float number2 = sc.nextInt();

		// Creating object of the class
		CalculatorUsingSwitchQ4 calculatorSwitch = new CalculatorUsingSwitchQ4();

		// To call the calculator method and provide input to that method
		calculatorSwitch.calculator(operation, number1, number2);
		sc.close();

	}

}

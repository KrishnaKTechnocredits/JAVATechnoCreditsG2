package arpit;

import java.util.Scanner;

public class GreaterNumberUsingTernaryOperator {

	// This function perform the operation to find the greater number by using
	// ternary operator
	int ternaryOperator(int number1, int number2) {
		
		int result = 0;

		result = (number1 > number2) ? number1 : number2;
		return result;
	}

	// This function display the greater number among two number
	void display(int result) {

		System.out.println("Largest number is : " + result);
	}

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		// Take first number from user
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		// Take second number from user
		int num2 = sc.nextInt();

		// Creating object of class
		GreaterNumberUsingTernaryOperator greaterNumber = new GreaterNumberUsingTernaryOperator();
		// To call ternary operator method and provide input to that method
		int result = greaterNumber.ternaryOperator(num1, num2);

		// To call display method and provide input to that method
		greaterNumber.display(result);
		sc.close();

	}

}

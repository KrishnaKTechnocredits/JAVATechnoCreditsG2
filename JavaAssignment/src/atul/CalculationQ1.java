//WAP to print the sum (addition), multiply, subtract, divide and remainder of two numbers given by user
package assignment20jan;

public class CalculationQ1 {

	// This function returns the sum of two numbers
	int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

	// This function returns the difference of two numbers
	int calculateSubtraction(int num1, int num2) {
		return num1 - num2;
	}

	// This function returns the product of two numbers
	int calculateProduct(int num1, int num2) {
		return num1 * num2;
	}

	// This function returns the division of two numbers
	int calculateDivision(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		// creating the object of the class
		CalculationQ1 obj1 = new CalculationQ1();
		// converting the first string argument to integer
		int number1 = Integer.parseInt(args[0]);
		// converting the second string argument to integer
		int number2 = Integer.parseInt(args[1]);
		// displaying the user provided arguments
		System.out.println("User provided arguments are " + number1 + " and " + number2 + "\n");
		// displaying the sum
		System.out.println(number1 + " + " + number2 + " = " + obj1.calculateSum(number1, number2));
		// displaying the difference
		System.out.println((number1 + " - " + number2 + " = " + obj1.calculateSubtraction(number1, number2)));
		// displaying the product
		System.out.println((number1 + " * " + number2 + " = " + obj1.calculateProduct(number1, number2)));
		// displaying the division
		System.out.println((number1 + " / " + number2 + " = " + obj1.calculateDivision(number1, number2)));
	}
}

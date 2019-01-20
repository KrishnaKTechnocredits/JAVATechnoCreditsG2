//WAP to find the square and cube of a number
package atul;

public class CalculationQ3 {

	// This function returns the square of two numbers
	int calculateSquare(int number) {
		return number * number;
	}

	// This function returns the cube of two numbers
	int calculateCube(int number) {
		return number * number * number;
	}

	public static void main(String[] args) {
		// creating the object of the class
		CalculationQ3 obj1 = new CalculationQ3();
		// converting the string argument to integer
		int number = Integer.parseInt(args[0]);
		// displaying the user provided arguments
		System.out.println("User provided argument as " + number + "\n");
		// displaying the Square
		System.out.println("Square of " + number + " is " + obj1.calculateSquare(number));
		// displaying the Cube
		System.out.println("Cube of " + number + " is " + obj1.calculateCube(number));
	}
}

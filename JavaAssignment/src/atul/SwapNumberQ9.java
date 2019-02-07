//WAP to swap two numbers without using the third variable.
package assignment20jan;

public class SwapNumberQ9 {

	// This function performs the swap and prints the swapped value
	void performSwap(int number1, int number2) {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		// printing the swapped values
		System.out.println("After Swapping Number1 is : " + number1 + " and Number2 is : " + number2);
	}

	public static void main(String[] args) {
		// creating the object
		SwapNumberQ9 obj = new SwapNumberQ9();
		// printing the original values
		System.out.println("Before Swapping Number1 is : " + Integer.parseInt(args[0]) + " and Number2 is : "
				+ Integer.parseInt(args[1]));
		// calling the function for swapping values
		obj.performSwap(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
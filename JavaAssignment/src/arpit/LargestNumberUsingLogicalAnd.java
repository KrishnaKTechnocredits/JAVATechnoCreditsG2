package arpit;

public class LargestNumberUsingLogicalAnd {

	// This function perform how to find the largest number and return value
	int largestNumber(int[] number) {

		int largestNum = number[0];

		if ((number[1] > number[0]) && (number[1] > number[2])) {
			largestNum = number[1];

		} else if ((number[2] > number[0]) && (number[2] > number[1])) {
			largestNum = number[2];
		}

		return largestNum;
	}

	// This function display the largest number
	void diplay(int largeNumber) {

		System.out.println("Largest of three number is:" + largeNumber);
	}

	public static void main(String[] args) {

		// Creating object of InputOutputOperationsClass
		InputOutputOperations iop = new InputOutputOperations();

		// Take input from user in array form
		int[] num = iop.takeInputFromUser();

		// Creating object of class
		LargestNumberUsingLogicalAnd largestnumber = new LargestNumberUsingLogicalAnd();

		// To call largestNumber() method and provide input to that method.
		// Store the result in a variable
		int number = largestnumber.largestNumber(num);

		// To call the display method and provide input to that method
		largestnumber.diplay(number);

	}

}

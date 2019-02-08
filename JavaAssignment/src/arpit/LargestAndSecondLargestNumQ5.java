package arpit;

public class LargestAndSecondLargestNumQ5 {

	// This function perform the operation how to find Largest and second
	// Largest number.
	void findLargestAndSecondLargest(int[] number) {

		int maxValue1 = 0;
		int maxValue2 = 0;

		for (int index = 0; index < number.length; index++) {

			if (number[index] > maxValue1) {
				maxValue2 = maxValue1;
				maxValue1 = number[index];
			} else if (number[index] > maxValue2) {
				maxValue2 = number[index];
			}
		}
		// Display Largest number
		System.out.println("Largest number in given array is: " + maxValue1);

		// Display second Largest number
		System.out.println("Second Largest number in given array is: " + maxValue2);

	}

	public static void main(String[] args) {

		// Creating the object of the InputOutputOperation class
		InputOutputOperations iop = new InputOutputOperations();

		// Take the input from user in array form
		int[] num = iop.takeInputFromUser();

		// creating the object of the class
		LargestAndSecondLargestNumQ5 largestNumber = new LargestAndSecondLargestNumQ5();

		// To call the findLargestAndSecondLargest method and provide input to
		// that method
		largestNumber.findLargestAndSecondLargest(num);

	}

}

package arpit;

public class MissingNumberInArrayQ1 {

	int expectedsum = 0;
	int originalsum = 0;
	int missingNum = 0;

	// This function perform the operation how to find missing number.
	void findMissingNumber(int[] element) {

		for (int index1 = 1; index1 <= 10; index1++) {
			expectedsum = expectedsum + index1;
		}

		for (int index2 = 0; index2 < element.length; index2++) {
			originalsum = originalsum + element[index2];
		}
		missingNum = expectedsum - originalsum;

	}

	// This function display Missing number
	void display() {

		//System.out.println("Expected sum of element in araay: " + expectedsum);
		//System.out.println("Original sum of element in araay: " + originalsum);
		System.out.println("Missing Element in Array is: " + missingNum);
	}

	public static void main(String[] args) {

		// Creating the object of the InputOutputOperation class
		InputOutputOperations iop = new InputOutputOperations();

		// Take the input from user in array form
		int[] num = iop.takeInputFromUser();

		// creating the object of the class
		MissingNumberInArrayQ1 missingNumber = new MissingNumberInArrayQ1();

		// To call the findMissingNumber method and provide input to that
		// method.
		missingNumber.findMissingNumber(num);

		// To call the display method.
		missingNumber.display();

	}
}

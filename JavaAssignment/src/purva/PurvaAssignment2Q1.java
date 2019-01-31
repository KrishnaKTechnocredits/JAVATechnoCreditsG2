package purva;

/*This program is for finding the missing number in integer array of 1 to 10 */

public class PurvaAssignment2Q1 {

	/*
	 * Main method is calling class InputOutput where logic for taking integer
	 * array from user and displaying that array is written. It calls
	 * missingNumber method where logic for calculating missing no is written
	 */

	public static void main(String[] args) {
		InputOutput iop = new InputOutput();
		int[] ms_arr1 = iop.inputIntArray();
		iop.display(ms_arr1);
		PurvaAssignment2Q1 mno = new PurvaAssignment2Q1();
		int no = mno.missingNumber(ms_arr1);
		System.out.println("\n" + "Missing number from given array list of 1-10 is: " + no);
	}

	/* This method if for finding missing number from given array */
	int missingNumber(int[] arr) {
		int actualSum = 0;
		int expectedSum = 55;
		for (int index = 0; index < arr.length; index++) {
			actualSum = arr[index] + actualSum;
		}
		int missingno = expectedSum - actualSum;
		return missingno;
	}
}

package monali;

public class SecondLargestNo {

	static void secondLargest(int[] arr) {
		int firtsLargest = arr[0];
		int secondLargest = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > firtsLargest) {
				secondLargest = firtsLargest;
				firtsLargest = arr[index];

			} else if (arr[index] < secondLargest && arr[index] > firtsLargest) {
				secondLargest = arr[index];
			}
		}
		System.out.println("Second Largest Number in array: " + secondLargest);
	}

	public static void main(String[] args) {
		InputOutputArrayInt input = new InputOutputArrayInt(); //another class where method will take input from users
		int[] arr = input.takeInputFromUser(); // call method using referenced
												// variable
		secondLargest(arr);
	}
}

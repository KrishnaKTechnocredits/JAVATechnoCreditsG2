package monali;

public class MissingNoLinearSeries1to10 {

	static void missingNo(int arr[]) {
		int n = arr.length + 1;
		int idealsum = n * (n + 1) / 2;     //calculatin ideal sum of linear series numbers
		int expectedsum = 0;

		for (int index = 0; index < arr.length; index++) {
			expectedsum += arr[index];     //expected sum means sum of all given series numbers
		}

		System.out.println("Missing Number in series is: " + (idealsum - expectedsum));  // result by substracting both the sum
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		missingNo(arr);

	}

}

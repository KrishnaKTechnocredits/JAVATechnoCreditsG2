package monali;

public class LargestSmallest {
	static void largeSmallNo(int arr[]) {
		int large = arr[0];
		int small = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > large)
				large = arr[index];

			else if (arr[index] < small)
				small = arr[index];
		}
		System.out.println("Largest Number is: "+large);
		System.out.println("Smallest Number is: "+small);
	}

	public static void main(String[] args) {
		InputOutputArrayInt input = new InputOutputArrayInt(); // another class where method created
																// for input
																// number to be
																// taken..class object
																// is created
		int[] arr = input.takeInputFromUser(); // call method using referenced variable
											 
		largeSmallNo(arr);
	}
}

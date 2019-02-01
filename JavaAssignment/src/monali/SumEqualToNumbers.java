package monali;

public class SumEqualToNumbers {

	static void sumEqualToNo(int arr[], int num) {
		int temp = 0, sum = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				sum = arr[index] + arr[index1];
				if (sum == num) {
					System.out.println(arr[index] + " " + arr[index1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		InputOutputArrayInt input = new InputOutputArrayInt();
		int[] arr = input.takeInputFromUser(); // call method using referenced
		int num = input.takeNumber();         // method call to give take value from user whose sum =number
		sumEqualToNo(arr, num);

	}

}

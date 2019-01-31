package monali;

public class EqualityOfTwoArray {

	static void equalityOfTwoArray(int[] arr, int[] arr1) {
		boolean flag = false;
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = 0; index < arr1.length; index++) {
				if (arr[index] == arr1[index1]) {
					flag = true;
					System.out.println("Two Arrays Are Equal");
					break;
				}
			}
		}

		if (flag == false) {
			System.out.println("Arrays elements not equal");
		}
	}

	public static void main(String[] args) {
		InputOutputArrayInt input = new InputOutputArrayInt();
		int[] arr = input.takeInputFromUser(); // call method using referenced
												// variable input
		int[] arr1 = input.takeInputFromUser();
		equalityOfTwoArray(arr, arr1);

	}
}

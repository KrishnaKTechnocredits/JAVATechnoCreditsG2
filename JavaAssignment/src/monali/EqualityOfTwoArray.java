package monali;

public class EqualityOfTwoArray {

	static void equalityOfTwoArray(int[] arr, int[] arr1) {
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != arr1[index]) {
				flag = false;
				break;
			}

		}
		if (flag == true)
			System.out.println("Two array are equal");
		else
			System.out.println("Two Arrays are not equal");

	}

	public static void main(String[] args) {
		InputOutputArrayInt input = new InputOutputArrayInt();
		int[] arr = input.takeInputFromUser(); // call method using referenced variable input
		int[] arr1 = input.takeInputFromUser();
		equalityOfTwoArray(arr, arr1);

	}
}

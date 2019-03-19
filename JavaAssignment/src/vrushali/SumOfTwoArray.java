package vrushali;

public class SumOfTwoArray {
	public static void main(String[] args) {
		SumOfTwoArray s = new SumOfTwoArray();
		int[] array1 = { 1, 5, 9, 3, 7 };
		int[] array2 = { 1, 7, 9, 3 };
		int ansArray1 = SumOfTwoArray.sum(array1, array2);
		int ansArray2 = SumOfTwoArray.sum(array2, array1);
		s.display(ansArray1, ansArray2);
	}

	static int sum(int[] arr, int[] arr1) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	void display(int s, int s2) {
		int sum = s + s2;
		System.out.println("sum of two array is: " + sum);
	}

}

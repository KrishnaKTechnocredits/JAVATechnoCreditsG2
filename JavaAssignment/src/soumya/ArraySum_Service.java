package soumya;

public class ArraySum_Service {
	int sum;

	// Method to add two arrays
	int sum(int[] arr1, int[] arr2) {
		for (int index = 0; index <= arr1.length - 1; index++) {
			sum = sum + arr1[index];
		}
		for (int index = 0; index <= arr2.length - 1; index++) {
			sum = sum + arr2[index];
		}
		return sum;
	}
}

package soumya;

public class PositiveNegativeNum_Service {
	// Method to find positive and negative number
	int positiveNegativeNum(int[] arr) {
		int sumPos = 0;
		int sumNeg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				sumPos = sumPos + arr[i];
				System.out.println("Positive Number: " + arr[i]);
			}
			if (arr[i] < 0) {
				System.out.println("Negative Number: " + arr[i]);
				sumNeg = sumNeg + arr[i];
			}
		}
		System.out.println("Positive number sum:- " + sumPos);
		System.out.println("Negative number sum:- " + sumNeg);
		return 0;
	}
}

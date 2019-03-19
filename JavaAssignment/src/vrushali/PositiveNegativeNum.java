package vrushali;

import java.util.Arrays;

/*	
	Output :- expected output of
	a. positive number = {5, 6, 14, 6, 7}
	b. negative number = {-9, -25, -14}
	c. positive number sum :- 38
	d. negative number sum :- 48*/
public class PositiveNegativeNum {
	int pSum = 0;
	int nSum = 0;

	public static void main(String[] args) {
		PositiveNegativeNum pn = new PositiveNegativeNum();
		int[] input = { 5, 6, -9, 14, -25, 6, 7, -14 };
		int ansPositive = pn.positiveArr(input);
		int ansNgative = pn.negativeArr(input);
		pn.disply(ansPositive);
	}

	public int positiveArr(int[] input) {

		int pCount = 0;
		int positiveArray[] = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				positiveArray[pCount] = input[i];
				pSum = pSum + input[i];
			}
		}
		return pSum;
	}

	int negativeArr(int[] input) {

		int negativeArray[] = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				negativeArray[i] = input[i];
				nSum = nSum + input[i];
			}
		}
		return nSum;
	}

	void disply(int s) {
		System.out.println("Sum of positive no. is: " + pSum);
		System.out.println("Sum of Negative no. is: " + nSum);
	}

}
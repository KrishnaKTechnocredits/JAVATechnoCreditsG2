/*WAP to find unique number from given array store that numbers in new array.
a. firstArray:- {1,2,3,4,2,5}
b. secondArray:- {5,6,7,8,9,7}
c. unique array = {1,2,3,4,5,6,7,8,9}
i. order can be anything*/


package purva;

public class PurvaAssign4_q14_Service {

	int[] uniqueArray(int[] firstarray, int[] secondarray) {
		int len = firstarray.length + secondarray.length;
		int[] uniquearray = new int[len];
		int temp = 0;

		// below for loop uses logic where values in array 1 are placed in index
		// of unique array where index of unique array = value of array
		for (int index = 0; index < uniquearray.length; index++) {
			if (index < firstarray.length) {
				if (firstarray[index] == 0) {
					temp = firstarray[index];
					uniquearray[temp] = firstarray[index];
				} else if (uniquearray[firstarray[index]] != firstarray[index]) {
					temp = firstarray[index];
					uniquearray[temp] = firstarray[index];
				}

			}
		}

		// below for loop uses logic where values in array 2 are placed in index
		// of unique array where index of unique array = value of array
		for (int index = 0; index < uniquearray.length; index++) {
			if (index < secondarray.length) {
				if (uniquearray[secondarray[index]] != secondarray[index]) {
					temp = secondarray[index];
					uniquearray[temp] = secondarray[index];
				}
			}

		}
		return uniquearray;

	}

	// this will check if 0 is present in array 1 and return flag as true if
	// present
	boolean checkIfZeroIsPresentArray1(int[] a1) {
		boolean flag1 = false;

		for (int index = 0; index < a1.length; index++) {
			if (a1[index] == 0) {
				flag1 = true;

			}
		}
		// System.out.println(flag1);
		return flag1;
	}

	// this will check if 0 is present in array 2 and return flag as true if
	// present
	boolean checkIfZeroIsPresentArray2(int[] a2) {
		boolean flag2 = false;

		for (int index = 0; index < a2.length; index++) {
			if (a2[index] == 0) {
				flag2 = true;
				break;
			}
		}
		// System.out.println(flag2);
		return flag2;
	}
}

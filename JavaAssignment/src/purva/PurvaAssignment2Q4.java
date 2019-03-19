/* Program for finding Largest and smallest number in unsorted array
 * Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}.
 *  */

package purva;

public class PurvaAssignment2Q4 {
	public static void main(String[] args) {
		InputOutput iop1 = new InputOutput();
		int[] arr1 = iop1.inputIntArray();
		iop1.display(arr1);
		PurvaAssignment2Q4 obj1 = new PurvaAssignment2Q4();
		int smallno = obj1.smallNoPrint(arr1);
		System.out.println("\n" + "Smallest no from given array = " + smallno);
		int largeno = obj1.LargeNoPrint(arr1);
		System.out.println("\n" + "Largest no from given array = " + largeno);
	}

	/* Below method will find smallest no from array */
	int smallNoPrint(int[] a) {
		int small = a[0];
		for (int index = 1; index < a.length; index++) {
			if (a[index] < small)
				small = a[index];
		}
		return small;
	}

	/* Below method will find largest no from array */
	int LargeNoPrint(int[] a) {
		int large = a[0];
		for (int index = 1; index < a.length; index++) {
			if (a[index] > large)
				large = a[index];
		}
		return large;
	}

}

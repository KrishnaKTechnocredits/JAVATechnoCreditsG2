/* Below program is for finding first different index from given arrays
 * Find first differ index from given arrays
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2
 *  */

package purva;

public class PurvaAssignment2Q8 {
	public static void main(String[] args) {
		InputOutput iop1 = new InputOutput();
		InputOutput iop2 = new InputOutput();
		int[] arr1 = iop1.inputIntArray();
		int[] arr2 = iop2.inputIntArray();
		PurvaAssignment2Q8 obj1 = new PurvaAssignment2Q8();
		System.out.print("\n" + "i/p :-" + "\t" + "arr1: ");
		obj1.printInput(arr1);
		System.out.print("\t" + "arr2: ");
		obj1.printInput(arr2);

		/*
		 * Below lines of codes check is all values in both arrays are same. If
		 * yes returns both arrays are having same value msg, else it will
		 * compare values and print first differing index
		 */
		boolean flag = obj1.twoArrayComparison(arr1, arr2);
		if (flag == true)
			System.out.println("Both the arrays have matching values at all indexes");
		else if (flag == false) {
			int indexval = obj1.indexMatch(arr1, arr2);
			System.out.println("Values are not matching at index -> " + indexval);
		}
	}

	/* Below method will print input array in format specified in assignment */
	void printInput(int[] ar) {
		System.out.print("{");
		for (int index = 0; index < ar.length; index++) {
			if (index < ar.length - 1)
				System.out.print(ar[index] + ",");
			else if (index < ar.length)
				System.out.print(ar[index]);
		}
		System.out.println("}");
	}

	/*
	 * Below method will check index where values are different in both arrays
	 */
	int indexMatch(int[] ar1, int[] ar2) {
		int temp = 0;
		for (int index = 0; index < ar1.length && index < ar2.length; index++) {
			if (ar1[index] != ar2[index]) {
				temp = index;
				break;
			} else if (ar1[index] == ar2[index]) {

			}
		}
		return temp;
	}

	/* Below program will check equality of 2 array */
	boolean twoArrayComparison(int[] a1, int[] a2) {
		int index1;
		boolean flag = false;

		for (index1 = 0; index1 < a1.length && index1 < a2.length; index1++) {

			if (a1[index1] == a2[index1])
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}

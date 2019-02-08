/* Below program is to check the equality of two arrays 
 * Hint: Input Arrays : 
 * First Array : [21, 57, 11, 37, 24] 
 * Second Array : [21, 57, 11, 37, 24] 
 * Two Arrays Are Equal
 * */

package purva;

public class PurvaAssignment2Q6 {
	public static void main(String[] args) {
		InputOutput iop1 = new InputOutput();
		InputOutput iop2 = new InputOutput();
		int[] arr1 = iop1.inputIntArray();
		int[] arr2 = iop2.inputIntArray();
		PurvaAssignment2Q6 obj1 = new PurvaAssignment2Q6();
		System.out.print("\n" + "First Array : ");
		obj1.printInput(arr1);
		System.out.print("Second Array : ");
		obj1.printInput(arr2);
		if (arr1.length != arr2.length)
			System.out.println("Two Arrays Are Not Equal");
		else {
			boolean flag = obj1.twoArrayComparison(arr1, arr2);
			if (flag == true)
				System.out.println("Two Arrays Are Equal");
			else if (flag == false)
				System.out.println("Two Arrays Are Not Equal");
		}
	}

	/*
	 * This method will print the input array and number as format specified in
	 * assignment
	 */
	void printInput(int[] ar) {
		System.out.print("[");
		for (int index = 0; index < ar.length; index++) {
			if (index < ar.length - 1)
				System.out.print(ar[index] + ",");
			else if (index < ar.length)
				System.out.print(ar[index]);
		}
		System.out.println("]");
	}

	/* Below program will check equality of 2 array */
	boolean twoArrayComparison(int[] a1, int[] a2) {
		int index1;
		boolean flag = false;

		for (index1 = 0; index1 < a1.length; index1++) {

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

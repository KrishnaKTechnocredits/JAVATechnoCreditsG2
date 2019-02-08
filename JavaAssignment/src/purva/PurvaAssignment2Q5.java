/*Below program is to find second largest element in an array of integers */

package purva;

public class PurvaAssignment2Q5 {
	public static void main(String[] args) {

		InputOutput iop = new InputOutput();
		int[] arr = iop.inputIntArray();
		iop.display(arr);
		PurvaAssignment2Q5 obj1 = new PurvaAssignment2Q5();
		obj1.secondLargestNo(arr);
	}

	/* Below method will find second largest number from array */
	void secondLargestNo(int[] a) {
		int large = a[0];
		int slarge = a[0];
		for (int cnt = 0; cnt < a.length; cnt++) {
			{
				if (a[cnt] > large) {
					slarge = large;
					large = a[cnt];
				} else if (a[cnt] > slarge)
					slarge = a[cnt];
			}
		}
		System.out.println("\n" + "Second largest value from above above array = " + slarge);
	}
}
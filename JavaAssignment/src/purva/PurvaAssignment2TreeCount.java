/* If all trees ahead of user are in straight vertical line, print the number of trees ahead of the user which are visible to user */
package purva;

public class PurvaAssignment2TreeCount {
	public static void main(String[] args) {
		InputOutput iop = new InputOutput();
		int[] arr = iop.inputIntArray();
		PurvaAssignment2TreeCount obj1 = new PurvaAssignment2TreeCount();
		obj1.printInputValuesOnscreen(arr);
		int tcnt = obj1.treeCount(arr);
		System.out.println("Trees visible to users are: " + tcnt);
	}

	/*
	 * This method will print the input array and number is format specified in
	 * assignment
	 */
	void printInputValuesOnscreen(int[] ar) {
		System.out.print("\n" + "i/p :- ar[] = {");
		for (int index = 0; index < ar.length; index++) {
			if (index < ar.length - 1)
				System.out.print(ar[index] + ",");
			else if (index < ar.length)
				System.out.print(ar[index]);
		}
		System.out.println("}");
	}

	/*
	 * This method will calculate the number of trees visible to user and return
	 * to visible count to main method * assignment
	 */
	int treeCount(int[] a) {
		int temp = 1;
		for (int index = 0; index < a.length - 1; index++) {
			if (a[index] < a[index + 1])
				temp = temp + 1;
		}
		return temp;
	}
}

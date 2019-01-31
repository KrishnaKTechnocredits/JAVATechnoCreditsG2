/* Program to find missing no in linear series 
 * i/p :- {2,4,6,10,12)
 * o/p :- 8
 */
package purva;

public class PurvaAssignment2LinearMissNo {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 10, 12 };
		PurvaAssignment2LinearMissNo obj1 = new PurvaAssignment2LinearMissNo();
		obj1.printInputValuesOnscreen(arr);
		int missingno = obj1.missingLNo(arr);
		System.out.println("o/p :- " + "\t" + 2 * missingno);
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

	/* This method finds the missing index and returns to main method*/
	int missingLNo(int[] a) {
		int temp = 1;
		for (int cnt = 0; cnt < a.length; cnt++) {
			if (a[cnt] == 2 * temp)
				temp++;
			else
				break;
		}
		return temp;
	}
}

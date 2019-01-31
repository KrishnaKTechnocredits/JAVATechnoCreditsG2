/* This program is for finding duplicate number on Integer array in Java
Hint: There is exactly one number is repeated in the array. 
You need to write a program to find that duplicate number. 
For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. */


package purva;

public class PurvaAssignment2Q2 {
	public static void main(String[] args) {
		InputOutput iop = new InputOutput();
		int[] arr = iop.inputIntArray();
		iop.display(arr);
		PurvaAssignment2Q2 dno = new PurvaAssignment2Q2();
		int duplicatenum = dno.duplicateNo(arr);
		System.out.println("\n" + "Duplicate number from given array list = " + arr[duplicatenum]);

	}

	/* Below method will find duplicate numbers and will return that duplicate no to main method */
	int duplicateNo(int[] ar) {
		int temp = 0;
		for (int index = 0; index < ar.length; index++) {
			for (int counter = index + 1; counter < ar.length; counter++) {
				if (ar[index] == ar[counter])
					temp = temp + index;
			}
		}
		return temp;
	}

}

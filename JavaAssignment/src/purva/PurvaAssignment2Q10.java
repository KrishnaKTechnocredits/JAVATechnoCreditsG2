/*
 * Find max value at differed index
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2
From (9,18) max value is 18
 */
package purva;

public class PurvaAssignment2Q10 {
	public static void main(String[] args) {
		
	
	InputOutput iop1 = new InputOutput();
	InputOutput iop2 = new InputOutput();
	int[] arr1 = iop1.inputIntArray();
	int[] arr2 = iop2.inputIntArray();
	PurvaAssignment2Q10 obj1 = new PurvaAssignment2Q10();
	System.out.print("\n" + "i/p :-" + "\t" + "arr1: ");
	obj1.printInput(arr1);
	System.out.print("\t" + "arr2: ");
	obj1.printInput(arr2);

	/*
	 * Below lines of codes check if all values in both arrays are same. If
	 * yes returns "both arrays are having same value" msg, else it will
	 * compare values and print first differing index
	 */
	boolean flag = obj1.twoArrayComparison(arr1, arr2);
	if (flag == true)
		System.out.println("Both the arrays have matching values at all indexes");
	else if (flag == false) {
		obj1.indexMatch(arr1, arr2);
	}

}

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

void indexMatch(int[] ar1, int[] ar2) {
	int max=0;
	for (int index = 0; index < ar1.length && index < ar2.length; index++) {
		if (ar1[index] != ar2[index]) {
			System.out.println("\n"+"o/p :- "+"\t"+"Values are not matching at index -> " + index);
			if(ar1[index] > ar2[index])
			{
				max=ar1[index];
				System.out.println("\t"+"From "+"("+ar1[index]+","+ar2[index]+")"+" max value is "+max);		
			}
			else
			{
				max=ar2[index];
				System.out.println("\t"+"From "+"("+ar1[index]+","+ar2[index]+")"+" max value is "+max);			
			}
		}
	}

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

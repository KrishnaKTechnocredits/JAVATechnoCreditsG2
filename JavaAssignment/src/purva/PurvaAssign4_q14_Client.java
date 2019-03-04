/*WAP to find unique number from given array store that numbers in new array.
a. firstArray:- {1,2,3,4,2,5}
b. secondArray:- {5,6,7,8,9,7}
c. unique array = {1,2,3,4,5,6,7,8,9}
i. order can be anything*/

package purva;

public class PurvaAssign4_q14_Client {
	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3, 4, 2, 5, 0 };
		int[] secondArray = { 5, 6, 7, 8, 0, 9, 7 };

		// below lines will print user input on console
		System.out.println("firstArray:- {1, 2, 3, 4, 2, 5,0}");
		System.out.println("secondArray:- {5, 6, 7, 8, 0,9, 7}");

		// object obj1 calls unique array method defined in service class
		PurvaAssign4_q14_Service obj1 = new PurvaAssign4_q14_Service();
		int[] uniqueArray = obj1.uniqueArray(firstArray, secondArray);

		// below object call method which checks if element 0 is present in
		// first array, if present returns flag as true which is used to print
		// the array
		PurvaAssign4_q14_Service obj2 = new PurvaAssign4_q14_Service();
		boolean flag1 = obj2.checkIfZeroIsPresentArray1(firstArray);

		// below object call method which checks if element 0 is present in
		// second array, if present returns flag as true which is used to print
		// the array
		PurvaAssign4_q14_Service obj3 = new PurvaAssign4_q14_Service();
		boolean flag2 = obj3.checkIfZeroIsPresentArray2(secondArray);

		// if both array contains element 0 below code is used to print the unique array 
		if (flag1 == true && flag2 == false) {

			System.out.println("unique array = ");
			
			//as per this code 0 will always be placed at 0th index hence 0 is printed below first
			System.out.println(uniqueArray[0]);

			//elements from index 1 are printed, index where 0 was found in subsequent indexes are skipped as they are not part of array
			for (int index = 1; index < uniqueArray.length; index++) {
				if (uniqueArray[index] != 0 && uniqueArray[index + 1] != 0) {
					System.out.printf(uniqueArray[index] + ",");
				} else if (uniqueArray[index] != 0 && uniqueArray[index + 1] == 0) {
					System.out.printf(uniqueArray[index] + "}");
				}
			}

		}
		
		
		// if array 2 contains element 0 below code is used to print the unique array 
		else if (flag1 == false && flag2 == true) {

			System.out.println("unique array = {");
			//as per this code, element 0 if present in array will always be placed at 0th index hence 0 is printed below first
			System.out.println(uniqueArray[0]);

			//elements from index 1 are printed, index where 0 was found in subsequent indexes are skipped as they are not part of array
			for (int index = 1; index < uniqueArray.length; index++) {
				if (uniqueArray[index] != 0 && uniqueArray[index + 1] != 0) {
					System.out.printf(uniqueArray[index] + ",");
				} else if (uniqueArray[index] != 0 && uniqueArray[index + 1] == 0) {
					System.out.printf(uniqueArray[index] + "}");
				}

			}
		}

		// if both array  contains element 0 below code is used to print the unique array
		else if (flag1 == true && flag2 == true) {

			System.out.printf("unique array = {");
			//as per this code, element 0 if present in array will always be placed at 0th index hence 0 is printed below first
			System.out.print(uniqueArray[0] + ",");

			//elements from index 1 are printed, index where 0 was found in subsequent indexes are skipped as they are not part of array
			for (int index = 1; index < uniqueArray.length; index++) {
				if (uniqueArray[index] != 0 && uniqueArray[index + 1] != 0) {
					System.out.printf(uniqueArray[index] + ",");
				} else if (uniqueArray[index] != 0 && uniqueArray[index + 1] == 0) {
					System.out.printf(uniqueArray[index] + "}");
				}

			}
		}
		
		
		// if both array doesn't contain element 0 below code is used to print the unique array
		else if (flag1 == false && flag2 == false) {

			//here index 0 is skipped as value 0 is present in index 0
			System.out.printf("unique array = {");
			for (int index = 1; index < uniqueArray.length; index++) {
				if (uniqueArray[index] != 0 && uniqueArray[index + 1] != 0) {
					System.out.printf(uniqueArray[index] + ",");
				} else if (uniqueArray[index] != 0 && uniqueArray[index + 1] == 0) {
					System.out.printf(uniqueArray[index] + "}");
				}
			}

		}

	}
}

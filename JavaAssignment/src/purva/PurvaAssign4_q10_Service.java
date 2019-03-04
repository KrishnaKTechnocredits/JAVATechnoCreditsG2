/*WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45
*/
package purva;

public class PurvaAssign4_q10_Service {
	
	//calculates sum of elements in individual array and adds both the sum to get resultant sum value
	int sumOfTwoArrays(int[] a1, int[] a2) {
		int array1_sum = 0;
		int array2_sum = 0;
		int sum = 0;

		//each number from array 1 is added to integer - array1_sum
		for (int index = 0; index < a1.length; index++) {
			array1_sum = array1_sum + a1[index];
		}

		//each number from array 2 is added to integer - array2_sum
		for (int index = 0; index < a2.length; index++) {
			array2_sum = array2_sum + a2[index];
		}

		//sum of 1st array values + 2nd array values = sum of elemets of both array
		sum = array1_sum + array2_sum;
		return sum;
	}
}

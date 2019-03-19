/*WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45*/

package purva;

public class PurvaAssign4_q10_Client {
	public static void main(String[] args) {
		int[] firstar = { 1, 5, 9, 3, 7 };
		int[] secondar = { 1, 7, 9, 3 };
		
		//prints array 1 and 2 on console
		System.out.println("firstArray :- {1, 5, 9, 3, 7}");
		System.out.println("secondAraay:- {1, 7, 9, 3}");

		PurvaAssign4_q10_Service obj1 = new PurvaAssign4_q10_Service();
		//calls method from service class which calculates sum of both the arrays
		int sum = obj1.sumOfTwoArrays(firstar, secondar);
		System.out.println("\n" + "Sum of 2 given input arrays = " + sum);
	}

}

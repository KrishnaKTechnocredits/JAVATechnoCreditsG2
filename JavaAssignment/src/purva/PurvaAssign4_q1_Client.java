/*WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48 
This program is client program and calls all services/methods defined in service program*/

package purva;

public class PurvaAssign4_q1_Client {
	public static void main(String[] args) {
		int[] input = {5,6,-9,14,-25,6,7,-14};
		PurvaAssign4_q1_Service obj1 = new PurvaAssign4_q1_Service();
		
		System.out.println("Input array:- {5,6,-9,14,-25,6,7,-14}");
		System.out.println("\n"+"Output:- ");
		int[] posarray=obj1.positiveArray(input);
		System.out.print("positive number = ");
		obj1.displayArray(posarray);
		
		System.out.print("negative number = ");
		int[] negarray=obj1.negativeArray(input);
		obj1.displayArray(negarray);
		
		System.out.println("positive number sum:- "+obj1.positiveArraySum(posarray));
		
		System.out.println("negative number sum:- "+obj1.negativeArraySum(negarray));
		
	}

}

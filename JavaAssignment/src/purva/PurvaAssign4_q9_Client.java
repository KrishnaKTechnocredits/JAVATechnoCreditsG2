/*WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16*/

package purva;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PurvaAssign4_q9_Client {
	public static void main(String[] args) {
		char ch = 0;
		/*do
		{*/
			int[] array = {14, 32, 19, 14, 78,36};
			System.out.println("Input :- {14, 32, 19, 14, 78,36}");
			
			//calls code which calculates avg of user defined array
			PurvaAssign4_q9_Service obj1 = new PurvaAssign4_q9_Service();
			float avg = obj1.sumOfIntArray(array);
			
			//prints avg value on screen
			System.out.printf("Average of user given array:- ");
			System.out.printf("%.2f",avg);
			
			
		
		
		
	}

}

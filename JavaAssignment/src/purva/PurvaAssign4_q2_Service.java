/* WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
This is service class which finds out maximum length string */

package purva;

public class PurvaAssign4_q2_Service {

	/* Below method will find maximum length string from given array */ 
	String maxString(String[] a) {

		//1st element of string array will be assigned to length and 1st elements index will be assigned to i */
		int len = a[0].length();
		int i = 0;

		//below for loop will find maximum length string from array and assign that elements length to 'len' and index to i*/
		for (int index = 1; index < a.length; index++) {
			if (a[index].length() > len) {
				len = a[index].length();
				i = index;
			}
		}
		return a[i];
	}
}

/*WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet*/

package purva;

public class PurvaAssign4_q6_Service {

	// from input string array finds max len string and passes it to other
	// function which reverse it
	String maxLengthString(String[] a) {
		int max = a[0].length();
		int i = 0;
		for (int index = 1; index < a.length; index++) {
			if (a[index].length() > max) {
				max = a[index].length();
				i = index;
			}
		}
		return a[i];
	}

	// below code reverse max len string
	String reverseString(String maxString, int count) {
		String reverseString = "";
		char rch;
		for (count = count - 1; count >= 0; count--) {
			rch = maxString.charAt(count);
			reverseString = reverseString + rch;
		}
		return reverseString;
	}

	// below code counts no of digits in a string and stores it in count
	int countofdigitsWord(String word) {
		int count = 0, index = 0;
		char ch;
		for (index = 0; index < word.length(); index++) {
			count++;
		}
		return count;
	}

}

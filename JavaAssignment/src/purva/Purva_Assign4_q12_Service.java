/*WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”
i. Harsh is not palindrome*/

package purva;

public class Purva_Assign4_q12_Service {

	//below method checks if input string and reverse of input string and equal and prints if string is palindrome or not
	void StringIsPalidrome(String input) {
		String reverseString = reverseOfInputStr(input);
		if (input.equals(reverseString)) {
			System.out.println("String " + input + " is Palindrome");
		} else {
			System.out.println("String " + input + " is not a Palindrome");
		}

	}

	
	//below method will reverse the input string and place it in final string reverseString
	String reverseOfInputStr(String input) {
		String reverseString = "";
		int temp = 0;

		char ch;

		//character from last index of string is taken and added to appended to reverse string variable
		for (int index = input.length() - 1; index >= 0; index--) {
			ch = input.charAt(index);
			temp++;
			reverseString = reverseString + ch;
		}
		return reverseString;
	}

}

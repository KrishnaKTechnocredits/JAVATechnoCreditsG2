package vrushali;

/* Question No 3
  WAP to find frequency of user defined character in user defined String
   a. i.e. User String :- “electrical engineering”
   b. char value :- e
   c. count of e :- 5 */

import java.util.Scanner;

public class FrequencyOfChar {
	public static void main(String[] args) {
		String str = "electrical engineering";
		char ch = 'e';
		FrequencyOfChar freqOfChar = new FrequencyOfChar();
		int ans = freqOfChar.countOfChar(str, ch);
		freqOfChar.display(ans);
	}

	// method to display frequency of character
	void display(int c) {
		System.out.println("Count of e in given String is :" + c);
	}

	// Method to calculate count of character in given user given string
	int countOfChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}
}
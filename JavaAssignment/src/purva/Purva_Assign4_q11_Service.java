/*WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and backward
i.e. actual number :- 12321*/

package purva;

public class Purva_Assign4_q11_Service {

	// below code checks if reverse of input no and input no is palindrome or
	// not
	void numberIsPalindrome(int num) {
		if (num == 0) {
			System.out.println("Number " + num + " is palindrome!");
		} else {
			int reversenum = reverseNum(num);
			if (num == reversenum) {
				System.out.println("Number " + num + " is palindrome!");
			} else {
				System.out.println("Number " + num + " is not palindrome!");
			}
		}
	}

	int reverseNum(int num) {
		int temp_num = num;
		int count = 0;
		String rno = "";

		// calculates no of digit in a no with the help of count
		while (num > 0) {
			num = num / 10;
			count++;
		}

		// with the help of %, each digit from input no. is retrieved and placed
		// in reverse order in rno
		for (int index = 0; index < count; index++) {
			int remainder = temp_num % 10;
			rno = rno + remainder;
			temp_num = temp_num / 10;
		}
		return Integer.valueOf(rno);
	}
}

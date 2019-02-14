package vrushali;

/**
 * Question No.11 WAP to find to number is palindrome or not. i.e. actual number
 * :- 12321 reverse of actual number :- 12321
 */
public class NumPalindrome {
	public static void main(String[] args) {
		int num = 12321;
		NumPalindrome revNum = new NumPalindrome();
		revNum.NumPalindromeCheck(num);
	}

	// Method to reverse number and check the whether it is Palindrome or not
	void NumPalindromeCheck(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is Palindrome ");
		} else {
			System.out.println(temp + " is not Palindrome ");
		}

	}

}
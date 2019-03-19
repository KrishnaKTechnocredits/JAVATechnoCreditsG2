//Q12

package array_string_programs;

public class PalindromeString {

	static void checkPalindrome(String input) {

		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		if (reverse.equals(input)) {
			System.out.println(input + " is Palindrome");
		}
	}

	public static void main(String[] args) {
		String name = "hi naman this is nitin";
		String input[] = name.split(" ");
		for (int i = 0; i < input.length; i++) {
			checkPalindrome(input[i]);
		}

	}

}

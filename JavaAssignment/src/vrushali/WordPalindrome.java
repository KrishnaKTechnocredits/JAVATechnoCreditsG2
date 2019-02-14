package vrushali;

/* Question No 12
 	WAP to find word is palindrome or not ?
   a. String name = “naman”
   i. Naman is palindrome
   b. String name = “harsh”
   i. Harsh is not palindrome*/

public class WordPalindrome {
	static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		if (rev.equals(s)) {
			System.out.println(rev + " is palindrome");
		} else if (!rev.equals(s)) {
			System.out.println(rev + " is not palindrome");
		}
		return rev;

	}

	public static void main(String[] args) {
		String msg = "naman harsh";

		String[] s = msg.split(" ");

		for (int i = 0; i < s.length; i++) {
			// System.out.println(s[i]);

			WordPalindrome.reverse(s[i]);
		}

	}

}

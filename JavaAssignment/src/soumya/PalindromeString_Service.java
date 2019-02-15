package soumya;

public class PalindromeString_Service {
	// Method to check palindrome
	String checkString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output = output + str.charAt(index);
		}
		return output;
	}
}

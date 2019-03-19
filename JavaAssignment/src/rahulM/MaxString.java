//Q2

package array_string_programs;

public class MaxString {

	String maxLengthString(String input[]) {
		int maxLength = 0;
		String maxStr = "";
		for (int i = 0; i < input.length; i++) {
			int len = input[i].length();
			if (len > maxLength) {
				maxLength = len;
				maxStr = input[i];
			}
		}
		return maxStr;
	}

	void display(String str) {
		System.out.println("Longest string is : " + str);
	}

	public static void main(String[] args) {
		String input[] = { "All the best", "Technocredits", "", "Maharashtra" };
		MaxString maxString = new MaxString();
		String max = maxString.maxLengthString(input);
		maxString.display(max);
	}
}

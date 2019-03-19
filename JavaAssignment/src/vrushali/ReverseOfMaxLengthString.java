package vrushali;

/*	Question No. 2
 	WAP to find max length String from the given array.
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}*/

public class ReverseOfMaxLengthString {
	public static void main(String[] args) {
		int maxLength = 0;
		String input[] = { "all the best", "technocredits", "", "maharashtra" };
		ReverseOfMaxLengthString maxString = new ReverseOfMaxLengthString();
		String max = maxString.maxLengthString(input);
		maxString.display(max);
	}

	// Method to calculate max length String
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

	// display max length String
	void display(String str) {
		System.out.println("Max length String is: " + str);
	}

}

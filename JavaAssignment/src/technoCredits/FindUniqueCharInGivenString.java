package technoCredits;

public class FindUniqueCharInGivenString {

	public static void main(String[] args) {
		FindUniqueCharInGivenString f = new FindUniqueCharInGivenString();
		String input = "good morning";
		f.findUniqueCharGivenStr(input);
	}

	void findUniqueCharGivenStr(String input) {

		for (int i = 0; i < input.length(); i++) {
			if (i == input.indexOf(input.charAt(i))) {
				int count = 0;
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j)) {
						count++;
					}
				}
				System.out.println(input.charAt(i) + " : " + count);
			}
		}
	}
}

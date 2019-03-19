package technoCredits;

public class FindUniqueCharInGivenString2 {

	public static void main(String[] args) {
		FindUniqueCharInGivenString2 f = new FindUniqueCharInGivenString2();
		String input = "good morning";
		f.findUniqueCharGivenStr(input);
	}

	void findUniqueCharGivenStr(String input) {

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				int count = 0;
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j)) {
						count++;
					}
				}
				System.out.println(input.charAt(i) + " : " + count);
				input = input.replace(input.charAt(i), ' ');
			}
		}
	}
}

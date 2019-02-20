package vrushali;

/**
 * WAP to find vowels in given string a. Input :- automation engineering b.
 * Count :- 11
 */

public class vowelsInString {
	public static void main(String[] args) {
		int count = 0;
		char vowels;
		
		String str = "Automation engineering";
		for (int i = 0; i < str.length(); i++) {
		vowels = str.charAt(i);

			switch (vowels) {
			case 'a':
				count++;
				break;

			case 'e':
				count++;
				break;

			case 'i':
				count++;
				break;

			case 'o':
				count++;
				break;

			case 'u':
				count++;
				break;
				
			case 'A':
				count++;
				break;
				
			case 'E':
				count++;
				break;
			case 'I':
				count++;
				break;
			case 'O':
				count++;
				break;
			case 'U':
				count++;
				break;

			}
		}
		System.out.println("count of vowels: " + count);

	}
}

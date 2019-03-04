package soumya;

public class VowelsCount_Service {
	// Method to count vowels in entered String
	int checkVowel(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u')
				count++;
		}
		return count;
	}
}

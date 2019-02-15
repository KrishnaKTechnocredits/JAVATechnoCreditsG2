package soumya;

public class CharFrequency_Service {
	int length(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}
}

package soumya;

public class MaxLengthString_Service {
	int max = 0;

	// Method for finding length of string
	int length(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			count++;
		}
		return count;
	}

	// Method for finding max length
	int maxLength(int count) {
		if (count > max && count != 0) {
			max = count;
		}
		return max;
	}
}

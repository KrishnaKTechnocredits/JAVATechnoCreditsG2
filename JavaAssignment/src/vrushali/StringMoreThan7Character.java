package vrushali;

/**
 * WAP to find string which has length more than 7 characheter. a. Input array
 * ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”} b. Output
 * :- Krishna, aakansha, abhishek
 */
public class StringMoreThan7Character {
	public static void main(String[] args) {
		StringMoreThan7Character sm = new StringMoreThan7Character();
		String[] input = { "Krishna", "Harsh", "Maulik", "Aakanksha", "Abhishek" };
		String[] ans = sm.StringMorethan7charCheck(input);
		sm.display(ans);
	}

	// Method to display String more than 7 characters
	void display(String[] output) {
		for (int i = 0; i < output.length; i++) {
			if (output[i] != null)
				System.out.println(output[i]);
		}
	}

	// Method to calculate String more than 7 characters
	String[] StringMorethan7charCheck(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() >= 7) {
				output[count] = input[i];
				count++;
			}
		}
		return output;
	}
}

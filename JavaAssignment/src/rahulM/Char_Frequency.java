//Q3

package array_string_programs;

public class Char_Frequency {
	String name = "electrical engineering";
	int count = 0;

	void frequencyOfCharacter(char ch) {

		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);
			if (character == ch) {
				count = count + 1;
			}
		}

		System.out.println("Frequency of 'e' in given name is : " + count);

	}

	public static void main(String[] args) {
		Char_Frequency fr = new Char_Frequency();
		fr.frequencyOfCharacter('e');

	}
}

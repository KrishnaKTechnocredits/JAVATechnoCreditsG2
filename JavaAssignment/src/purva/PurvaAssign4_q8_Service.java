/*WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11*/

package purva;

public class PurvaAssign4_q8_Service {

	// below code calculates no of vowels in each string of array and stores it
	// in count and return to client main class
	int vowelCountinWord(String[] vowelinput) {
		int count = 0;
		for (int index = 0; index < vowelinput.length; index++) {
			for (int temp = 0; temp < vowelinput[index].length(); temp++) {
				if (vowelinput[index].charAt(temp) == 'a' || vowelinput[index].charAt(temp) == 'e'
						|| vowelinput[index].charAt(temp) == 'i' || vowelinput[index].charAt(temp) == 'o'
						|| vowelinput[index].charAt(temp) == 'u') {
					count++;
				}
			}

		}

		return count;
	}

}

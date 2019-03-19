/*WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11*/

package purva;

public class PurvaAssign4_q8_Client {
	public static void main(String[] args) {
		String input = "automation engineering";
		System.out.println("Input :- automation engineering");

		// splits the input string by space and places it in array
		String[] vowelinput = input.split("\\s");

		// calls code which finds vowels in each word of array and returns count
		PurvaAssign4_q8_Service obj1 = new PurvaAssign4_q8_Service();
		int count = obj1.vowelCountinWord(vowelinput);
		System.out.println("Count :- " + count);
	}

}

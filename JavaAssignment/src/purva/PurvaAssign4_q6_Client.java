/*WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet*/

package purva;

public class PurvaAssign4_q6_Client {
	public static void main(String[] args) {
		String[] input = { "all the best", "technocredits", "", "maharashtra" };
		System.out.println("Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}");

		// first finds max length string from given string array
		PurvaAssign4_q6_Service obj1 = new PurvaAssign4_q6_Service();
		String maxlenString = obj1.maxLengthString(input);
		System.out.println("\n" + "Output Max length string :- " + maxlenString);

		// then finds the no of digits in max len string
		PurvaAssign4_q6_Service obj2 = new PurvaAssign4_q6_Service();
		int count = obj2.countofdigitsWord(maxlenString);

		// calls code which reverses max len string
		PurvaAssign4_q6_Service obj3 = new PurvaAssign4_q6_Service();
		String reversemaxlenString = obj3.reverseString(maxlenString, count);
		System.out.println("Max length string reverse value :- " + reversemaxlenString);

	}

}

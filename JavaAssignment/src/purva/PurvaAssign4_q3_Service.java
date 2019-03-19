/*WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. char value :- e
c. count of e :- 5
*/
package purva;

public class PurvaAssign4_q3_Service {

	public int countOfChar(String ip, char ch) {

		// converts input string and character entered by user to lower case
		// before comparing both of them
		ip = ip.toLowerCase();
		ch = Character.toLowerCase(ch);

		// removes space from input string
		String inp = ip.replaceAll("\\s", "");

		// below code checks if character entered by user occurs how many times
		// in input string and stores it in count
		int count = 0;
		for (int index = 0; index < inp.length(); index++) {
			if (ch == inp.charAt(index))
				count++;
		}
		return count;
	}
}

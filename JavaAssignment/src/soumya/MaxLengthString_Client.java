/*
 * This program will find max length string from the given array
 */
package soumya;

public class MaxLengthString_Client {
	public static void main(String[] args) {
		int max = 0;
		MaxLengthString_Service maxLength = new MaxLengthString_Service();
		String str[] = { "all the best", "technocredits", "", "maharashtra" };
		for (int index = 0; index < str.length; index++) {
			int count = maxLength.length(str[index]);
			max = maxLength.maxLength(count);
			System.out.println(str[index] + " " + count + "");
		}
		System.out.println("Maximum length is: " + max);
	}
}

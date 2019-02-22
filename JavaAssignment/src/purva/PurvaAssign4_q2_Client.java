/* WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
This is client class which calls methods written in service class */
 
package purva; 

public class PurvaAssign4_q2_Client {
	public static void main(String[] args) {
		String[] array = { "all the best", "technocredits", "", "maharashtra" };
		System.out.println("Input array:- {\"all the best\",\"technocredits\",\"\",\"maharashtra\"}");
		
		PurvaAssign4_q2_Service obj1 = new PurvaAssign4_q2_Service();

		String ans = obj1.maxString(array);
		System.out.println("\n"+"Maximum length string from given array = " + ans);

	}

}

/*WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”
i. Harsh is not palindrome*/

package purva;

import java.util.Scanner;

public class PurvaAssign4_q12_Client {
	public static void main(String[] args) {
		
		String ans;
		System.out.println("**Program to check if string is palindrome or not**");
		
		do
		{		
			System.out.println("\n"+ "Enter input string: ");
			Scanner sc1 = new Scanner(System.in);
			String input = sc1.next();
			
			//calls palindrome code written in service class
			Purva_Assign4_q12_Service obj1 = new Purva_Assign4_q12_Service();
			obj1.StringIsPalidrome(input);
			
			//asks if you want to continue or end the program
			System.out.println("\n"+"Do you want to continue(yes/no): ");
			Scanner sc2 = new Scanner(System.in);
			ans = sc2.next();			
		}while(ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("yes")  );
		
		if(ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("No"))
		{
			System.out.println("Program has ended!!");
		}
		
	}

}

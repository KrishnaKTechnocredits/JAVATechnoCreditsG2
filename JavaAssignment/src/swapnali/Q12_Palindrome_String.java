package swapnali;

import java.util.Scanner;

public class Q12_Palindrome_String {

	public static void main(String[] args) {
		String name="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		name=scanner.nextLine();
		Q12_Palindrome_String.isStringPalindrome(name);
		
		
	}
	static void isStringPalindrome(String name)
	{
		
		String reverse = "";

		for (int index = name.length() - 1; index >= 0; index--) {
			reverse = reverse + name.charAt(index);
		}
		System.out.println("The reverse string is: "+reverse);
		if(name.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}
}

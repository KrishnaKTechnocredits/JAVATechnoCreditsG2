package shashank;

import java.util.Scanner;

public class PalindromeCheckString_Q12Feb10 
{
	public static void main(String[] args) 
	{
		PalindromeCheckString_Q12Feb10 pcs = new PalindromeCheckString_Q12Feb10();
		System.out.println("Please enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2=pcs.revrseString(str1);
		if (str1.equals(str2))
			System.out.println("Given string is palindrome!");
		else 
			System.out.println("Given string is not palindrome!");
		
	}
	
	String revrseString(String str)
	{
		char charArr[]=str.toCharArray();
		String revStr="";
		//System.out.println("Reverse of the string is : ");
		for (int index=charArr.length-1; index>=0; index--)
		{
			revStr=revStr+charArr[index];
		}
		return revStr;
	}	
		
}

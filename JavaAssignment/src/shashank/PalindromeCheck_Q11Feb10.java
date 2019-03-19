package shashank;

import java.util.Scanner;

public class PalindromeCheck_Q11Feb10 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=ReverseNumber_Q5Feb10.reverseNumber(num1);
		if (num1==num2)
			System.out.println("Given number is palindrome!");
		else 
			System.out.println("Given number is not palindrome!");
		sc.close();
	}
}

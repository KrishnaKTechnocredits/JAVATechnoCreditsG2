package swapnali;

import java.util.Scanner;

public class Q11_Palindrome_Number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of numbers: ");
		int length=scanner.nextInt();
		int number[]=new int[length];
		for(int index=0;index<number.length;index++)
		{
			number[index]=scanner.nextInt();
		}
		scanner.close();
		Q11_Palindrome_Number.display(number);
		
		
	}
	static boolean isNumberPalindrome(int number[])
	{
		
		int reverse[]=new int[number.length];
		int j=0,index=0;
		boolean flag=false;
		for(index=number.length-1;index>0;index--)
		{
			reverse[j]=number[index];
			j++;
			
		}
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==reverse[i])
			{
				flag=true;
			}
		}return flag;
	}
	static void display(int number[])
	{
		boolean flag=isNumberPalindrome(number);
		if(flag==true)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}

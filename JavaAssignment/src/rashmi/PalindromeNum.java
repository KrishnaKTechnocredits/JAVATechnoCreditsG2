package rashmi;

import java.util.Scanner;

public class PalindromeNum 
{
	void palindrome(int num)
	{
		int temp1=0,temp2=0;
		int input=num;
		while(num>0)
		{
			temp1=num%10;
			temp2=temp2*10+temp1;
			num=num/10;
			
		}System.out.print(+temp2  +"  ");
		if(temp2==input)
		{
			System.out.println(+temp2 +"  is a palindrome");
		}
		else
		{
			System.out.println(+temp2 +"  is not a palindrome");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		PalindromeNum obj = new PalindromeNum();
		obj.palindrome(input);
	}

}

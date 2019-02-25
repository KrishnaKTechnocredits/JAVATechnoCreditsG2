package shashank;

import java.util.Scanner;

public class ReverseNumber_Q5Feb10 
{
	static int reverseNumber(int num)
	{		
		int length= String.valueOf(num).length();
		//System.out.println(length);
		int rem=0;
		int numArr[]= new int[length];
		int i=0;
		int revNum=0;
		while(length>0)
		{
			rem=num%10;
			num=num/10;
			numArr[i]=rem;
			length--;
			i++;
		}
		for (int index=0;index<numArr.length;index++)
		{
			revNum=revNum*10+numArr[index];
		}		
		return revNum;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		ReverseNumber_Q5Feb10 sm = new ReverseNumber_Q5Feb10();
		System.out.println("Reverse of the given number is : "+sm.reverseNumber(sc.nextInt()));
	}
		
}

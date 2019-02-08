package shashank;

import java.util.Scanner;

public class LargestThreeNum_Q1Feb03 
{
	void LargeThreeNum()
	{
		System.out.println("Please enter 3 numbers of which largest is to be found: ");
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[3];
		for (int index=0; index<numbers.length; index++)
		{
			numbers[index]=sc.nextInt();
		}
		
		if (numbers[0]>numbers[1] && numbers[0]>numbers[2])
			System.out.println("The greatest number amongst the three is :"+numbers[0]);
		else if (numbers[1]>numbers[2])
			System.out.println("The greatest number amongst the three is :"+numbers[1]);
		else
			System.out.println("The greatest number amongst the three is :"+numbers[2]);
	}
	
	
	public static void main(String[] args) 
	{
		LargestThreeNum_Q1Feb03 lt1= new LargestThreeNum_Q1Feb03();
		lt1.LargeThreeNum();
	}
}

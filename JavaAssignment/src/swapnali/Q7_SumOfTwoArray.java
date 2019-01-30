package swapnali;

import java.util.Scanner;

public class Q7_SumOfTwoArray {
	
	public static void main(String[] args) 
	{
		int num[]=Q8TwoArrayComparision.takeInputFromUser();
		Q8TwoArrayComparision twoArray=new Q8TwoArrayComparision();	
		Q7_SumOfTwoArray.IsTwoArrayAreEqual(num);
		
	}
	
	static void IsTwoArrayAreEqual(int num[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the sum to compare: ");
		int sum=scanner.nextInt();
		System.out.println("Integer number whose sum is equal to: "+sum);
		for(int index=0;index<num.length;index++)
		{
			for(int count=index+1;count<num.length;count++)
			{
				if(num[index]+num[count]==sum)
				{
					System.out.println(+num[index]+" "+num[count]);
					break;
				}
			}
		}
		scanner.close();
	}
	
	
	static int[] takeInputFromUser()
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int size = scanner.nextInt();
		int num[]=new int[size];
		
		for(int index=0;index<num.length;index++)
		{
			num[index]=scanner.nextInt();
		}
		return num;
		
	}

}

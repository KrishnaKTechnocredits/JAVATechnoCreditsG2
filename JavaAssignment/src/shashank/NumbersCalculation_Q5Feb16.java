package shashank;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumbersCalculation_Q5Feb16 
{
	public static void main(String[] args) 
	{
		NumbersCalculation_Q5Feb16 nc = new NumbersCalculation_Q5Feb16();
		System.out.println("Enter any 5 numbers between 1 to 100 : ");
		
		int arr[]= new int[5];
		int i=0;
		while(i<5)
		{
			try{
			Scanner sc = new Scanner(System.in);
			arr[i]=sc.nextInt();
			}
			catch (InputMismatchException im)
			{
				System.out.println("Please enter number only - ");
				Scanner sc = new Scanner(System.in);
				arr[i]=sc.nextInt();
			}
			finally{
				i++;
			}
		}
		nc.numCal(arr);
	}
	
	void numCal(int arr[])
	{
		int sum=0;
		for (int i=0; i<5; i++)
		{
			sum=sum+arr[i];
		}
		float avg=(float)sum/5;
		
		int max=arr[0];
		int secMax=arr[1];
		
		if(max<secMax)
		{
			max=arr[1];
			secMax=arr[0];
		}
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]>max && arr[i]>secMax)
				max=arr[i];
		}
		
		System.out.println("Sum of numbers is: "+sum);
		System.out.println("Average of numbers is: "+avg);
		System.out.println("Highest of numbers is: "+max);
	}
}

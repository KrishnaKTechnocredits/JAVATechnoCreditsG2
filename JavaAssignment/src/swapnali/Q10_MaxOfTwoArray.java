package swapnali;

import java.util.Scanner;

public class Q10_MaxOfTwoArray {

	public static void main(String[] args) 
	{
		int arr1[]=Q10_MaxOfTwoArray.takeInputFromUser();
		int arr2[]=Q10_MaxOfTwoArray.takeInputFromUser();		
		Q8TwoArrayComparision.IsTwoArrayAreEqual(arr1, arr2);			
	}
	//Method to check the two array are equal and print the max at diifer
	static void IsTwoArrayAreEqual(int arr1[],int arr2[])
	{
		for (int index = 0; index < arr1.length; index++) 
		{
			if (arr1[index] != arr2[index]) 
			{
				System.out.println("Values are not matching at index " + index);
				if(arr1[index]>arr2[index])
				{
					int max = arr1[index];
					System.out.println("From"+ arr1[index]+" "+arr2[index]+" max value is "+max);
				}
				else
				{
					int max = arr2[index];
					System.out.println("From"+ arr1[index]+","+arr2[index]+" max value is "+max);
				}
			}
		}
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

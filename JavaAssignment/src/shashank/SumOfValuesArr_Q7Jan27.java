package shashank;

import java.util.Scanner;

//Program to find all pairs of integer array whose sum is equal to given number
public class SumOfValuesArr_Q7Jan27 
{
	void sumOfValues(int num[], int sum)
	{
		for (int index1=0; index1<num.length; index1++)
		{
			for (int index2=index1+1; index2<num.length; index2++)
			{
				if(num[index1]+num[index2]==sum)
					System.out.println("("+num[index1]+","+num[index2]+")="+sum);
			}
		}
			
	}
	public static void main(String[] args) 
	{
		SumOfValuesArr_Q7Jan27 sva = new SumOfValuesArr_Q7Jan27();
		int tempArr[]=UserInputArrayConverter.takeInputFromUserInt();
		System.out.println("Enter the required sum: ");
		Scanner sc=new Scanner(System.in);  //takes input of required sum
		int sum=sc.nextInt();
		sva.sumOfValues(tempArr, sum);
		sc.close();
	}
}

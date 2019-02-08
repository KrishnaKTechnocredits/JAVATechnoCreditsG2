package shashank;

import java.util.Scanner;

//Program to check if array contains a particular number
public class CheckNumInArr_Q3Jan27 
{
	static void checkNum(int num[], int n)
	{
		boolean flag=false;
		for (int index=0; index<num.length; index++)
		{
			if (num[index]==n)
			{
				flag=true;
				break;
			}
		}
		if (flag==false) 
			System.out.println("Number "+n+" is not present in the array");
		else 
			System.out.println("Number "+n+" is present in the array");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number to be searched in given array is : ");
		int number=sc.nextInt();
		checkNum(UserInputArrayConverter.takeInputFromUserInt(), number);
		sc.close();
	}
}

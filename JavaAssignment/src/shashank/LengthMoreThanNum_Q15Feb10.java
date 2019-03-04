package shashank;

import java.util.Scanner;

public class LengthMoreThanNum_Q15Feb10 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of strings to input : ");
		Scanner sc = new Scanner(System.in);
		int numOfStrings=sc.nextInt();
		System.out.println("Enter Strings: ");
		String strArr[]= new String[numOfStrings];
		for(int i=0; i<strArr.length; i++)
		{
			strArr[i]=sc.next();
		}
		System.out.println("Enter the length of which strings are to be found : ");
		LengthMoreThanNum_Q15Feb10 lmt = new LengthMoreThanNum_Q15Feb10();
		String[] outputArr = lmt.lengthOfString(strArr,sc.nextInt());
		for(int i=0; i<outputArr.length; i++)
		{
			if(!outputArr[i].equals(""))
				System.out.print(outputArr[i]+"\t");
		}
	}
	
	String[] lengthOfString(String strArr[], int num)
	{
		String outputArr[]=new String[strArr.length];
		for(int i=0; i<strArr.length; i++)
		{
			if(strArr[i].length()>=num)
			{
				outputArr[i]=strArr[i];
			}
			else 
				outputArr[i]="";
		}
		return outputArr;
		
	}
}


package shashank;

import java.util.Scanner;

public class MaxLengthString_Q2Feb10 
{
		
	String findMaxLengthString(String strArr[])
	{
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string : ");
		String str2 = sc.nextLine();
		System.out.println("Enter third string : ");
		String str3 = sc.nextLine();*/
		String lenghtiest=strArr[0];
		String secondLenghtiest=strArr[1];
		if (strArr[0].length()<strArr[1].length())
		{
			lenghtiest=strArr[1];
			secondLenghtiest=strArr[0];
		}
		
		for (int index=2; index<strArr.length; index++)
		{
			if (strArr[index].length()>strArr[0].length() && strArr[index].length()>strArr[1].length())
				lenghtiest=strArr[index];
		}
		System.out.println("\""+lenghtiest+"\" is the lenghist string!");
		return lenghtiest;
	}
	
	public static void main(String[] args) 
	{
		MaxLengthString_Q2Feb10 mls = new MaxLengthString_Q2Feb10();
		mls.findMaxLengthString(UserInputArrayConverter.takeInputFromUserStr());
	}
}

package swapnali;

import java.util.Scanner;

public class Q3_ArrayNumbersContain {
	
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number you want to search: ");
		int key=scanner.nextInt();
		int num[]=new InputOutputOperation().takeInputFromUser();
		scanner.close();
		//To print the result
		boolean flag=findArrayNumber(num,key);
		if(flag==true)
			System.out.println("Number is in array");
		else
			System.out.println("Number is not in array.");
	}
	
	//Method to search the number in an array
	static boolean findArrayNumber(int num[],int key)
	{
		boolean flag=false;
		for(int index=0;index<num.length;index++)
		{
			if(num[index]==key)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}

}


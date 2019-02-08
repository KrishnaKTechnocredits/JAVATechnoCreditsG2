package swapnali;

import java.util.Scanner;

public class InputOutputOperation {
	//Method to take input from user
	int[] takeInputFromUser()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int dupNum=scanner.nextInt();
			
		int num[]= new int[dupNum];
		
		for(int index=0;index<num.length;index++)
		{
			num[index]=scanner.nextInt();
		}
		scanner.close();
		return num;
	}
}

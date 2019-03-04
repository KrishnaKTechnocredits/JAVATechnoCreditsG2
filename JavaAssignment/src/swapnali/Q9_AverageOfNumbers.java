package swapnali;

import java.util.Scanner;

public class Q9_AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int length=scanner.nextInt();
		int number[]=new int[length];
		for(int index=0;index<number.length;index++)
		{
			number[index]=scanner.nextInt();
		}
		scanner.close();
		Q9_AverageOfNumbers.sumOfNumber(number);
	}

	static void sumOfNumber(int number[])
	{
		float sum=0;
		float average=0;
		for(int index=0;index<number.length;index++)
		{
			sum=sum+number[index];
			
		}
		average=sum/number.length;
		System.out.println(average);
	}
}

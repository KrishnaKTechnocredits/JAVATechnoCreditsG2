package swapnali;

import java.util.Scanner;

public class Q1_PositiveNegativeNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count of numbers in array: ");
		int length=scanner.nextInt();
		int numbers[]=new int[length];
		for(int index=0;index<numbers.length;index++)
		{
			numbers[index]=scanner.nextInt();
		}
		scanner.close();
		Q1_PositiveNegativeNumbers.printPositiveNumbers(numbers);
		Q1_PositiveNegativeNumbers.printNegativeNumbers(numbers);
				
		
	}
	
	static void printPositiveNumbers(int numbers[])
	{
		int psum=0,j=0;
		int positive[]=new int[4];
		
		
		for(int index=0;index<numbers.length;index++)
		{
			if(numbers[index]>0)
			{	
				positive[j]=numbers[index];
				psum=psum+numbers[index];
				j++;
			}
						
		}
		for(int count=0;count<positive.length;count++)
		{
			System.out.print(positive[count]+" ");
		}
		
		System.out.println("The sum of positive numbers is: "+psum);
				
	}
	
	static void printNegativeNumbers(int numbers[])
	{
		int nsum=0,j=0;
		int negative[]=new int[4];
		
		for(int index=0;index<numbers.length;index++)
		{
			if(numbers[index]<0)
			{	
				negative[j]=numbers[index];
				nsum=nsum+numbers[index];
				j++;
			}
			
		}System.out.println("The sum of negative numbers is: "+nsum);
		for(int count=0;count<negative.length;count++)
		{
			System.out.print(negative[count]+" ");
		}
		
	}
	
}

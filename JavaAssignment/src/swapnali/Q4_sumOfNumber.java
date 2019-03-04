package swapnali;

import java.util.Scanner;

public class Q4_sumOfNumber {

	public static void main(String[] args) {
		Q4_sumOfNumber sumofnumber=new Q4_sumOfNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int length=scanner.nextInt();
		int number[]=new int[length];
		for(int index=0;index<number.length;index++)
		{
			number[index]=scanner.nextInt();
		}
		scanner.close();
		sumofnumber.sumOfNumber(number);
		
	}
	void sumOfNumber(int number[])
	{
		int sum=0;
		for(int index=0;index<number.length;index++)
		{
			sum=sum+number[index];
			
		}
		System.out.println(sum);
	}

}
